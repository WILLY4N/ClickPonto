package br.com.bitan.clickponto.model;

import java.time.LocalTime;
public class Ponto {
    private final int jornada = 480;
    private LocalTime entrada1;
    private LocalTime saida1;
    private LocalTime entrada2;
    private LocalTime saida2;

    public int getJornada() {
        return jornada;
    }

    public LocalTime getEntrada1() {
        return entrada1;
    }

    public void setEntrada1(LocalTime entrada1) {
        this.entrada1 = entrada1;
    }

    public LocalTime getSaida1() {
        return saida1;
    }

    public void setSaida1(LocalTime saida1) {
        this.saida1 = saida1;
    }

    public LocalTime getEntrada2() {
        return entrada2;
    }

    public void setEntrada2(LocalTime entrada2) {
        this.entrada2 = entrada2;
    }

    public LocalTime getSaida2() {
        return saida2;
    }

    public void setSaida2(LocalTime saida2) {
        this.saida2 = saida2;
    }

    //Construtor
    public Ponto() {

    }
}
