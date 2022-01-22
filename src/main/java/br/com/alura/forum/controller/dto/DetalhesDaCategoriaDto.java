package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;

import br.com.alura.forum.modelo.Categoria;

public class DetalhesDaCategoriaDto {
	private Long id;
	private String nome;
	private String cor;
	private String descricao;
	private LocalDateTime dt_cadastro;
	
	
	public DetalhesDaCategoriaDto(Categoria categoria) {
		this.id = categoria.getId();
		this.nome = categoria.getNome();
		this.cor = categoria.getCor();
		this.descricao = categoria.getDescricao();
		this.dt_cadastro = categoria.getDt_cadastro();
	}


	public Long getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}


	public String getCor() {
		return cor;
	}


	public String getDescricao() {
		return descricao;
	}


	public LocalDateTime getDt_cadastro() {
		return dt_cadastro;
	}


}
