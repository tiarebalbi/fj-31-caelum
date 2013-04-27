package br.com.caelum.loja.ws;

import java.util.List;

import br.com.caelum.loja.entity.Livro;

public interface ConsultaDeLivros {
	
	List<Livro> buscaLivro(String nome);
	
}
