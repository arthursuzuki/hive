package br.com.projeto.api.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Artigo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Usuario autor;

    @Column(columnDefinition = "TEXT")
    private String inicioArtigo;

    @Column(columnDefinition = "TEXT")
    private String conteudoCompleto;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime dataPublicacao;

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

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    public String getInicioArtigo() {
        return inicioArtigo;
    }

    public void setInicioArtigo(String inicioArtigo) {
        this.inicioArtigo = inicioArtigo;
    }

    public String getConteudoCompleto() {
        return conteudoCompleto;
    }

    public void setConteudoCompleto(String conteudoCompleto) {
        this.conteudoCompleto = conteudoCompleto;
    }

    public LocalDateTime getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDateTime dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
}
