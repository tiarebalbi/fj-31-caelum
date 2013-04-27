package br.com.caelum.concurrency;

import java.util.concurrent.Future;

import javax.ejb.AsyncResult;

import br.com.caelum.loja.entity.Livro;

public class Calculo {
	
	public Future<Livro> calcularTask (String info) throws InterruptedException {
		
		Livro livro = new Livro();
		livro.setNome("Infoo");
		System.out.println("Livro logandoooo");
		Thread.sleep(1000000);
		return new AsyncResult<Livro>(livro);
	}
	

}
