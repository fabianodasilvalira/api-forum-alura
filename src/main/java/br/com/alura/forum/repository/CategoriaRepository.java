package br.com.alura.forum.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Categoria;
import br.com.alura.forum.modelo.Topico;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	Page<Categoria> findByNome(String nome, Pageable paginacao);

}
