package br.com.cursoadf.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PACIENTE database table.
 * 
 */
@Entity
@Table(name="PACIENTE")
@NamedQuery(name="PacienteEntity.findAll", query="SELECT p FROM PacienteEntity p")
public class PacienteEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String cpf;

	private String nome;

	public PacienteEntity() {
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}