package br.com.projeto.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.api.model.Artigo;
import br.com.projeto.api.repository.ArtigoRepository;

@Service
public class FazerArtigoService {

    @Autowired
    private ArtigoRepository artigoRepository;

    public Artigo salvarArtigo(Artigo artigo) {
        return artigoRepository.save(artigo);
    }
}
