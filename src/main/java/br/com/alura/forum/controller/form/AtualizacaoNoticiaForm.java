package br.com.alura.forum.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.com.alura.forum.modelo.Categoria;
import br.com.alura.forum.modelo.Noticia;
import br.com.alura.forum.repository.NoticiasRepository;

public class AtualizacaoNoticiaForm {
	@NotNull @NotEmpty @Length(min = 5)
	private String titulo;
	
	@NotNull @NotEmpty @Length(min = 10)
	private String corpo;
	
	@NotNull @NotEmpty @Length(min = 2)
	private String fonte_autor;
	
	@NotNull @NotEmpty @Length(min = 5)
	private String fonte_url;
	
	@NotNull @NotEmpty
	private String fonte_data;
	
	@NotNull @NotEmpty
	private String autor_id;
	
	@NotNull @NotEmpty
	private String categoria_id;
	

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}

	public void setFonte_autor(String fonte_autor) {
		this.fonte_autor = fonte_autor;
	}

	public void setFonte_url(String fonte_url) {
		this.fonte_url = fonte_url;
	}

	public void setFonte_data(String fonte_data) {
		this.fonte_data = fonte_data;
	}

	public void setAutor_id(String autor_id) {
		this.autor_id = autor_id;
	}

	public void setCategoria_id(String categoria_id) {
		this.categoria_id = categoria_id;
	}

	public Noticia atualizar(Long id, NoticiasRepository noticiasRepository) {
		Noticia noticia = noticiasRepository.getOne(id);
		
		noticia.setTitulo(this.titulo);
		noticia.setCorpo(this.corpo);
		noticia.setFonte_autor(this.fonte_autor);
		noticia.setFonte_url(this.fonte_url);
		noticia.setFonte_data(this.fonte_data);
		
		return noticia;
	}
}
