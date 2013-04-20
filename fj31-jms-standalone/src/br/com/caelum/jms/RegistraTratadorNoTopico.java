package br.com.caelum.jms;

import java.util.Properties;
import java.util.Scanner;

import javax.jms.JMSException;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicSubscriber;
import javax.jms.TopicSession;
import javax.jms.Session;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class RegistraTratadorNoTopico {
	
	
	public static void main(String[] args) throws NamingException, JMSException {
		Properties jndiProperties = new Properties();
		
		jndiProperties.put(Context.SECURITY_PRINCIPAL, "jms");
		jndiProperties.put(Context.SECURITY_CREDENTIALS, "caelum");
		
		InitialContext ic = new InitialContext(jndiProperties);
		
		TopicConnectionFactory qcf = (TopicConnectionFactory) ic.lookup("jms/RemoteConnectionFactory");
		TopicConnection qc = qcf.createTopicConnection("jms", "caelum");
		TopicSession qs = qc.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
		
		Topic topic = (Topic) ic.lookup("jms/topic/loja");
//		qs.createSubscriber(topic, "comDestinatario = 'financeiro'", true);
		
		TopicSubscriber qr = qs.createSubscriber(topic);
		qr.setMessageListener(new TratadorDeMensagem());
		
		qc.start();
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Esperando as mensagens no topic JMS \nAperte Enter para parar");
		teclado.nextLine();
		teclado.close();
		
		qc.close();
		
	}
	

}
