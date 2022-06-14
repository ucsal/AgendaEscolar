package com.example.agendaescolar.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.agendaescolar.R;
import com.example.agendaescolar.model.AgendaModel;

import java.util.List;


public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {
    private List<AgendaModel> compromissos;

    public CustomAdapter (List<AgendaModel> compromissos){
        this.compromissos = compromissos;
    }






    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_agenda, parent, false);
        return new CustomAdapter.CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int i) {
       holder.getNome().setText((CharSequence) compromissos.get(i).getTitulo());
       holder.getDataHora().setText(compromissos.get(i).getData()+" "+compromissos.get(i).getHora());



    }

    @Override
    public int getItemCount() {
        return compromissos.size();
    }


    class CustomViewHolder extends RecyclerView.ViewHolder {

        private TextView nome;
        private TextView dataHora;




        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            nome = itemView.findViewById(R.id.nome_evento);
            dataHora = itemView.findViewById(R.id.data_e_hora_evento);

        }

        public TextView getNome() {
            return nome;
        }

        public TextView getDataHora() {
            return dataHora;
        }
    }
}