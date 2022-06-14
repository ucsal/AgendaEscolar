package com.example.agendaescolar.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.agendaescolar.R;
import com.example.agendaescolar.model.DisciplinaModel;

import java.util.List;


public class CustomAdapter3 extends RecyclerView.Adapter<CustomAdapter3.CustomViewHolder> {
    private List<DisciplinaModel> disciplinas;

    public CustomAdapter3(List<DisciplinaModel> disciplinas){
        this.disciplinas = disciplinas;
    }






    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_disciplina, parent, false);
        return new CustomAdapter3.CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int i) {
       holder.getNome().setText(disciplinas.get(i).getNome());
       holder.getDiaDaAula().setText(disciplinas.get(i).getNomeDia());



    }

    @Override
    public int getItemCount() {
        return disciplinas.size();
    }


    class CustomViewHolder extends RecyclerView.ViewHolder {

        private TextView nome;
        private TextView diaDaAula;




        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            nome = itemView.findViewById(R.id.nome_disciplina);
            diaDaAula = itemView.findViewById(R.id.dia_de_aula_disciplina);

        }

        public TextView getNome() {
            return nome;
        }

        public TextView getDiaDaAula() {
            return diaDaAula;
        }
    }
}