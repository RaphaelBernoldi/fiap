package br.com.fiap.healthtrack.entity;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

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
		if(ingredientes == null) {
			ingredientes = new ArrayList<IngredienteEntity>();
		}
		
		return ingredientes;
	}
	public void setIngredientes(List<IngredienteEntity> ingredientes) {
		this.ingredientes = ingredientes;
	}
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.SIMPLE_STYLE);
	}
	
}
