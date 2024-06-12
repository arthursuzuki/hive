package br.com.projeto.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.model.Artigo;
import br.com.projeto.api.service.ArtigoService;

@RestController
@RequestMapping("/api/artigos")
public class ArtigoController {
    @Autowired
    private ArtigoService artigoService;

    @GetMapping
    public List<Artigo> getAllArtigos() {
        return artigoService.findAllArtigos();
    }

    @PostMapping
    public Artigo createArtigo(@RequestBody Artigo artigo) {
        return artigoService.saveArtigo(artigo);
    }
}
