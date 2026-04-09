package com.example.receita.Controller;

import com.example.receita.Entity.Receita;
import com.example.receita.Service.ReceitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/receita")
public class ReceitaController {

    @Autowired
    public ReceitaService receitaService;
    private Receita Id;

    @GetMapping
    public List<Receita> listarReceita(){
        return receitaService.listarReceita();
    }

    @PostMapping
    public Receita salvarReceita(@RequestBody Receita receita){
        return receitaService.salvarReceita(receita, receita);
    }

    @PutMapping
    public Receita atualizarReceita(@RequestBody Receita receita, @PathVariable Long id){
        return receitaService.salvarReceita(Id, receita);
    }

    @DeleteMapping
    public void deletarReceita (@PathVariable Long id){
        receitaService.deletarReceita(id);
    }


}
