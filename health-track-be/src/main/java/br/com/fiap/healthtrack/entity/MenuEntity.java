package br.com.fiap.healthtrack.entity;

import java.util.List;

public class MenuEntity {

	private Long idMenu;
	private String label;
	private String url;
	private String descricao;
	private List<PerfilEntity>perfis;
	
	public Long getIdMenu() {
		return idMenu;
	}
	public void setIdMenu(Long idMenu) {
		this.idMenu = idMenu;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public List<PerfilEntity> getPerfis() {
		return perfis;
	}
	public void setPerfis(List<PerfilEntity> perfis) {
		this.perfis = perfis;
	}
}
