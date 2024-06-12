package br.com.projeto.api.service;

import br.com.projeto.api.model.*;
import br.com.projeto.api.model.Artigo;
import br.com.projeto.api.repository.ArtigoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ArtigoService {

    @Autowired
    private ArtigoRepository artigoRepository;

    public List<Artigo> findAllArtigos() {
        return artigoRepository.findAll();
    }

    public List<Artigo> findByAutor(Usuario autor) {
        return artigoRepository.findByAutor(autor);
    }

    public Artigo saveArtigo(Artigo artigo) {
        return artigoRepository.save(artigo);
    }
}
