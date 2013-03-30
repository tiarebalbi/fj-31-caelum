package br.com.caelum.exercicios.models;

import java.io.Serializable;

public class Livro implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private transient String nome;
	
	private String preco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	
	@Override
	public String toString() {
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("Nome do Livro: " + this.nome + "  \n");
		buffer.append("Preço: " + this.preco + "  \n");
		buffer.append("-----------------------------------");
		
		return buffer.toString();
	}
}
