package br.com.caelum.loja.client.exemplo;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.caelum.loja.entity.Livro;
import br.com.caelum.loja.session.GerenciadorLoja;

public class ClienteProcuraLivro {

	/**
	 * @param args
	 * @throws NamingException 
	 */
	public static void main(String[] args) throws NamingException {
		InitialContext ic = new InitialContext();
		GerenciadorLoja gl = (GerenciadorLoja) ic.lookup("ejb:fj31-loja-ear/fj31-loja-ejb3/GerenciadorLojaBean!br.com.caelum.loja.session.GerenciadorLoja");
		
		Livro livro = gl.procura("1111");
		Livro livro2 = gl.procura("2222");
		
		if(livro != null) {
			System.out.println("Foi encontrado o livro: " + livro.getNome());
			System.out.println("Foi encontrado o livro2: " + livro2.getNome());
		}else {
			System.out.println("Não foi encontrado nenhum livro");
		}
	}

}
