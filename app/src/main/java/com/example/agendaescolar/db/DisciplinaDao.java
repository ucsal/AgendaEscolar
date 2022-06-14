package com.example.agendaescolar.db;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.agendaescolar.model.AgendaModel;
import com.example.agendaescolar.model.DisciplinaModel;

import java.util.List;

@Dao
public interface DisciplinaDao {
    @Query("SELECT * FROM disciplinamodel")
    List<DisciplinaModel> getAllData();

    @Insert
    void insert (DisciplinaModel... disciplinaModels);

    @Delete
    void delete(DisciplinaModel... disciplinaModels);
}
