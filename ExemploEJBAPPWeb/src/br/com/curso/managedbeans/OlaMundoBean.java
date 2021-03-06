package br.com.curso.managedbeans;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.com.cursoadf.sessionbean.OlaMundoSessionBeanLocal;

@ManagedBean(name = "olaMundo")
@RequestScoped
public class OlaMundoBean {

	private String nome;

	@EJB
	private OlaMundoSessionBeanLocal sessionBean;

	public String digaOla() {
		String mensagem = sessionBean.olaMundo(nome);
		FacesMessage msg = new FacesMessage(mensagem);
		FacesContext.getCurrentInstance().addMessage(null, msg);
		return null;
	}
	
	public void limpar() {
		setNome("");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
