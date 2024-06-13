package br.com.projeto.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.api.model.Projeto;
import br.com.projeto.api.repository.ProjetoRepository;

@Service
public class FazerProjetoService {

    @Autowired
    private ProjetoRepository projetoRepository;

    public Projeto salvarProjeto(Projeto projeto) {
        return projetoRepository.save(projeto);
    }
}
