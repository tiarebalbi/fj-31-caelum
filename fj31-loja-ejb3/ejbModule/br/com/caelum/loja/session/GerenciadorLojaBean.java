package br.com.caelum.loja.session;

import java.util.HashMap;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import br.com.caelum.loja.entity.Livro;

@Stateless
@Remote(GerenciadorLoja.class)
public class GerenciadorLojaBean implements GerenciadorLoja {
	
	
	private HashMap<String, Livro> repositorio;


	public GerenciadorLojaBean() {
		this.repositorio = new HashMap<>();
		
		Livro l1 = new Livro();
		l1.setNome("Livro 1");
		l1.setPreco(13);
		
		Livro l2 = new Livro();
		l2.setNome("Livro 2");
		l2.setPreco(22);
		
		this.repositorio.put("1111", l1);
		this.repositorio.put("2222", l2);
		
	}

	@Override
	public Livro procura(String isbn) {
		return this.repositorio.get(isbn);
	}

}
