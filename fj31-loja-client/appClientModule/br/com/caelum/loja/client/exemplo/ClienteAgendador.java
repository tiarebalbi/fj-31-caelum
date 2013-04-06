package br.com.caelum.loja.client.exemplo;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.caelum.loja.session.Agendador;

public class ClienteAgendador {
	public static void main(String[] args) throws NamingException {
		InitialContext ic = new InitialContext();
		Agendador agenda = (Agendador) ic.lookup("ejb:fj31-loja-ear/fj31-loja-ejb3/AgendadorBean!br.com.caelum.loja.session.Agendador");
		
		agenda.agenda("*", "10");
	}
}