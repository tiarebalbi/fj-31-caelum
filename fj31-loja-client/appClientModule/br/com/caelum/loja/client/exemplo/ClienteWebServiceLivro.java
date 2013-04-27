package br.com.caelum.loja.client.exemplo;

import java.util.List;

import br.com.caelum.ws.ConsultaDeLivrosBean;
import br.com.caelum.ws.ConsultaDeLivrosBeanService;
import br.com.caelum.ws.Livro;

public class ClienteWebServiceLivro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConsultaDeLivrosBean livro = new ConsultaDeLivrosBeanService().getConsultaDeLivrosBeanPort();
		List<Livro> info = livro.buscaLivro("Tes");
		
		System.out.println(info.size());
		
		
	}

}
