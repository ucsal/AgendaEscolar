package com.example.agendaescolar.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Database;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.agendaescolar.R;
import com.example.agendaescolar.adapters.CustomAdapter2;
import com.example.agendaescolar.db.DataBase;

import com.example.agendaescolar.model.AgendaModel;
import com.example.agendaescolar.model.DisciplinaModel;
import com.example.agendaescolar.model.HorarioModel;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
static ArrayList<DisciplinaModel> disciplinas = new ArrayList<>();
static ArrayList<AgendaModel> compromissos = new ArrayList<>();
    DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AgendaModel compromisso1 = new AgendaModel("Trabalho de Filosfia","14/01/2022","10:30");
        AgendaModel compromisso2 = new AgendaModel("Trabalho de História","15/01/2022","11:30");
        AgendaModel compromisso3 = new AgendaModel("Trabalho de Português","16/01/2022","12:30");
        AgendaModel compromisso4 = new AgendaModel("Trabalho de Inglês","17/01/2022","13:30");
        AgendaModel compromisso5 = new AgendaModel("Trabalho para Hoje",LocalDate.now().format(formatterData),"13:30");


        DataBase db = DataBase.getInstance(this.getApplicationContext());


        db.agendaDao().insert(compromisso1);
        db.agendaDao().insert(compromisso2);
        db.agendaDao().insert(compromisso3);
        db.agendaDao().insert(compromisso4);
        db.agendaDao().insert(compromisso5);

        HorarioModel horario1 = new HorarioModel(2,"10:00");
        HorarioModel horario2 = new HorarioModel(3,"11:00");
        HorarioModel horario3 = new HorarioModel(4,"12:00");
        HorarioModel horario4 = new HorarioModel(5,"13:00");
        HorarioModel horario5 = new HorarioModel(2,"13:00");

        DisciplinaModel disciplina1 = new DisciplinaModel("Matemática", "João", 2, "10:00");
        DisciplinaModel disciplina2 = new DisciplinaModel("Filosofia", "Maria", 3,"11:00");
        DisciplinaModel disciplina3 = new DisciplinaModel("Química", "Paulo", 4,"12:00");
        DisciplinaModel disciplina4 = new DisciplinaModel("Física", "Joana", 5,"13:00");
        DisciplinaModel disciplina5 = new DisciplinaModel("Programação", "Joana", 2,"14:00");

        db.disciplinaDao().insert(disciplina1);
        db.disciplinaDao().insert(disciplina2);
        db.disciplinaDao().insert(disciplina3);
        db.disciplinaDao().insert(disciplina4);
        db.disciplinaDao().insert(disciplina5);





    ArrayList<String> eventosDoDia = new ArrayList<String>();

    int cont = 0;
    String dataAtual = LocalDate.now().format(formatterData);
    for(AgendaModel a:db.agendaDao().getAllData()){



        if(dataAtual.equals(a.getData())){
            eventosDoDia.add(a.getTitulo());
            cont++;
        }
    }

    if (cont == 0){
        eventosDoDia.add("Sem eventos");
    }

        RecyclerView recyclerView = findViewById(R.id.tabela_de_eventos);
        CustomAdapter2 customAdapter2 = new CustomAdapter2(eventosDoDia);
        recyclerView.setAdapter(customAdapter2);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));






    }

    public static ArrayList<DisciplinaModel> getDisciplinas() {
        return disciplinas;
    }

    public static ArrayList<AgendaModel> getCompromissos() {
        return compromissos;
    }

    public void botaoHorario(View view){
        Intent intent = new Intent(this, Horario.class);
        startActivity(intent);
    }

    public void botaoAgenda(View view){

        Intent intent = new Intent(this, Agenda.class);
        startActivity(intent);
    }

    public void botaoDisciplina(View view){
        Intent intent = new Intent(this, Disciplina.class);
        startActivity(intent);
    }



}