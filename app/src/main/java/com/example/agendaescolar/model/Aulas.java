package com.example.agendaescolar.model;

import java.util.ArrayList;

public class Aulas {

    private String nomeSemana;
    private ArrayList<String> aulaHorario;

    public Aulas(String nomeSemana, ArrayList<String> aulaHorario) {
        this.nomeSemana = nomeSemana;
        this.aulaHorario = aulaHorario;
    }

    public String getNomeSemana() {
        return nomeSemana;
    }

    public void setNomeSemana(String nomeSemana) {
        this.nomeSemana = nomeSemana;
    }

    public ArrayList<String> getAulaHorario() {
        return aulaHorario;
    }

    public void setAulaHorario(ArrayList<String> aulaHorario) {
        this.aulaHorario = aulaHorario;
    }
}
