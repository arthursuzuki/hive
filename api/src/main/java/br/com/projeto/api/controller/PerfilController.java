package br.com.projeto.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.projeto.api.model.Artigo;
import br.com.projeto.api.model.Projeto;
import br.com.projeto.api.model.Usuario;
import br.com.projeto.api.service.PerfilService;
import br.com.projeto.api.service.UsuarioService;

@Controller
public class PerfilController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private PerfilService perfilService;

    @GetMapping("/perfil/{id}")
    public String perfil(@PathVariable Long id, Model model) {
        Usuario usuario = usuarioService.buscarPorId(id);
        List<Artigo> artigos = perfilService.listarArtigosDoUsuario(id);
        List<Projeto> projetos = perfilService.listarProjetosDoUsuario(id);

        model.addAttribute("usuario", usuario);
        model.addAttribute("artigos", artigos);
        model.addAttribute("projetos", projetos);

        return "perfil";
    }
}
