package br.com.fiap.healthtrack.entity;

/**
 * 
 * @author raphael
 * Classe destinada a armazernar dados corporais dos usuários
 */
public class DadoCorporalEntity {
	
	
	private Long idDadoCorporal;
	private Double peso;
	private Double imc;
	private UsuarioEntity usuario;
	
	/**
	 * 
	 * @return (Long) idDadoCorporal
	 */
	public Long getIdDadoCorporal() {
		return idDadoCorporal;
	}
	
	/**
	 * Altera idDadoCorporal
	 * @param (Long) idDadoCorporal
	 */
	public void setIdDadoCorporal(Long idDadoCorporal) {
		this.idDadoCorporal = idDadoCorporal;
	}
	
	/**
	 * 
	 * @return (Long) peso
	 */
	public Double getPeso() {
		return peso;
	}
	
	/**
	 * Altera peso
	 * @param (Double) peso
	 */
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	/**
	 * 
	 * @return (Double) imc
	 */
	public Double getImc() {
		return imc;
	}
	
	/**
	 * Altera imc
	 * @param (Double) imc
	 */
	public void setImc(Double imc) {
		this.imc = imc;
	}
	
	/**
	 * 
	 * @return (UsuarioEntity) usuario
	 */
	public UsuarioEntity getUsuario() {
		return usuario;
	}
	
	/**
	 * Altera usuario
	 * @param (UsuarioEntity) usuario
	 */
	public void setUsuario(UsuarioEntity usuario) {
		this.usuario = usuario;
	}
	

}
