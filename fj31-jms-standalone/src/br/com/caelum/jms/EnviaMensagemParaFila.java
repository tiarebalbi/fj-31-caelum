package br.com.caelum.jms;

import java.util.Calendar;
import java.util.Properties;

import javax.jms.JMSException;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class EnviaMensagemParaFila {

	public static void main(String[] args) throws NamingException, JMSException {
		Properties jndiProperties = new Properties();
		
		jndiProperties.put(Context.SECURITY_PRINCIPAL, "jms");
		jndiProperties.put(Context.SECURITY_CREDENTIALS, "caelum");
		
		InitialContext ic = new InitialContext(jndiProperties);
		
		QueueConnectionFactory qcf = (QueueConnectionFactory) ic.lookup("jms/RemoteConnectionFactory");
		QueueConnection qc = qcf.createQueueConnection("jms", "caelum");
		QueueSession qs = qc.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
		
		for(int i=0; i<1000000;i++) {
		
		TextMessage tm = qs.createTextMessage();
		tm.setText(Calendar.getInstance().getTime() + "  - Mensagem de texto para uma Queue " + i);
		
		Queue queue = (Queue) ic.lookup("jms/queue/loja");
		
		QueueSender sender = qs.createSender(queue);
		sender.send(tm);
		}
		qc.close();
		
	}
	
}
