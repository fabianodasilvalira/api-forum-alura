package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Imagens;

public interface ImagensRepository extends JpaRepository<Imagens, Long>{


	List<Imagens> findAllByNoticiaId(Long id);







}
