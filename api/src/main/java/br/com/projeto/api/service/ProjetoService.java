package br.com.projeto.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.api.model.Projeto;
import br.com.projeto.api.model.Usuario;
import br.com.projeto.api.repository.ProjetoRepository;
@Service
public class ProjetoService {

    @Autowired
    private ProjetoRepository projetoRepository;

    public List<Projeto> findAllProjetos() {
        return projetoRepository.findAll();
    }

    public List<Projeto> findByLider(Usuario lider) {
        return projetoRepository.findByLider(lider);
    }

    public Projeto saveProjeto(Projeto projeto) {
        return projetoRepository.save(projeto);
    }
}
