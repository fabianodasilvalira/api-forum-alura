package br.com.alura.forum.modelo;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
public class Noticia {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Categoria categoria;
	private String titulo;
	private String corpo;
	private String fonte_autor;
	private String fonte_url;
	private String fonte_data;
	@ManyToOne
	private Usuario autor;
	@Enumerated(EnumType.STRING)
	private StatusNoticia status = StatusNoticia.INATIVO;
	private String logs;
	private LocalDateTime data_postagem = LocalDateTime.now();
	private LocalDateTime data_update;
	
	
	public Noticia() {
	}

	public Noticia(Optional<Categoria> categoria, Optional<Usuario> usuario, String titulo, String corpo, String fonte_autor, String fonte_url, String fonte_data) {
		this.categoria = categoria.get();
		this.autor = usuario.get();
		this.titulo = titulo;
		this.corpo = corpo;
		this.fonte_autor = fonte_autor;
		this.fonte_url = fonte_url;
		this.fonte_data = fonte_data;
	}


	@Override
	public int hashCode() {
		return Objects.hash(autor, categoria, fonte_autor, status, titulo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Noticia other = (Noticia) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(categoria, other.categoria)
				&& Objects.equals(fonte_autor, other.fonte_autor) && status == other.status
				&& Objects.equals(titulo, other.titulo);
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getCorpo() {
		return corpo;
	}


	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}


	public String getFonte_autor() {
		return fonte_autor;
	}


	public void setFonte_autor(String fonte_autor) {
		this.fonte_autor = fonte_autor;
	}


	public String getFonte_url() {
		return fonte_url;
	}


	public void setFonte_url(String fonte_url) {
		this.fonte_url = fonte_url;
	}


	public String getFonte_data() {
		return fonte_data;
	}


	public void setFonte_data(String fonte_data) {
		this.fonte_data = fonte_data;
	}


	public Usuario getAutor() {
		return autor;
	}


	public void setAutor(Usuario autor) {
		this.autor = autor;
	}


	public StatusNoticia getStatus() {
		return status;
	}


	public void setStatus(StatusNoticia status) {
		this.status = status;
	}


	public String getLogs() {
		return logs;
	}


	public void setLogs(String logs) {
		this.logs = logs;
	}


	public LocalDateTime getData_postagem() {
		return data_postagem;
	}


	public void setData_postagem(LocalDateTime data_postagem) {
		this.data_postagem = data_postagem;
	}


	public LocalDateTime getData_update() {
		return data_update;
	}


	public void setData_update(LocalDateTime data_update) {
		this.data_update = data_update;
	}


}
