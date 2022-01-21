package br.com.alura.forum.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Noticia;

public interface NoticiasRepository extends JpaRepository<Noticia, Long>{

	Page<Noticia> findByCategoriaNome(String nomeCategoria, Pageable paginacao);

}
