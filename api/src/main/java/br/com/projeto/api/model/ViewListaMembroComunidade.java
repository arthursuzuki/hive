package br.com.projeto.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ViewListaMembroComunidade {
    @Id
    private Long id;
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
