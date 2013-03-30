package br.com.caelum.livraria.ejb;

import java.rmi.RemoteException;
import java.util.List;

import br.com.caelum.livraria.modelo.Livro;

public interface Carrinho {

	void addLivro(Livro livro) throws RemoteException;
	
	List<Livro> getLivros() throws RemoteException;
	
	double getTotal() throws RemoteException;
	
	void finalizarCompra();
	
}
