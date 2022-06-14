package com.example.agendaescolar.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.agendaescolar.R;
import com.example.agendaescolar.adapters.CustomAdapter3;
import com.example.agendaescolar.db.DataBase;
import com.example.agendaescolar.model.DisciplinaModel;

import java.util.ArrayList;
import java.util.List;

public class Disciplina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disciplina);
        DataBase db = DataBase.getInstance(this.getApplicationContext());
        List<DisciplinaModel> disciplinas = db.disciplinaDao().getAllData();

        RecyclerView recyclerView = findViewById(R.id.lista_disciplinas);
        CustomAdapter3 customAdapter3 = new CustomAdapter3(disciplinas);
        recyclerView.setAdapter(customAdapter3);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));



    }

    public void botaoMenu(View view) {
        finish();
    }
}