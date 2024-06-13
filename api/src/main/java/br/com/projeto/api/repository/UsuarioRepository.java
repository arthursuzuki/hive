package br.com.projeto.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.api.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
