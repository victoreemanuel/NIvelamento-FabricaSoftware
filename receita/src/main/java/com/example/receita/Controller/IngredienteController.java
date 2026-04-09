package com.example.receita.Controller;

import com.example.receita.Entity.Ingrediente;
import com.example.receita.Service.IngredienteService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingrediente")
public class IngredienteController {

    @Autowired
    public IngredienteService ingredienteService;
    private Ingrediente id;

    @GetMapping
    public List<Ingrediente> listarIngrediente(){
        return ingredienteService.listarIngrediente();
    }

    @PostMapping
    public Ingrediente salvarIngrediente(@RequestBody Ingrediente ingrediente){
        return ingredienteService.salvarIngrediente(ingrediente);
    }

    @PutMapping
    public Ingrediente atualizarIngrediente (@RequestBody Ingrediente ingrediente, @PathVariable Long id){
        return ingredienteService.atualizarIngrediente(id, ingrediente);
    }

    @DeleteMapping
    public void deletarIngrediente(@PathVariable Long id){
        ingredienteService.deletarIngrediente(id);
    }
}
