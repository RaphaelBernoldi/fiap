package br.com.fiap.healthtrack.entity;

import java.util.Calendar;

/**
 * 
 * @author raphael
 * Classe destinada a representar usuario do sistemas
 */
public class UsuarioEntity {

	private Long idUsuario;
	private String nome;
	private String sobrenome;
	private Calendar dataNascimento;
	
	/**
	 * 
	 * @return (Long) idUsuario
	 */
	public Long getIdUsuario() {
		return idUsuario;
	}
	
	/**
	 * Altera idUsuario
	 * @param (Long)idUsuario
	 */
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	/**
	 * 
	 * @return (String) nome
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Altera nome do usuário
	 * @param (String)nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * 
	 * @return (String) sobrenome
	 */
	public String getSobrenome() {
		return sobrenome;
	}
	
	/**
	 * Altera sobrenomenome do usuário
	 * @param (String)sobrenomenome
	 */
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	/**
	 * 
	 * @return (Calendar) data de nascimento
	 */
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	
	/**
	 * Altera dataNascimento do usuário
	 * @param (Calendar)dataNascimento
	 */
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
}
