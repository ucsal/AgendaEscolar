package com.example.agendaescolar.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.agendaescolar.R;
import com.example.agendaescolar.adapters.CustomAdapter3;
import com.example.agendaescolar.adapters.CustomAdapter4;
import com.example.agendaescolar.model.Aulas;
import com.example.agendaescolar.model.DisciplinaModel;
import com.example.agendaescolar.model.HorarioModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Horario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horario);

        ArrayList<Aulas> lista = new ArrayList<>();

        Aulas segunda = new Aulas("Segunda-feira",new ArrayList<>());
        Aulas terca = new Aulas("Terça-feira",new ArrayList<>());
        Aulas quarta = new Aulas("Quarta-feira",new ArrayList<>());
        Aulas quinta = new Aulas("Quinta-feira",new ArrayList<>());
        Aulas sexta = new Aulas("Sexta-feira",new ArrayList<>());
        Aulas sabado = new Aulas("Sábado",new ArrayList<>());

        ArrayList<DisciplinaModel> disciplina = MainActivity.getDisciplinas();

        for(DisciplinaModel dm : disciplina){

                if(dm.getDia() == 2){
                    segunda.getAulaHorario().add(dm.getHora()+" - "+dm.getNome()+"\n");
                }else
                if(dm.getDia() == 3){
                    terca.getAulaHorario().add(dm.getHora()+" - "+dm.getNome()+"\n");
                }
                else
                if(dm.getDia() == 4){
                    quarta.getAulaHorario().add(dm.getHora()+" - "+dm.getNome()+"\n");
                }
                else
                if(dm.getDia() == 5){
                    quinta.getAulaHorario().add(dm.getHora()+" - "+dm.getNome()+"\n");
                }
                else
                if(dm.getDia() == 6){
                    sexta.getAulaHorario().add(dm.getHora()+" - "+dm.getNome()+"\n");
                }
                else {
                    sabado.getAulaHorario().add(dm.getHora()+" - "+dm.getNome()+"\n"

                    );
                }

        }

        Collections.sort(segunda.getAulaHorario());
        Collections.sort(terca.getAulaHorario());
        Collections.sort(quarta.getAulaHorario());
        Collections.sort(quinta.getAulaHorario());
        Collections.sort(sexta.getAulaHorario());
        Collections.sort(sabado.getAulaHorario());



        lista.add(segunda);
        lista.add(terca);
        lista.add(quarta);
        lista.add(quinta);
        lista.add(sexta);
        lista.add(sabado);

        RecyclerView recyclerView = findViewById(R.id.lista_horarios);
        CustomAdapter4 customAdapter4 = new CustomAdapter4(lista);
        recyclerView.setAdapter(customAdapter4);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));

    }


    public void botaoMenu(View view) {
        finish();
    }
}