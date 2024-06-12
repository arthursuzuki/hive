package br.com.projeto.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.api.model.Projeto;
import br.com.projeto.api.model.Usuario;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
    List<Projeto> findByLider(Usuario lider);
}
