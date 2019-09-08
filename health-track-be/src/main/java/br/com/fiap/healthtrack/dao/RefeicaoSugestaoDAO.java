package br.com.fiap.healthtrack.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.healthtrack.entity.IngredienteEntity;
import br.com.fiap.healthtrack.entity.RefeicaoSugestaoEntity;

public class RefeicaoSugestaoDAO {
	
	private List<RefeicaoSugestaoEntity>refeicoesSugestoes;
	
	public RefeicaoSugestaoDAO() {
			criaḾock();
	}
	
	private void criaḾock() {
		refeicoesSugestoes = new ArrayList<RefeicaoSugestaoEntity>();
		RefeicaoSugestaoEntity refeicaoSugestaoEntity = new RefeicaoSugestaoEntity();
		
		IngredienteEntity ingrediente = new IngredienteEntity();
		ingrediente.setIdIngrediente(1l);
		ingrediente.setNome("Copo de leite com café");
		ingrediente.setCaloria(100);
		refeicaoSugestaoEntity.getIngredientes().add(ingrediente);
		
		ingrediente = new IngredienteEntity();
		ingrediente.setIdIngrediente(2l);
		ingrediente.setNome("Pão integral");
		ingrediente.setCaloria(50);
		refeicaoSugestaoEntity.getIngredientes().add(ingrediente);		
		
		ingrediente = new IngredienteEntity();
		ingrediente.setIdIngrediente(3l);
		ingrediente.setNome("Fatia queijo branco");
		ingrediente.setCaloria(50);
		refeicaoSugestaoEntity.getIngredientes().add(ingrediente);
		
		refeicaoSugestaoEntity.setIdRefeicaoSugestao(1l);
		refeicaoSugestaoEntity.setDescricao("Sugestão de café da manhã");
		refeicaoSugestaoEntity.setNome("Café da manhã para segunda-feira");
		add(refeicaoSugestaoEntity);
		
		refeicaoSugestaoEntity = new RefeicaoSugestaoEntity();		
		ingrediente = new IngredienteEntity();
		ingrediente.setIdIngrediente(4l);
		ingrediente.setNome("Pão de queijo integral");
		ingrediente.setCaloria(50);
		refeicaoSugestaoEntity.getIngredientes().add(ingrediente);		
		ingrediente = new IngredienteEntity();
		ingrediente.setIdIngrediente(5l);
		ingrediente.setNome("Suco Natrural");
		ingrediente.setCaloria(50);
		refeicaoSugestaoEntity.getIngredientes().add(ingrediente);
		
		refeicaoSugestaoEntity.setIdRefeicaoSugestao(2l);
		refeicaoSugestaoEntity.setDescricao("Sugestão de lanche da manhã");
		refeicaoSugestaoEntity.setNome("Lanche da manhã para segunda-feira");
		add(refeicaoSugestaoEntity);
		
		refeicaoSugestaoEntity = new RefeicaoSugestaoEntity();
		ingrediente = new IngredienteEntity();
		ingrediente.setIdIngrediente(6l);
		ingrediente.setNome("Arroz (porção de duas conchas)");
		ingrediente.setCaloria(50);
		ingrediente = new IngredienteEntity();
		ingrediente.setIdIngrediente(7l);
		ingrediente.setNome("Feijão (porção com um concha))");
		ingrediente.setCaloria(50);
		ingrediente = new IngredienteEntity();
		ingrediente.setIdIngrediente(8l);
		ingrediente.setNome("Filé de franco");
		ingrediente.setCaloria(150);
		ingrediente = new IngredienteEntity();
		ingrediente.setIdIngrediente(9l);
		ingrediente.setNome("Salada de alface");
		ingrediente.setCaloria(10);
		ingrediente = new IngredienteEntity();
		ingrediente.setIdIngrediente(10l);
		ingrediente.setNome("Suco de frutas");
		ingrediente.setCaloria(150);
		refeicaoSugestaoEntity.getIngredientes().add(ingrediente);	
		refeicaoSugestaoEntity.setIdRefeicaoSugestao(3l);
		refeicaoSugestaoEntity.setNome("Almoço de segunda-feira");
		refeicaoSugestaoEntity.setDescricao("Almoço de segunda-feira");
		add(refeicaoSugestaoEntity);
		
		refeicaoSugestaoEntity = new RefeicaoSugestaoEntity();
		refeicaoSugestaoEntity.setIdRefeicaoSugestao(4l);
		refeicaoSugestaoEntity.setNome("Café da tarde segunda-feira");
		refeicaoSugestaoEntity.setDescricao("Café da tarde");
		ingrediente = new IngredienteEntity();
		ingrediente.setIdIngrediente(11l);
		ingrediente.setNome("Café com leite");
		ingrediente.setCaloria(150);
		refeicaoSugestaoEntity.getIngredientes().add(ingrediente);	
		ingrediente = new IngredienteEntity();
		ingrediente.setIdIngrediente(12l);
		ingrediente.setNome("Barra de sereal");
		ingrediente.setCaloria(150);
		refeicaoSugestaoEntity.getIngredientes().add(ingrediente);
		add(refeicaoSugestaoEntity);
		
		refeicaoSugestaoEntity = new RefeicaoSugestaoEntity();
		refeicaoSugestaoEntity.setIdRefeicaoSugestao(5l);
		refeicaoSugestaoEntity.setNome("Jantar da tarde segunda-feira");
		refeicaoSugestaoEntity.setDescricao("Jantar");
		ingrediente = new IngredienteEntity();
		ingrediente.setIdIngrediente(12l);
		ingrediente.setNome("Arroz uma porção");
		ingrediente.setCaloria(25);
		refeicaoSugestaoEntity.getIngredientes().add(ingrediente);
		ingrediente = new IngredienteEntity();
		ingrediente.setIdIngrediente(8l);
		ingrediente.setNome("Filé de franco");
		ingrediente.setCaloria(150);
		refeicaoSugestaoEntity.getIngredientes().add(ingrediente);
		ingrediente = new IngredienteEntity();
		ingrediente.setIdIngrediente(9l);
		ingrediente.setNome("Salada de alface");
		ingrediente.setCaloria(10);
		refeicaoSugestaoEntity.getIngredientes().add(ingrediente);
		ingrediente = new IngredienteEntity();
		ingrediente.setIdIngrediente(10l);
		ingrediente.setNome("Suco de frutas");
		ingrediente.setCaloria(150);
		refeicaoSugestaoEntity.getIngredientes().add(ingrediente);
		add(refeicaoSugestaoEntity);
		
		
	}
	
	public void add(RefeicaoSugestaoEntity refeicaoSugestaoEntity) {
		refeicoesSugestoes.add(refeicaoSugestaoEntity);
	}

	public List<RefeicaoSugestaoEntity>getAll(){
		return refeicoesSugestoes;
	}

}
