package br.com.cursoadf.sessionbean;

import javax.ejb.Local;

@Local
public interface OlaMundoSessionBeanLocal {
	public String olaMundo(String nome);

}
