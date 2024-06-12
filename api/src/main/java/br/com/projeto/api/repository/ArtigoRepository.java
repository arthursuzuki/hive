package br.com.projeto.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.api.model.Artigo;

@Repository
public interface ArtigoRepository extends JpaRepository<Artigo, Integer> {
}
