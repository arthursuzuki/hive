package br.com.projeto.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.projeto.api.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    @Query("SELECT u FROM Usuario u JOIN u.papeis p WHERE p.nome = 'Membro da Comunidade'")
    List<Usuario> findMembrosComunidade();
}
