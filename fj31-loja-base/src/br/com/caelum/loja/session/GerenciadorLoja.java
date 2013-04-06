package br.com.caelum.loja.session;

import br.com.caelum.loja.entity.Livro;

public interface GerenciadorLoja {
	
	Livro procura(String isbn);
	
}
