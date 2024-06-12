package br.com.projeto.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.api.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
