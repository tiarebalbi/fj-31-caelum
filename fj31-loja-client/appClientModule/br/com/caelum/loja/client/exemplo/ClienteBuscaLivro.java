package br.com.caelum.loja.client.exemplo;

import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.caelum.loja.entity.Autor;
import br.com.caelum.loja.entity.Livro;
import br.com.caelum.loja.session.GerenciadorLoja;

public class ClienteBuscaLivro {

	/**
	 * @param args
	 * @throws NamingException 
	 */
	public static void main(String[] args) throws NamingException {
		InitialContext ic = new InitialContext();
		
		GerenciadorLoja gl = (GerenciadorLoja) ic.lookup("ejb:fj31-loja-ear/fj31-loja-ejb3/GerenciadorLojaBean!br.com.caelum.loja.session.GerenciadorLoja");
		Livro livro = gl.procura(7L);
		System.out.println(livro);
//		List<Autor> autores = livro.getAutores();
		List<Autor> autores = gl.getAutoresDoLivro(livro);
		for (Autor autor : autores) {
			System.out.println(autor.getNome());
		}
		
	}

}
