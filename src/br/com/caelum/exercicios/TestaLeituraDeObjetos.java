package br.com.caelum.exercicios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import br.com.caelum.exercicios.models.Livro;

public class TestaLeituraDeObjetos {

	
	public static void main (String[] args) throws ClassNotFoundException, FileNotFoundException, IOException {
		List<Livro> livros = (List<Livro>) new ObjectInputStream(new FileInputStream("livros.txt")).readObject();
		
		for (Livro livro : livros) {
			System.out.println(livro.toString());
		}
		
		new ObjectInputStream(new FileInputStream("livros.txt")).close();
		
	}
	
}
