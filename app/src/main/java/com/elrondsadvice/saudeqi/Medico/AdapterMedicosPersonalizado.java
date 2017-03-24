package com.elrondsadvice.saudeqi.Medico;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.elrondsadvice.saudeqi.R;
import com.elrondsadvice.saudeqi.model.Medico;

import java.util.List;

/**
 * Created by henri on 21/03/2017.
 */

public class AdapterMedicosPersonalizado extends BaseAdapter {

    //private final List<Medico> medicos;
    //private Activity act;
    private Context context;
    //private ArrayList<Medico> medicos;
    private List<Medico> medicos;

    //public AdapterMedicosPersonalizado(ArrayList<Medico> medicos, Activity act) {
    public AdapterMedicosPersonalizado(Context context, List<Medico> medicos) {

        //this.medicos = new ArrayList<Medico>(medicos);
        this.medicos =  medicos;
        this.context = context;
        //this.act = act;
    }

    @Override
    public int getCount() {
        return medicos.size();
    }

    @Override
    public Object getItem(int position) {
        return medicos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view;
        ViewHolderMedico holder;

        if( convertView == null) {
            view = LayoutInflater.from(context)
                    .inflate(R.layout.listmedicoslivre, parent, false);
            holder = new ViewHolderMedico(view);
            view.setTag(holder);
        }else {
            view = convertView;
            holder = (ViewHolderMedico) view.getTag();
        }

        Medico medico = medicos.get(position);

        //populando as Views
        holder.nome.setText(medico.getNome());
        holder.descricao.setText(medico.getEspecialidade());
        holder.imagem.setImageResource(R.drawable.ic_account_circle_white_48dp);
        holder.rBar.setRating(2);


        return view;
    }
}


