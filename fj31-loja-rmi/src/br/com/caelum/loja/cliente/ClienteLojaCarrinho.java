package br.com.caelum.loja.cliente;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import br.com.caelum.loja.rmi.Carrinho;
import br.com.caelum.loja.rmi.Livro;

public class ClienteLojaCarrinho {
	
	
	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		Carrinho carrinho = (Carrinho) Naming.lookup("rmi://localhost:1099/loja/carrinho");
		
		Livro l1 = new Livro();
		l1.setNome("Livro 1");
		l1.setPreco(31.00);
 		
		Livro l2 = new Livro();
		l2.setNome("Livro 9999");
		l2.setPreco(9932.00);
		
		carrinho.addLivro(l1);
		carrinho.addLivro(l2);
		
		System.out.println("Total: " + carrinho.getTotal());
		System.out.println("Class: " + carrinho.getClass());
	}
}
