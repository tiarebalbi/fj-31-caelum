package br.com.caelum.loja.session;

import javax.annotation.Resource;
import javax.ejb.Remote;
import javax.ejb.Schedule;
import javax.ejb.ScheduleExpression;
import javax.ejb.Stateless;
import javax.ejb.Timeout;
import javax.ejb.Timer;
import javax.ejb.TimerConfig;
import javax.ejb.TimerService;

@Stateless @Remote(value=Agendador.class)
public class AgendadorBean implements Agendador {

	@Resource
	private TimerService service;
	
	@Override
	public void agenda(String expressaoMinutos, String expressaoSegundos) {
		ScheduleExpression expression = new ScheduleExpression();
		expression.hour("*");
		expression.minute(expressaoMinutos);
		expression.second(expressaoSegundos);
		
		TimerConfig config = new TimerConfig();
		config.setInfo(expression.toString());
		config.setPersistent(false);
		
		this.service.createCalendarTimer(expression, config);
		
		System.out.println("Agendamento: " + expression);
	}

	@Timeout
	public void realizaTransacaoBancaria(Timer timer) {
		System.out.println("Executou: " + timer.getInfo());
	}
	
	@Schedule(hour="*", minute="*", second="5,15,20", persistent=false)
	public void fazAlgo(Timer timer) {
		System.out.println("Executou: @Schedule");
	}
	
}
