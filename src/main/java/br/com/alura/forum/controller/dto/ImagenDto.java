package br.com.alura.forum.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.forum.modelo.Imagens;

public class ImagenDto {
	private Long id;
	private String nome;
	private String pasta;
	
	
	
	public ImagenDto(Imagens imagens) {
		this.id = imagens.getId();
		this.nome = imagens.getNome();
		this.pasta = imagens.getPasta();
	}
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getPasta() {
		return pasta;
	}
	
	public static List<ImagenDto> converter(List<Imagens> imagens) {
		return imagens.stream().map(ImagenDto::new).collect(Collectors.toList());
	}


}
