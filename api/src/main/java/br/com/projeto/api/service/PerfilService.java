package br.com.projeto.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.api.model.Artigo;
import br.com.projeto.api.model.Projeto;
import br.com.projeto.api.repository.ArtigoRepository;
import br.com.projeto.api.repository.ProjetoRepository;

@Service
public class PerfilService {

    @Autowired
    private ArtigoRepository artigoRepository;

    @Autowired
    private ProjetoRepository projetoRepository;

    public List<Artigo> listarArtigosDoUsuario(Long usuarioId) {
        return artigoRepository.findByAutorId(usuarioId);
    }

    public List<Projeto> listarProjetosDoUsuario(Long usuarioId) {
        return projetoRepository.findByUsuarioId(usuarioId);
    }
}
