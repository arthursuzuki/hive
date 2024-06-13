package br.com.projeto.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.api.model.Projeto;
public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
  List<Projeto> findByUsuarioId(Long usuarioId);
}
