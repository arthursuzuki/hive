package br.com.projeto.api.controller;

import br.com.projeto.api.model.Projeto;
import br.com.projeto.api.service.FazerProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FazerProjetoController {

    @Autowired
    private FazerProjetoService projetoService;

    @PostMapping("/api/projetos")
    public ModelAndView criarProjeto(@ModelAttribute Projeto projeto) {
        projetoService.salvarProjeto(projeto);
        return new ModelAndView("redirect:/comunidade_academica");
    }
}
