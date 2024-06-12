package br.com.projeto.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.api.model.Artigo;
import br.com.projeto.api.model.Usuario;

@Repository
public interface ArtigoRepository extends JpaRepository<Artigo, Long> {
    List<Artigo> findByAutor(Usuario autor);
}
