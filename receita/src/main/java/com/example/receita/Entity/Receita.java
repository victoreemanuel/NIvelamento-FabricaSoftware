package com.example.receita.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "/receita")
public class Receita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int tempoPreparo;
    private float custoAproximado;


    public void addIngrediente(){

    }

    public void removeIngrediente(){

    }

    public Receita() {
    }

    public Receita(Long id, String nome, int tempoPreparo, float custoAproximado) {
        this.id = id;
        this.nome = nome;
        this.tempoPreparo = tempoPreparo;
        this.custoAproximado = custoAproximado;
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

    public int getTempoPreparo() {
        return tempoPreparo;
    }

    public void setTempoPreparo(int tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }

    public float getCustoAproximado() {
        return custoAproximado;
    }

    public void setCustoAproximado(float custoAproximado) {
        this.custoAproximado = custoAproximado;
    }
}
