package com.example.agendaescolar.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.agendaescolar.model.AgendaModel;

import java.util.List;

@Dao
public interface AgendaDao {

    @Query("SELECT * FROM agendamodel")
    List<AgendaModel> getAllData();

    @Insert
    void insert (AgendaModel... agendaModels);

    @Delete
    void delete(AgendaModel... agendaModels);
}
