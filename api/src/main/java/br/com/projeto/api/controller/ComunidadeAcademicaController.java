package br.com.projeto.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.projeto.api.service.ViewService;

@Controller
public class ComunidadeAcademicaController {

    @Autowired
    private ViewService viewService;

    @GetMapping("/comunidade_academica")
    public String comunidadeAcademica(Model model) {
        model.addAttribute("artigos", viewService.listarArtigos());
        model.addAttribute("projetos", viewService.listarProjetos());
        return "comunidade_academica";
    }
}
