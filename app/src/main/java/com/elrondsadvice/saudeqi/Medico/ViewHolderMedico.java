package com.elrondsadvice.saudeqi.Medico;

import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.elrondsadvice.saudeqi.R;

/**
 * Created by henri on 24/03/2017.
 */

public class ViewHolderMedico {

    final TextView nome;
    final TextView descricao;
    final ImageView imagem;
    final RatingBar rBar;

    public ViewHolderMedico(View view) {
        nome = (TextView)
                view.findViewById(R.id.lista_curso_personalizada_nome);
        descricao = (TextView)
                view.findViewById(R.id.lista_curso_personalizada_descricao);
        imagem = (ImageView)
                view.findViewById(R.id.lista_curso_personalizada_imagem);
        rBar = (RatingBar)
                view.findViewById(R.id.ratingBar);
    }


}
