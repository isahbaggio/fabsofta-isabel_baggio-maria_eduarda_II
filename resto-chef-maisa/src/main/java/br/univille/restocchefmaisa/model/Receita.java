package br.univille.restocchefmaisa.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Receita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ElementCollection
    private List<String> ingredientes;

    public Receita() {
    }

    public Receita(Long id, String nome, List<String> ingredientes) {
        this.id = id;
        this.nome = nome;
        this.ingredientes = ingredientes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
