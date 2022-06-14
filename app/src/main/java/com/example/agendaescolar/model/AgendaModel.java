package com.example.agendaescolar.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Entity
public class AgendaModel {





    @PrimaryKey(autoGenerate = true)
    private int primaryKey;

    @ColumnInfo(name="titulo")
    private String titulo;
    @ColumnInfo(name="data")
    private String data;
    @ColumnInfo(name="hora")
    private String hora;


    public AgendaModel(String titulo, String data, String hora) {
        this.titulo = titulo;
        this.data = data;
        this.hora = hora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(int primaryKey) {
        this.primaryKey = primaryKey;
    }
}
