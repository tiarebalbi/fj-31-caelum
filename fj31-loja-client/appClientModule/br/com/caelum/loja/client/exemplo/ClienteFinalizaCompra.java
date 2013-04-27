package br.com.caelum.loja.client.exemplo;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.caelum.loja.entity.Livro;
import br.com.caelum.loja.session.Carrinho;

public class ClienteFinalizaCompra {
	
	public static void main(String[] args) throws NamingException {
		InitialContext ic = new InitialContext();
		
		Carrinho carrinho  = (Carrinho) ic.lookup("ejb:fj31-loja-ear/fj31-loja-ejb3/CarrinhoBean!br.com.caelum.loja.session.Carrinho?stateful");
		
		Livro livro1 = new Livro();
		livro1.setNome("Pro Caelum 3.1");
		Livro livro2 = new Livro();
		livro2.setNome("Pro Caelum 3.2");
		Livro livro3 = new Livro();
		livro3.setNome("Pro Caelum 3.3");
		carrinho.addLivro(livro1);
		carrinho.addLivro(livro2);
		carrinho.addLivro(livro3);
		
		carrinho.finalizaCompra();
		
	}

}
