package br.com.alura.forum.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.alura.forum.modelo.Categoria;

public class CategoriaForm {
	@NotNull @NotEmpty 
	private String nome;
	
	@NotNull @NotEmpty 
	private String cor;
	

	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public Categoria converter() {
		return new Categoria(nome, cor);
	}
}
