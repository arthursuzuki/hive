package br.com.projeto.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.api.model.Artigo;
public interface ArtigoRepository extends JpaRepository<Artigo, Long> {
  List<Artigo> findByAutorId(Long autorId);
}
