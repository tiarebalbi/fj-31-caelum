package br.com.caelum.loja.session;

import java.util.List;

import br.com.caelum.loja.entity.Livro;

public interface Carrinho {
	void addLivro(Livro livro);
	
	List<Livro> getLivros();
	
	double getTotal();
	
	void finalizaCompra();
}
