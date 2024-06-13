package br.com.projeto.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ComunidadeAcademicaController {

    @GetMapping("/comunidade_academica")
    public ModelAndView comunidadeAcademica() {
        return new ModelAndView("comunidade_academica");
    }

    @GetMapping("/listao")
    public ModelAndView listao() {
        return new ModelAndView("listao");
    }

    @GetMapping("/perfil")
    public ModelAndView perfil() {
        return new ModelAndView("perfil");
    }
}
