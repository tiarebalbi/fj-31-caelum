package br.com.caelum.exercicios;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.exercicios.models.Livro;

public class TestaEscritaDeObjetos {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("livros.txt"));
		
		Livro l1 = new Livro();
		l1.setNome("Livro 1");
		l1.setPreco("31.00");
 		
		Livro l2 = new Livro();
		l2.setNome("Livro 2");
		l2.setPreco("32.00");
		
		Livro l3 = new Livro();
		l3.setNome("Livro 3");
		l3.setPreco("33.00");
		
		List<Livro> livros = new ArrayList<Livro> ();
		livros.add(l1);
		livros.add(l2);
		livros.add(l3);
		
		oos.writeObject(livros);
		oos.close();
		
	}
	
}
