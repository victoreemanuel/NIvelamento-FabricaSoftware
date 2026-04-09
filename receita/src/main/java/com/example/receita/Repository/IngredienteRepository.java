package com.example.receita.Repository;

import com.example.receita.Entity.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredienteRepository extends JpaRepository <Ingrediente, Long> {
}
