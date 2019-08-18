package br.com.fiap.healthtrack.entity;

public class ExercicioEntity {

	private Long idExercicio;
	private String nomeExercicio;
	private String descricaoExplicativa;
	
	public Long getIdExercicio() {
		return idExercicio;
	}
	public void setIdExercicio(Long idExercicio) {
		this.idExercicio = idExercicio;
	}
	public String getNomeExercicio() {
		return nomeExercicio;
	}
	public void setNomeExercicio(String nomeExercicio) {
		this.nomeExercicio = nomeExercicio;
	}
	public String getDescricaoExplicativa() {
		return descricaoExplicativa;
	}
	public void setDescricaoExplicativa(String descricaoExplicativa) {
		this.descricaoExplicativa = descricaoExplicativa;
	}
	
	
}
