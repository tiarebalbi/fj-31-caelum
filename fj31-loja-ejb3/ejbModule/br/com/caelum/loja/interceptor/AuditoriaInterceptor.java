package br.com.caelum.loja.interceptor;

import java.util.Arrays;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class AuditoriaInterceptor {

	@AroundInvoke
	public Object log(InvocationContext context) throws Exception {
		
		String classe = context.getTarget().getClass().getSimpleName();
		String metodo = context.getMethod().getName();
		String params = Arrays.toString(context.getMethod().getParameterTypes());
		
		System.out.println("***** Auditoria ******");
		System.out.println("Acessando: " + classe +  " metodo: " + metodo + " params: " + params);
		
		return context.proceed();
	}
	
}
