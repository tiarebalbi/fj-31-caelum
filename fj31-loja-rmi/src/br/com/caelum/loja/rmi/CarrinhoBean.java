/**
 * 
 */
package br.com.caelum.loja.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ejb3309
 *
 */
public class CarrinhoBean extends UnicastRemoteObject implements Carrinho {

	private double total;
	
	private List<Livro> livros = new ArrayList<>();
	
	
	protected CarrinhoBean() throws RemoteException {
		super();
	}

	private static final long serialVersionUID = 1L;

	/* (non-Javadoc)
	 * @see br.com.caelum.loja.rmi.Carrinho#addLivro(br.com.caelum.loja.rmi.Livro)
	 */
	@Override
	public void addLivro(Livro livro) throws RemoteException {
		livros.add(livro);
		this.total += livro.getPreco();
		System.out.printf("Livros %s adicionado com sucesso! \n", livro.getNome());
	}

	/* (non-Javadoc)
	 * @see br.com.caelum.loja.rmi.Carrinho#getLivros()
	 */
	@Override
	public List<Livro> getLivros() throws RemoteException {
		return this.livros;
	}

	/* (non-Javadoc)
	 * @see br.com.caelum.loja.rmi.Carrinho#getTotal()
	 */
	@Override
	public double getTotal() throws RemoteException {
		return this.total;
	}

}
