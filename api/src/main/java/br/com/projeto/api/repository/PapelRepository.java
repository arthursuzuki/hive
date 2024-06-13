package br.com.projeto.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.api.model.Papel;

public interface PapelRepository extends JpaRepository<Papel, Long> {
}
