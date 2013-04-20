package br.com.caelum.jms;

import java.util.Calendar;
import java.util.Properties;

import javax.jms.JMSException;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicPublisher;
import javax.jms.TopicSession;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class EnviaMensagemParaTopico {

	public static void main(String[] args) throws NamingException, JMSException {
		Properties jndiProperties = new Properties();
		
		jndiProperties.put(Context.SECURITY_PRINCIPAL, "jms");
		jndiProperties.put(Context.SECURITY_CREDENTIALS, "caelum");
		
		InitialContext ic = new InitialContext(jndiProperties);
		
		TopicConnectionFactory qcf = (TopicConnectionFactory) ic.lookup("jms/RemoteConnectionFactory");
		TopicConnection qc = qcf.createTopicConnection("jms", "caelum");
		TopicSession qs = qc.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
		
		for(int i = 0 ; i<10000; i++) {
		TextMessage tm = qs.createTextMessage();
		tm.setText(Calendar.getInstance().getTime() + " - Mensagem de texto para um Topic financeiro" + i);
		
		
		TextMessage tm2 = qs.createTextMessage();
		tm2.setText(Calendar.getInstance().getTime() + " - Mensagem de texto para um Topic aaa " + i);
		
		
		Topic Topic = (Topic) ic.lookup("jms/topic/loja");
		
		TopicPublisher publisher = qs.createPublisher(Topic);
		publisher.send(tm);
		publisher.send(tm2);
		}
		qc.close();
		
	}
	
}
