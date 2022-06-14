package com.example.agendaescolar.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.agendaescolar.R;
import com.example.agendaescolar.model.Aulas;

import java.util.List;


public class CustomAdapter4 extends RecyclerView.Adapter<CustomAdapter4.CustomViewHolder> {
    private List<Aulas> horarioAulas;


    public CustomAdapter4(List<Aulas> horarioAulas){
        this.horarioAulas = horarioAulas;

    }






    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_horario, parent, false);
        return new CustomAdapter4.CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int i) {
       holder.getNome().setText(horarioAulas.get(i).getNomeSemana());
        String aux = "";
       if(horarioAulas.get(i).getAulaHorario().isEmpty()){
           aux ="Sem aulas";
       }

           for(String s:horarioAulas.get(i).getAulaHorario()){
               aux= aux + s;

           }
           holder.getAulas().setText(aux);





    }

    @Override
    public int getItemCount() {
        return horarioAulas.size();
    }


    class CustomViewHolder extends RecyclerView.ViewHolder {

        private TextView nome;
        private TextView aulas;





        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            nome = itemView.findViewById(R.id.nome_dia_da_semana);
            aulas = itemView.findViewById(R.id.lista_aulas);

        }

        public TextView getAulas() {
            return aulas;
        }

        public TextView getNome() {
            return nome;
        }


    }
}