package com.example.agendaescolar.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.agendaescolar.R;

import java.util.List;


public class CustomAdapter2 extends RecyclerView.Adapter<CustomAdapter2.CustomViewHolder> {
    private List<String> nomesCompromissos;

    public CustomAdapter2(List<String> compromissos) {
        this.nomesCompromissos = compromissos;
    }


    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_nome, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int i) {
        holder.getNome().setText(nomesCompromissos.get(i));


    }

    @Override
    public int getItemCount() {
        return nomesCompromissos.size();
    }


    class CustomViewHolder extends RecyclerView.ViewHolder {

        private TextView nome;


        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            nome = itemView.findViewById(R.id.nome_da_disciplina_evento);


        }

        public TextView getNome() {
            return nome;
        }


    }
}