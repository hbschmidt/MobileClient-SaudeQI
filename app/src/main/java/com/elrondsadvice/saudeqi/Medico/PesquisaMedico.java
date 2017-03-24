package com.elrondsadvice.saudeqi.Medico;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import com.elrondsadvice.saudeqi.R;
import com.elrondsadvice.saudeqi.model.Medico;

import java.util.ArrayList;
import java.util.List;

public class PesquisaMedico extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesquisa_medico);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        List<Medico> medicos = new ArrayList<Medico>();

        Medico dr = new Medico("Henrique", 22, "henrique@gmail.com");
        dr.setEspecialidade("Ginecologista");

        Medico dr2 = new Medico("João", 44, "joao@gmail.com");
        dr2.setEspecialidade("Oncologista");

        Medico dr3 = new Medico("Mariana", 22, "mariana@gmail.com");
        dr3.setEspecialidade("Geral");

        medicos.add(dr);
        medicos.add(dr2);
        medicos.add(dr3);

        ListView listaDeMedicos = (ListView) findViewById(R.id.lista);

        AdapterMedicosPersonalizado adapter = new AdapterMedicosPersonalizado(this, medicos);
        listaDeMedicos.setAdapter(adapter);

    }

}
