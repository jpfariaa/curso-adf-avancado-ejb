package br.com.curso.managedbeans;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import br.com.curso.model.PacienteModel;
import br.com.cursoadf.entity.PacienteEntity;
import br.com.cursoadf.sessionbean.PacienteSessionBeanLocal;

@ManagedBean(name = "paciente")
@SessionScoped
public class PacienteBean {

	@EJB
	private PacienteSessionBeanLocal sessionBean;

	private PacienteModel model;

	public PacienteBean() {
		model = new PacienteModel();
	}

	public PacienteModel getModel() {
		return model;
	}

	public void setModel(PacienteModel model) {
		this.model = model;
	}

	/**
	 * Cadastra uma entidade de paciente no banco
	 * 
	 * @param event
	 */
	public void cadastrarPaciente(ActionEvent event) {
		FacesMessage message;
		try {
			PacienteEntity entity = new PacienteEntity();
			entity.setCpf(model.getCpf());
			entity.setNome(model.getNome());

			// m?todo de persist?ncia desse paciente no banco
			sessionBean.persistPacienteEntity(entity);

			message = new FacesMessage("Paciente cadastrado com sucesso!.");

		} catch (Exception e) {
			e.printStackTrace();
			message = new FacesMessage("Erro no sistema, contacte o Adminstrador.");
		}
		FacesContext.getCurrentInstance().addMessage(null, message);
	}
}
