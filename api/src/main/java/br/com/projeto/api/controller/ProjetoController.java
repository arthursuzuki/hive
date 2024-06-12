package br.com.projeto.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.model.Projeto;
import br.com.projeto.api.service.ProjetoService;

@RestController
@RequestMapping("/api/projetos")
public class ProjetoController {
    @Autowired
    private ProjetoService projetoService;

    @GetMapping
    public List<Projeto> getAllProjetos() {
        return projetoService.findAllProjetos();
    }

    @PostMapping
    public Projeto createProjeto(@RequestBody Projeto projeto) {
        return projetoService.saveProjeto(projeto);
    }
}
