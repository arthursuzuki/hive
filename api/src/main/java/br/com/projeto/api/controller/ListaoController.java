package br.com.projeto.api.controller;

import br.com.projeto.api.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ListaoController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/listao")
    public String listao(Model model) {
        model.addAttribute("membros", usuarioService.listarMembrosComunidade());
        return "listao";
    }
}
