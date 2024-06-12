package br.com.projeto.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.projeto.api.model.Artigo;
import br.com.projeto.api.model.Projeto;
import br.com.projeto.api.model.Usuario;
import br.com.projeto.api.service.ArtigoService;
import br.com.projeto.api.service.ProjetoService;
import br.com.projeto.api.service.UsuarioService;

@Controller
public class PerfilController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private ArtigoService artigoService;

    @Autowired
    private ProjetoService projetoService;

    @GetMapping("/perfil")
    public String perfil(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String email = auth.getName();
        Usuario usuario = usuarioService.findByEmail(email);
        List<Artigo> artigos = artigoService.findByAutor(usuario);
        List<Projeto> projetos = projetoService.findByLider(usuario);

        model.addAttribute("usuario", usuario);
        model.addAttribute("artigos", artigos);
        model.addAttribute("projetos", projetos);
        return "perfil";
    }
}

