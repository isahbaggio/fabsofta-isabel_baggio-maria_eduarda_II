package br.univille.restocchefmaisa.controller;

import br.univille.restocchefmaisa.dto.ReceitaDTO;
import br.univille.restocchefmaisa.service.ReceitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/receitas")
@CrossOrigin(origins = "*")
public class ReceitaController {

    @Autowired
    private ReceitaService receitaService;

    @GetMapping
    public List<ReceitaDTO> buscarReceitas(@RequestParam List<String> ingredientes) {
        return receitaService.buscarReceitas(ingredientes);
    }
}
