package br.com.alura.forum.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.alura.forum.modelo.Categoria;
import br.com.alura.forum.repository.CategoriaRepository;

public class AtualizacaoCategoriaForm {

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

	public Categoria atualizar(Long id, CategoriaRepository categoriaRepository) {
		Categoria categoria = categoriaRepository.getOne(id);
		
		categoria.setNome(this.nome);
		categoria.setCor(this.cor);
		
		return categoria;
	}
}
