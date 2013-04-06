package br.com.caelum.loja.session;

import java.util.List;

import br.com.caelum.loja.entity.Livro;

public interface Mensageiro {
	
	void enviaMensagem(List<Livro> livros);

}
