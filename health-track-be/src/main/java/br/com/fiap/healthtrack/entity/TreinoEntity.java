package br.com.fiap.healthtrack.entity;

import java.util.List;

public class TreinoEntity {

	
	private Long idTreino;
	private Integer diaSemana;
	private String nome;
	private List<ExercicioEntity>exercicios;
	
	public Long getIdTreino() {
		return idTreino;
	}
	public void setIdTreino(Long idTreino) {
		this.idTreino = idTreino;
	}
	public Integer getDiaSemana() {
		return diaSemana;
	}
	public void setDiaSemana(Integer diaSemana) {
		this.diaSemana = diaSemana;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<ExercicioEntity> getExercicios() {
		return exercicios;
	}
	public void setExercicios(List<ExercicioEntity> exercicios) {
		this.exercicios = exercicios;
	}
	
	
}
