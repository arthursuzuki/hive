package br.com.projeto.api.controle;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



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

    @RequestMapping("/login1")
    public ModelAndView login1(){
        return new ModelAndView("login1");
    }

    @RequestMapping("/login2")
    public ModelAndView login2(){
        return new ModelAndView("login2");
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
