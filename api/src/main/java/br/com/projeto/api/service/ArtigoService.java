package br.com.projeto.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.api.model.Artigo;
import br.com.projeto.api.repository.ArtigoRepository;

@Service
public class ArtigoService {
    @Autowired
    private ArtigoRepository artigoRepository;

    public List<Artigo> listarTodos() {
        return artigoRepository.findAll();
    }
}
