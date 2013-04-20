package br.com.caelum.loja.session;

import java.util.HashMap;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.interceptor.ExcludeDefaultInterceptors;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.caelum.loja.entity.Autor;
import br.com.caelum.loja.entity.Livro;
import br.com.caelum.loja.exception.SalvaLivroException;
import br.com.caelum.loja.interceptor.AuditoriaInterceptor;

@Stateless
@Remote(GerenciadorLoja.class)
@Interceptors(value=AuditoriaInterceptor.class)
public class GerenciadorLojaBean implements GerenciadorLoja {
	
	
	private HashMap<String, Livro> repositorio;
	
	@PersistenceContext
	private EntityManager manager;

	public GerenciadorLojaBean() {
		this.repositorio = new HashMap<>();
		
		Livro l1 = new Livro();
		l1.setNome("Livro 1");
		l1.setPreco(13);
		
		Livro l2 = new Livro();
		l2.setNome("Livro 2");
		l2.setPreco(22);
		
		this.repositorio.put("1111", l1);
		this.repositorio.put("2222", l2);
		
	}

	@Override
	public Livro procura(String isbn) {
		return this.repositorio.get(isbn);
	}

	@Override
	public void salva(Livro livro) {
		this.manager.persist(livro);
		System.out.println("Livro salvo! ID: " + livro.getId());
	}

	@Override
	public Autor salva(Autor autor) {
		this.manager.persist(autor);
		System.out.println("Autor salvo! ID: " + autor.getId());
		return autor;
	}

	@Override
	@ExcludeDefaultInterceptors
	public Livro procura(Long id) {
		return this.manager.find(Livro.class, id);
	}

	@Override
	public List<Autor> getAutoresDoLivro(Livro livro) {
		Query query = this.manager.createQuery("SELECT l.autores FROM Livro l WHERE l.nome LIKE :nome");
		query.setParameter("nome", "%"+livro.getNome()+"%");
		return query.getResultList();
	}

}
