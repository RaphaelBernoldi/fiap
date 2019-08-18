package br.com.fiap.healthtrack;

import java.util.Calendar;

import br.com.fiap.healthtrack.entity.DadoCorporalEntity;
import br.com.fiap.healthtrack.entity.UsuarioEntity;

public class Main {

	public static void main(String[] args) {
		
		//Criando instancia de usuario
		UsuarioEntity usuario = new UsuarioEntity();
		usuario.setDataNascimento(Calendar.getInstance());
		usuario.setIdUsuario(1l);
		usuario.setNome("Raphael");
		usuario.setSobrenome("Bernoldi");
		
		//Criando dado corporal e atribuindo ao usuario
		DadoCorporalEntity dadoCorporal = new DadoCorporalEntity();
		dadoCorporal.setIdDadoCorporal(1l);
		dadoCorporal.setImc(29.1);
		dadoCorporal.setPeso(86.4);
		dadoCorporal.setUsuario(usuario);
		
		
	}

}
