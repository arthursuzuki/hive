package br.com.projeto.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.api.model.ViewArtigoProjeto;

public interface ViewArtigosProjetoRepository extends JpaRepository<ViewArtigoProjeto, Long> {
}
