package br.univille.restocchefmaisa.dto;

import java.util.List;

public class ReceitaDTO {
    private String nome;
    private List<String> ingredientesFaltando;
    private List<String> sugestoesSubstituicoes;

    public ReceitaDTO(String nome, List<String> ingredientesFaltando, List<String> sugestoesSubstituicoes) {
        this.nome = nome;
        this.ingredientesFaltando = ingredientesFaltando;
        this.sugestoesSubstituicoes = sugestoesSubstituicoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getIngredientesFaltando() {
        return ingredientesFaltando;
    }

    public void setIngredientesFaltando(List<String> ingredientesFaltando) {
        this.ingredientesFaltando = ingredientesFaltando;
    }

    public List<String> getSugestoesSubstituicoes() {
        return sugestoesSubstituicoes;
    }

    public void setSugestoesSubstituicoes(List<String> sugestoesSubstituicoes) {
        this.sugestoesSubstituicoes = sugestoesSubstituicoes;
    }
}
