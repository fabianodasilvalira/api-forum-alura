package br.com.alura.forum.modelo;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Imagens {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@ManyToOne
	private Noticia noticia;
	private String pasta;
	private LocalDateTime data_postagem = LocalDateTime.now();
	
	public Imagens() {
		
	}
	
	public Imagens(String nome, Noticia noticia, String pasta) {
		this.nome = nome;
		this.noticia = noticia;
		this.pasta = pasta;
	}
	
	public Imagens(String nome, String pasta) {
		this.nome = nome;
		this.pasta = pasta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Noticia getNoticia() {
		return noticia;
	}
	public void setNoticia(Noticia noticia) {
		this.noticia = noticia;
	}
	public String getPasta() {
		return pasta;
	}
	public void setPasta(String pasta) {
		this.pasta = pasta;
	}
	public LocalDateTime getData_postagem() {
		return data_postagem;
	}
	public void setData_postagem(LocalDateTime data_postagem) {
		this.data_postagem = data_postagem;
	}
	
	
	
	
}
