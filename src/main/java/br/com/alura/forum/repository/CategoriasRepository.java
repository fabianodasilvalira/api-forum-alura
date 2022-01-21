package br.com.alura.forum.repository;

import java.util.Optional;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Categoria;

public interface CategoriasRepository extends JpaRepository<Categoria, Long> {

	Page<Categoria> findByNome(String nome, Pageable paginacao);

	Categoria getById(Long categoria_id);

}
