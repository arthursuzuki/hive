package br.com.projeto.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ArtigoController {

    @GetMapping("/artigo")
    public ModelAndView artigo() {
        return new ModelAndView("artigo");
    }
}
