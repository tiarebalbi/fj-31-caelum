package br.com.caelum.loja.client.exemplo;

import br.com.caelum.loja.entity.Livro;

public class ClienteFazendoChamadaLocal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Livro livro = new Livro();
		
		long inicio = System.currentTimeMillis();
		
		for(float i=0;i<1000000000;i++) {
			livro.getPreco();
		}
		
		long fim = System.currentTimeMillis();
		
		System.out.println(fim - inicio);
	}

}
