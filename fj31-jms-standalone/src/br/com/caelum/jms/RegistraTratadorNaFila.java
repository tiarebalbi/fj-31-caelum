package br.com.caelum.jms;

import java.util.Properties;
import java.util.Scanner;

import javax.jms.JMSException;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueReceiver;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class RegistraTratadorNaFila {
	
	
	public static void main(String[] args) throws NamingException, JMSException {
		Properties jndiProperties = new Properties();
		
		jndiProperties.put(Context.SECURITY_PRINCIPAL, "jms");
		jndiProperties.put(Context.SECURITY_CREDENTIALS, "caelum");
		
		InitialContext ic = new InitialContext(jndiProperties);
		
		QueueConnectionFactory qcf = (QueueConnectionFactory) ic.lookup("jms/RemoteConnectionFactory");
		QueueConnection qc = qcf.createQueueConnection("jms", "caelum");
		QueueSession qs = qc.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
		
		Queue q = (Queue) ic.lookup("jms/queue/loja");
		
		QueueReceiver qr = qs.createReceiver(q);
		qr.setMessageListener(new TratadorDeMensagem());
		
		qc.start();
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Esperando as mensagens na fila JMS \n Aperte Enter para parar");
		teclado.nextLine();
		teclado.close();
		
		qc.close();
		
	}
	

}
