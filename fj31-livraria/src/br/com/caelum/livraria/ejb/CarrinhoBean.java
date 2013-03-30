package br.com.caelum.livraria.ejb;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateful;

import br.com.caelum.livraria.modelo.Livro;

@Stateful
@Remote(Carrinho.class)
public class CarrinhoBean implements Carrinho{
	
	private List<Livro> livros = new ArrayList<>();
	private double total = 0d;

	@Override
	public void addLivro(Livro livro) throws RemoteException {
		System.out.println("Adicionado livro " + livro.getNome() + " ao carrinho!");
		this.livros.add(livro);
		this.total += livro.getPreco();
	}

	@Override
	public List<Livro> getLivros() throws RemoteException {
		System.out.println("Carrinho devolvendo a lista de livros: ");
		return this.livros;
	}

	@Override
	public double getTotal() throws RemoteException {
		System.out.println("Carrinho total: " + this.total);
		return this.total;
	}

	@Override
	public void finalizarCompra() {
		System.out.println("Finalizando a compra de: ");
		for(Livro l  : this.livros) {
			l.toString();
		}
	}

}
