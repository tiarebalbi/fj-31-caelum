package br.com.caelum.loja.exception;

import javax.ejb.ApplicationException;

@ApplicationException(rollback=true)
public class SalvaLivroException extends RuntimeException {

	private static final long serialVersionUID = -6655406545484452020L;

}
