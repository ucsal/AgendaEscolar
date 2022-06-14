package com.example.agendaescolar.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class HorarioModel {

    private String dia;
    private LocalTime hora;
    private int numeroDia;



    public HorarioModel(int numeroDia, String hora) {
        this.numeroDia = numeroDia;
        this.hora = LocalTime.parse(hora);
        switch(numeroDia){

            case 2:
                this.dia = "Segunda-feira";
                break;

            case 3:
                this.dia = "Terça-feira";
                break;

            case 4:
                this.dia = "Quarta-feira";
                break;

            case 5:
                this.dia = "Quinta-feira";
                break;

            case 6:
                this.dia = "Sexta-feira";
                break;

            case 7:
                this.dia = "Sábado";
                break;

            default:
                this.dia = "";
                break;

        }
    }
    public int getNumeroDia() {
        return numeroDia;
    }

    public void setNumeroDia(int numeroDia) {
        this.numeroDia = numeroDia;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora.toString();
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
}
