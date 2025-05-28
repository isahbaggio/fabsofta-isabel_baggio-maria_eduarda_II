package br.univille.restocchefmaisa.service;

import br.univille.restocchefmaisa.dto.ReceitaDTO;
import br.univille.restocchefmaisa.model.Receita;
import br.univille.restocchefmaisa.repository.ReceitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import java.util.*;

@Service
public class ReceitaService {

    @Autowired
    private ReceitaRepository receitaRepository;

    private Map<String, List<String>> substituicoes;

    @PostConstruct
    public void init() {
        substituicoes = Map.of(
                "cebola", List.of("cebolinha", "alho-poró"),
                "salsinha", List.of("coentro", "manjericão"),
                "pimenta", List.of("páprica", "pimenta-do-reino"),
                "azeite", List.of("óleo de girassol", "óleo de soja"),
                "sal", List.of("sal rosa", "sal marinho")
        );

        if(receitaRepository.count() == 0) {
            receitaRepository.saveAll(List.of(
                new Receita(null, "Macarronada simples", List.of("macarrão", "molho de tomate", "queijo", "cebola")),
                new Receita(null, "Sopa de legumes", List.of("batata", "cenoura", "cebola", "salsinha")),
                new Receita(null, "Omelete", List.of("ovo", "cebola", "sal", "pimenta")),
                new Receita(null, "Salada colorida", List.of("alface", "tomate", "cenoura", "azeite"))
            ));
        }
    }

    public List<ReceitaDTO> buscarReceitas(List<String> ingredientesUsuario) {
        List<Receita> receitas = receitaRepository.findAll();
        List<ReceitaDTO> resultado = new ArrayList<>();

        for (Receita receita : receitas) {
            List<String> faltando = new ArrayList<>();
            List<String> substituicoesSugeridas = new ArrayList<>();

            for (String ingrediente : receita.getIngredientes()) {
                if (!ingredientesUsuario.contains(ingrediente.toLowerCase())) {
                    faltando.add(ingrediente);

                    if (substituicoes.containsKey(ingrediente.toLowerCase())) {
                        substituicoesSugeridas.add("Substitua " + ingrediente + " por: " +
                                String.join(", ", substituicoes.get(ingrediente.toLowerCase())));
                    }
                }
            }

            int total = receita.getIngredientes().size();
            int disponiveis = total - faltando.size();

            if (disponiveis >= total / 2) {
                resultado.add(new ReceitaDTO(receita.getNome(), faltando, substituicoesSugeridas));
            }
        }

        resultado.sort(Comparator.comparingInt(r -> r.getIngredientesFaltando().size()));

        return resultado;
    }
}
