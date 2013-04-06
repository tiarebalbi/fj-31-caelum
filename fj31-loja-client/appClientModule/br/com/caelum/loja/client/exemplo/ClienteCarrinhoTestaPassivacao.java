package br.com.caelum.loja.client.exemplo;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.caelum.loja.entity.Livro;
import br.com.caelum.loja.session.Carrinho;

public class ClienteCarrinhoTestaPassivacao {
	
	public static void main(String[] args) throws NamingException, InterruptedException {
		InitialContext ic = new InitialContext();
		Carrinho carrinho = (Carrinho) ic.lookup("ejb:fj31-loja-ear/fj31-loja-ejb3/CarrinhoBean!br.com.caelum.loja.session.Carrinho");
		
		Livro l1 = new Livro();
		l1.setNome("Fausto");
		l1.setPreco(150);
		
		carrinho.addLivro(l1);
		
		Carrinho carrinhoFor = (Carrinho) ic.lookup("ejb:fj31-loja-ear/fj31-loja-ejb3/CarrinhoBean!br.com.caelum.loja.session.Carrinho?stateful");
		for(int i = 0; i<10; i++) {
			carrinhoFor.addLivro(l1);
			System.out.println("Total: " + carrinhoFor.getTotal()  + " - Total deveria ser: 1500");
		}
		
		carrinho.addLivro(l1);
		System.out.println("2 * Total: " + carrinho.getTotal()  + " - Total deveria ser: 300");
		
	}

}
