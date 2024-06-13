package br.com.projeto.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ViewArtigoProjeto {
    @Id
    private Long id;
    private String titulo;
    private String inicioArtigo;
    private String dataPublicacao;
    private Long autorId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInicioArtigo() {
        return inicioArtigo;
    }

    public void setInicioArtigo(String inicioArtigo) {
        this.inicioArtigo = inicioArtigo;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public Long getAutorId() {
        return autorId;
    }

    public void setAutorId(Long autorId) {
        this.autorId = autorId;
    }

}
