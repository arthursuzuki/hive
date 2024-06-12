package br.com.projeto.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.api.model.Usuario;
import br.com.projeto.api.repository.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> findAllUsuarios() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> findUsuarioById(int id) {
        return usuarioRepository.findById(id);
    }
}
