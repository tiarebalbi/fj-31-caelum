package br.com.caelum.loja.client.exemplo;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.caelum.loja.entity.Livro;
import br.com.caelum.loja.session.Carrinho;

public class ClienteCarrinho {
	public static void main(String[] args) throws NamingException {
		InitialContext ic = new InitialContext();
		Carrinho carrinho = (Carrinho)ic.lookup("ejb:fj31-loja-ear/fj31-loja-ejb3/CarrinhoBean!br.com.caelum.loja.session.Carrinho?stateful");
		
		Livro l1 = new Livro();
		l1.setNome("Fausto");
		l1.setPreco(150);
		
		carrinho.addLivro(l1);
		
		Livro l2 = new Livro();
		l2.setNome("Pais e Filhos");
		l2.setPreco(55);
		
		carrinho.addLivro(l2);
		
		System.out.println("Total: " + carrinho.getTotal());
		
		carrinho.finalizaCompra();
	}
}
