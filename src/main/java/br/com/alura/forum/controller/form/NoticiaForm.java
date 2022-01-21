package br.com.alura.forum.controller.form;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Optional;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;

import br.com.alura.forum.modelo.Categoria;
import br.com.alura.forum.modelo.Noticia;
import br.com.alura.forum.modelo.Usuario;
import br.com.alura.forum.repository.CategoriasRepository;
import br.com.alura.forum.repository.UsuarioRepository;

//Toda classe DTO tem que ter o Serializable para que converta do JSON para a Classe de forma automatica
public class NoticiaForm  implements Serializable{
	
	private static final long serialVersionUID = 1L;

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
	
	public Noticia converter(CategoriasRepository categoriaRepository, UsuarioRepository usuarioRepository) {
		Optional<Categoria> categoria = categoriaRepository.findById(Long.parseLong(categoria_id));
		Optional<Usuario> usuario = usuarioRepository.findById(Long.parseLong(autor_id));
		System.out.println(categoria);
		System.out.println(usuario);
		
		return new Noticia(categoria, usuario, titulo, corpo, fonte_autor, fonte_url, fonte_data);
	}

}
