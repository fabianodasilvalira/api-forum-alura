package br.com.alura.forum.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;

import br.com.alura.forum.modelo.Imagens;

public class ImagensForm {
	
	@NotNull @NotEmpty 
    private String pasta;
	
	@NotNull @NotEmpty 
	private String nome;
		
	public void setPasta(String pasta) {
		this.pasta = pasta;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Imagens converter(MultipartFile upload, String pasta) {
		this.nome = upload.getOriginalFilename();
		System.out.println(this.nome);
	
		
		return new Imagens(nome, pasta);
	}
	
}
