package br.com.projeto.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.api.model.Projeto;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Integer> {
}
