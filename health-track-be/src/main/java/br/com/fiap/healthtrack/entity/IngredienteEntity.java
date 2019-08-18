package br.com.fiap.healthtrack.entity;

public class IngredienteEntity {

	
	private Long idIngrediente;
	private String nome;
	private Integer caloria;
	
	public Long getIdIngrediente() {
		return idIngrediente;
	}
	public void setIdIngrediente(Long idIngrediente) {
		this.idIngrediente = idIngrediente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getCaloria() {
		return caloria;
	}
	public void setCaloria(Integer caloria) {
		this.caloria = caloria;
	}
	
	
}
