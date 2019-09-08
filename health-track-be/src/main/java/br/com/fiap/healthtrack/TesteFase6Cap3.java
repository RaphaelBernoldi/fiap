package br.com.fiap.healthtrack;

import br.com.fiap.healthtrack.dao.RefeicaoSugestaoDAO;

public class TesteFase6Cap3 {

	public static void main(String[] args) {

		RefeicaoSugestaoDAO refeicaoSugestaoDAO = new RefeicaoSugestaoDAO();
		refeicaoSugestaoDAO
			.getAll()
			.forEach( r -> System.out.println(r));

	}

}
