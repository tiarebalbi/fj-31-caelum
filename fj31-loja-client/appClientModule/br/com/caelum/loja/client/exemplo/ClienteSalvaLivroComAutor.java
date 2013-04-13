package br.com.caelum.loja.client.exemplo;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.caelum.loja.entity.Autor;
import br.com.caelum.loja.entity.Livro;
import br.com.caelum.loja.session.GerenciadorLoja;

public class ClienteSalvaLivroComAutor {

	/**
	 * @param args
	 * @throws NamingException 
	 */
	public static void main(String[] args) throws NamingException {
		InitialContext ic = new InitialContext();
		
		GerenciadorLoja gl = (GerenciadorLoja) ic.lookup("ejb:fj31-loja-ear/fj31-loja-ejb3/GerenciadorLojaBean!br.com.caelum.loja.session.GerenciadorLoja");
		
		
		Autor autor = new Autor();
		autor.setNome("Tiare Balbi");
		
		Livro livro = new Livro();
		livro.setNome("Pro Caelum 3.0");
		
		autor = gl.salva(autor);
		System.out.println("ID do autor: " + autor.getId());
		
		livro.getAutores().add(autor);
		
		gl.salva(livro);
		
	}

}
