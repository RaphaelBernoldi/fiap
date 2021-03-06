package br.com.fiap.healthtrack.entity;

import java.awt.Menu;
import java.util.List;

public class PerfilEntity {

	private Long idPerfil;
	private String nome;
	private String descricao;
	private List<PerfilMenuEntity>perfilMenu;
	
	public Long getIdPerfil() {
		return idPerfil;
	}
	public void setIdPerfil(Long idPerfil) {
		this.idPerfil = idPerfil;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	/**
	 * @return the perfilMenu
	 */
	public List<PerfilMenuEntity> getPerfilMenu() {
		return perfilMenu;
	}
	/**
	 * @param perfilMenu the perfilMenu to set
	 */
	public void setPerfilMenu(List<PerfilMenuEntity> perfilMenu) {
		this.perfilMenu = perfilMenu;
	}
	
	
}
