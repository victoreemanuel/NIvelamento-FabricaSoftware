package com.example.receita.Service;

import com.example.receita.Entity.Receita;
import com.example.receita.Repository.ReceitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceitaService {

    @Autowired
    private ReceitaRepository receitaRepository;

    public List<Receita> listarReceita(){
        return receitaRepository.findAll();
    }

    public Receita salvarReceita(Receita receita, Receita receita1){
        return receitaRepository.save(receita);
    }

    public Receita atualizarReceita(Receita receita, Long Id){
        return receitaRepository.save(receita);
    }

    public void deletarReceita(Long id){
        receitaRepository.deleteById(id);
    }
}
