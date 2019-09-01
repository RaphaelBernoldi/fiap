package br.com.fiap.healthtrack.entity;

import java.util.List;

/**
 * 
 * @author raphael
 * Classe destinada a representar usuario do sistemas
 */
public class UsuarioEntity extends PessoaEntity {

	private Long idUsuario;
	private LoginEntity login;
	private List<PerfilEntity> perfis;
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
	 * @return the login
	 */
	public LoginEntity getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(LoginEntity login) {
		this.login = login;
	}

	/**
	 * @return the perfil
	 */
	public List<PerfilEntity> getPerfis() {
		return perfis;
	}

	/**
	 * @param perfil the perfil to set
	 */
	public void setPerfil(List<PerfilEntity> perfis) {
		this.perfis = perfis;
	}
	
	
}
