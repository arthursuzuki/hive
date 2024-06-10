package br.com.projeto.api.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@RestController
public class Controle {

    @GetMapping("/entrar")
    public String entrar(){
        return "index";
    }

    @RequestMapping("/home")
    public ModelAndView home(){
        return new ModelAndView("home");
    }

    @RequestMapping("/login_comunidade")
    public ModelAndView login_comunidade(){
        return new ModelAndView("login_comunidade");
    }

    @RequestMapping("/login_pesquisa")
    public ModelAndView login_pesquisa(){
        return new ModelAndView("login_pesquisa");
    }

    @RequestMapping("/comunidade_academica")
    public ModelAndView comunidade_academica(){
        return new ModelAndView("comunidade_academica");
    }

    @RequestMapping("/artigo")
    public ModelAndView artigo(){
        return new ModelAndView("artigo");
    }

}
