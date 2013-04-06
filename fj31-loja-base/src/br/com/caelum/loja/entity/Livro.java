package br.com.caelum.loja.entity;

import java.io.Serializable;

public class Livro implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	private double preco;
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("[Livro: " + this.getNome() + " - " + "Preço: " + this.getPreco() + "]");
		return buffer.toString();
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
