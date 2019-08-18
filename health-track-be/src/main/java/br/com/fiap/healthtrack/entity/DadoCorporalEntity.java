package br.com.fiap.healthtrack.entity;

import java.util.Calendar;

public class DadoCorporalEntity {
	
	
	private Long idDadoCorporal;
	private Double peso;
	private Double imc;
	private Calendar dataNascimento;
	private UsuarioEntity usuario;
	public Long getIdDadoCorporal() {
		return idDadoCorporal;
	}
	public void setIdDadoCorporal(Long idDadoCorporal) {
		this.idDadoCorporal = idDadoCorporal;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getImc() {
		return imc;
	}
	public void setImc(Double imc) {
		this.imc = imc;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public UsuarioEntity getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioEntity usuario) {
		this.usuario = usuario;
	}
	

}
