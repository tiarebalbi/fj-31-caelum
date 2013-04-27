package br.com.caelum.cliente.programa;

import br.com.caelum.cliente.CalculadorDeParcela;
import br.com.caelum.cliente.CalculadorDeParcelaService;

public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CalculadorDeParcela calculador = new CalculadorDeParcelaService().getCalculadorDeParcelaPort();
		System.out.println(calculador.calculaParcela(100, 2));
	}

}
