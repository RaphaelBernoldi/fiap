package br.com.fiap.healthtrack.entity;

import java.util.Calendar;

public class LoginEntity {

	private Long idLogin;
	private String user;
	private String senha;
	private Calendar ultimoAcesso;
	private Boolean status;
	
	public Long getIdLogin() {
		return idLogin;
	}
	public void setIdLogin(Long idLogin) {
		this.idLogin = idLogin;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Calendar getUltimoAcesso() {
		return ultimoAcesso;
	}
	public void setUltimoAcesso(Calendar ultimoAcesso) {
		this.ultimoAcesso = ultimoAcesso;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
}
