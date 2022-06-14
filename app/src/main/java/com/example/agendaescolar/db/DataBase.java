package com.example.agendaescolar.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.agendaescolar.model.AgendaModel;
import com.example.agendaescolar.model.DisciplinaModel;

@Database(entities = {AgendaModel.class, DisciplinaModel.class}, version = 1)
public abstract class DataBase extends RoomDatabase {

    public abstract AgendaDao agendaDao();

    public abstract DisciplinaDao disciplinaDao();

    public static DataBase INSTANCE;

    public static DataBase getInstance(Context context){
        if(INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), DataBase.class,"Banco de dados").allowMainThreadQueries().build();
        }

        return INSTANCE;
    }
}
