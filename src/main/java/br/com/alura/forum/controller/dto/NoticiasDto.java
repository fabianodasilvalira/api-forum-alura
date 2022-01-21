package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;

import org.springframework.data.domain.Page;

import br.com.alura.forum.modelo.Categoria;
import br.com.alura.forum.modelo.Noticia;

public class NoticiasDto {
	private String titulo;
	private String corpo;
	private String fonte_autor;
	private String fonte_url;
	private String fonte_data;
	private LocalDateTime data_postagem;
	private String status;
	private Categoria categoria;
	
	
	
	public NoticiasDto(Noticia noticia) {
		this.titulo = noticia.getTitulo();
		this.corpo = noticia.getCorpo();
		this.fonte_autor = noticia.getFonte_autor();
		this.fonte_url = noticia.getFonte_url();
		this.fonte_data = noticia.getFonte_data();
		this.data_postagem = noticia.getData_postagem();
		this.status = noticia.getStatus().name();
		this.categoria = noticia.getCategoria();
	}


	public void setFonte_data(String fonte_data) {
		this.fonte_data = fonte_data;
	}



	public String getTitulo() {
		return titulo;
	}



	public LocalDateTime getData_postagem() {
		return data_postagem;
	}


	public String getCorpo() {
		return corpo;
	}



	public String getFonte_autor() {
		return fonte_autor;
	}



	public String getFonte_url() {
		return fonte_url;
	}

	public String getFonte_data() {
		return fonte_data;
	}

	public String getStatus() {
		return status;
	}



	public Categoria getCategoria() {
		return categoria;
	}



	public static Page<NoticiasDto> converter(Page<Noticia> noticias) {
		return noticias.map(NoticiasDto::new);
	}

}
