package com.example.agendaescolar.model;



import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.ArrayList;
import java.util.List;

@Entity
public class DisciplinaModel {

    @PrimaryKey(autoGenerate = true)
    private int cod;
    @ColumnInfo(name="nome")
    private String nome;
    @ColumnInfo(name="professor")
    private String professor;
    @ColumnInfo(name="dia")
    private int dia;
    @ColumnInfo(name="hora")
    private String hora;





    public DisciplinaModel(String nome, String professor, int dia, String hora) {
        this.nome = nome;
        this.professor = professor;
        this.dia = dia;
        this.hora = hora;

    }

    public String getNomeDia(){
        switch(dia){

            case 2:
                return "Segunda-feira";


            case 3:
                return "Terça-feira";


            case 4:
                return "Quarta-feira";


            case 5:
                return "Quinta-feira";


            case 6:
                return "Sexta-feira";


            case 7:
                return "Sábado";


            default:
                return "";


        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public java.lang.String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }


    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}
