package br.com.projeto.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.api.model.ViewArtigoProjeto;
import br.com.projeto.api.model.ViewProjetosMembroComunidade;
import br.com.projeto.api.repository.ViewArtigosProjetoRepository;
import br.com.projeto.api.repository.ViewProjetosMembroComunidadeRepository;

@Service
public class ViewService {

    @Autowired
    private ViewArtigosProjetoRepository viewArtigosProjetoRepository;

    @Autowired
    private ViewProjetosMembroComunidadeRepository viewProjetosMembroComunidadeRepository;

    public List<ViewArtigoProjeto> listarArtigos() {
        return viewArtigosProjetoRepository.findAll();
    }

    public List<ViewProjetosMembroComunidade> listarProjetos() {
        return viewProjetosMembroComunidadeRepository.findAll();
    }
}
