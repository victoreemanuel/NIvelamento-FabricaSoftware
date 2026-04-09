package com.example.receita.Service;

import com.example.receita.Entity.Ingrediente;
import com.example.receita.Repository.IngredienteRepository;
import jakarta.persistence.Id;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class IngredienteService {

    @Autowired
    private IngredienteRepository ingredienteRepository;
    private Object Id;

    public List<Ingrediente> listarIngrediente(){
        return ingredienteRepository.findAll();
    }

    public Ingrediente salvarIngrediente(Ingrediente ingrediente){
        return ingredienteRepository.save(ingrediente);
    }

    public Ingrediente atualizarIngrediente(Ingrediente ingrediente, Long id){
        return ingredienteRepository.save(ingrediente, Id);
    }

    public Ingrediente deletarIngrediente(Long id){
        return ingredienteRepository.deleteById(id);
    }


}
