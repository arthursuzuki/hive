package br.com.projeto.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginComunidadeController {

    @GetMapping("/login_comunidade")
    public ModelAndView loginComunidade() {
        return new ModelAndView("login_comunidade");
    }
}
