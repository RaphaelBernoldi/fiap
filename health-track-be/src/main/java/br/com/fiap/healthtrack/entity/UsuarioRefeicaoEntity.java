package br.com.fiap.healthtrack.entity;

public class UsuarioRefeicaoEntity {

	private UsuarioEntity usuario;
	private RefeicaoSugestaoEntity refeicao;
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
	 * @return the refeicao
	 */
	public RefeicaoSugestaoEntity getRefeicao() {
		return refeicao;
	}
	/**
	 * @param refeicao the refeicao to set
	 */
	public void setRefeicao(RefeicaoSugestaoEntity refeicao) {
		this.refeicao = refeicao;
	}
	
	
}
