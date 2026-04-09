package com.example.receita.Repository;

import com.example.receita.Entity.Receita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceitaRepository extends JpaRepository <Receita, Long> {
}
