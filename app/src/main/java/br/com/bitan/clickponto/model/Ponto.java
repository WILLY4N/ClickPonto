package br.com.bitan.clickponto.model;

import android.text.format.Time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ponto {
    //atributos
    //https://stackoverflow.com/questions/20326619/time-in-hhmm-format
    private int jornada=480;
    private LocalTime entrada1;
    private LocalTime saida1;
    private LocalTime entrada2;

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

    private LocalTime saida2;

        //Construtor
    public Ponto(){

    }
}
