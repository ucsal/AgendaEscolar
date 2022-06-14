package com.example.agendaescolar.view;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.agendaescolar.R;
import com.example.agendaescolar.adapters.CustomAdapter;
import com.example.agendaescolar.db.DataBase;
import com.example.agendaescolar.model.AgendaModel;

import java.util.ArrayList;
import java.util.List;

public class Agenda extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);

        DataBase db = DataBase.getInstance(this.getApplicationContext());
        List<AgendaModel> compromissos =  db.agendaDao().getAllData();



        RecyclerView recyclerView = findViewById(R.id.compromissos_tabela);
        CustomAdapter customAdapter = new CustomAdapter(compromissos);
        recyclerView.setAdapter(customAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));
    }


    public void botaoMenu(View view){
        finish();
    }



}