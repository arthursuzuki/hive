package br.com.projeto.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.api.model.Artigo;

public interface ArtigoRepository extends JpaRepository<Artigo, Long> {
}
