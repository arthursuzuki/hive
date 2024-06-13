package br.com.projeto.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.projeto.api.model.Artigo;
import br.com.projeto.api.service.FazerArtigoService;

@Controller
public class FazerArtigoController {

    @Autowired
    private FazerArtigoService artigoService;

    @PostMapping("/api/artigos")
    public ModelAndView criarArtigo(@ModelAttribute Artigo artigo) {
        artigoService.salvarArtigo(artigo);
        return new ModelAndView("redirect:/comunidade_academica");
    }
}
