package br.com.fiap.healthtrack.entity;

public class UsuarioTreino {

	private UsuarioEntity usuario;
	private TreinoEntity treino;
	
	/**
	 * @return the usuario
	 */
	public UsuarioEntity getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(UsuarioEntity usuario) {
		this.usuario = usuario;
	}
	/**
	 * @return the treino
	 */
	public TreinoEntity getTreino() {
		return treino;
	}
	/**
	 * @param treino the treino to set
	 */
	public void setTreino(TreinoEntity treino) {
		this.treino = treino;
	}
	
	
}
