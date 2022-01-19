package br.com.alura.forum.controller.dto;

import org.springframework.data.domain.Page;

import br.com.alura.forum.modelo.Categoria;
import br.com.alura.forum.modelo.Topico;

public class CategoriaDto {
	private String nome;
	private String cor;
	
	public CategoriaDto(Categoria categoria) {
		this.nome = categoria.getNome();
		this.cor = categoria.getCor();
	}

	public String getNome() {
		return nome;
	}

	public String getCor() {
		return cor;
	}

	public static Page<CategoriaDto> converter(Page<Categoria> categorias) {
		return categorias.map(CategoriaDto::new);
	}
	}
