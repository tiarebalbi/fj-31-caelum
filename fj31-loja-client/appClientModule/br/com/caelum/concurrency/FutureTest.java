package br.com.caelum.concurrency;

import java.util.Calendar;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import br.com.caelum.loja.entity.Livro;

public class FutureTest {

	/**
	 * @param args
	 * @throws InterruptedException 
	 * @throws ExecutionException 
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Calculo calc = new Calculo();
		Future<Livro> retorno = calc.calcularTask("Teste");
		
		while (true) {
			if(retorno.isDone()) {
				System.out.println("Completou");
				break;
			}
			System.out.println(Calendar.getInstance().getTime());
			System.out.println(retorno.get().getNome());
		}
		
		
	}

}
