package br.com.caelum.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class TratadorDeMensagem implements MessageListener {

	@Override
	public void onMessage(Message msg) {
		TextMessage tm = (TextMessage) msg;
		try {
			System.out.println(tm.getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

}
