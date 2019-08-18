package br.com.fiap.healthtrack.entity;

import java.util.List;

public class RefeicaoSugestaoEntity {

	private Long idRefeicaoSugestao;
	private String nome;
	private String descricao;
	private List<IngredienteEntity>ingredientes;
	
	public Long getIdRefeicaoSugestao() {
		return idRefeicaoSugestao;
	}
	public void setIdRefeicaoSugestao(Long idRefeicaoSugestao) {
		this.idRefeicaoSugestao = idRefeicaoSugestao;
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
	public List<IngredienteEntity> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(List<IngredienteEntity> ingredientes) {
		this.ingredientes = ingredientes;
	}
	
}
