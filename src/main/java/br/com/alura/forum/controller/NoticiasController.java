package br.com.alura.forum.controller;

import java.net.URI;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.alura.forum.controller.dto.CategoriaDto;
import br.com.alura.forum.controller.dto.NoticiasDto;
import br.com.alura.forum.controller.form.AtualizacaoCategoriaForm;
import br.com.alura.forum.controller.form.AtualizacaoNoticiaForm;
import br.com.alura.forum.controller.form.NoticiaForm;
import br.com.alura.forum.modelo.Categoria;
import br.com.alura.forum.modelo.Noticia;
import br.com.alura.forum.repository.CategoriasRepository;
import br.com.alura.forum.repository.NoticiasRepository;
import br.com.alura.forum.repository.UsuarioRepository;

@RestController
@RequestMapping("/noticias")
public class NoticiasController {
	
	@Autowired
	private NoticiasRepository noticiasRepository;
	
	@Autowired
	private CategoriasRepository categoriasRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	@GetMapping
	public Page<NoticiasDto> listar(@RequestParam(required = false) String categoria, Pageable paginacao) {
		
		if (categoria == null) {
			Page<Noticia> noticia = noticiasRepository.findAll(paginacao);
			return NoticiasDto.converter(noticia);
		} else {
			System.out.println("categoria");
			Page<Noticia> noticia = noticiasRepository.findByCategoriaNome(categoria, paginacao);
			return NoticiasDto.converter(noticia);
		}
			
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<NoticiasDto> detalhar(@PathVariable Long id) {
		Optional<Noticia> noticia = noticiasRepository.findById(id);
		if (noticia.isPresent()) {
			return ResponseEntity.ok(new NoticiasDto(noticia.get()));
		}
		
		return ResponseEntity.notFound().build();
	}
	
	
	
	@PostMapping
	@Transactional
	public ResponseEntity<NoticiasDto> cadastrar(@RequestBody @Valid NoticiaForm form, UriComponentsBuilder uriBuilder) {
		Noticia noticia = form.converter(categoriasRepository, usuarioRepository);
		System.out.println(noticia);
		noticiasRepository.save(noticia);
		
		URI uri = uriBuilder.path("/noticias/{id}").buildAndExpand(noticia.getId()).toUri();
		return ResponseEntity.created(uri).body(new NoticiasDto(noticia));
	}
	
	
	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<NoticiasDto> atualizar(@PathVariable Long id, @RequestBody @Valid AtualizacaoNoticiaForm form) {
		Optional<Noticia> optional = noticiasRepository.findById(id);
		if (optional.isPresent()) {
			Noticia noticia = form.atualizar(id, noticiasRepository);
			return ResponseEntity.ok(new NoticiasDto(noticia));
		}
		
		return ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	public ResponseEntity<?> remover(@PathVariable Long id) {
		Optional<Noticia> optional = noticiasRepository.findById(id);
		if (optional.isPresent()) {
			noticiasRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}
		
		return ResponseEntity.notFound().build();
	}	
	
	

}
