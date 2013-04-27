package br.com.caelum.loja.session;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.caelum.loja.entity.Livro;
import br.com.caelum.loja.ws.ConsultaDeLivros;

@Stateless
@WebService
@Remote(ConsultaDeLivros.class)
public class ConsultaDeLivrosBean implements ConsultaDeLivros {

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	@WebMethod
	public List<Livro> buscaLivro(@WebParam(name="nome") String nome) {
		Query query = this.em.createQuery("SELECT l FROM Livro as l LEFT JOIN FETCH l.autores WHERE l.nome like :nome");
		query.setParameter("nome", "%" +nome+ "%");
		return query.getResultList();
	}


}
