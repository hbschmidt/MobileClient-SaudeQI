package com.elrondsadvice.saudeqi.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.elrondsadvice.saudeqi.model.Paciente;


public class PacienteDAO {

    Context context;
    BancoDAO dao;
    private static final String BANCONOME = "Paciente";

    public PacienteDAO(Context context) {
        this.context = context;
    }

    public void insere(Paciente paciente){
        dao = new BancoDAO(context);
        SQLiteDatabase db = dao.getWritableDatabase();
        ContentValues dados = getDadosDoPaciente(paciente);
    }

    private ContentValues getDadosDoPaciente(Paciente paciente) {

        ContentValues dados = new ContentValues();
        dados.put("nome", paciente.getNome());
        dados.put("idade", paciente.getIdade());
        dados.put("email", paciente.getEmail());

        return dados;
    }
}
