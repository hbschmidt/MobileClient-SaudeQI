package com.elrondsadvice.saudeqi.dao;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by walterjunior on 14/03/17.
 */

public class BancoDAO extends SQLiteOpenHelper {

    private static final String NOMEBANCO = "SudadeQI";
    private static final int VERSAOBANCO = 1;
    private static final String TABLEPACIENTE = "CREATE TABLE Paciente (id INTERGER PRIMARY KEY, nome TEXT, idade INT, email TEXT);";
    private static final String TABLEMEDICO = "CREATE TABLE Medico (id INTERGER PRIMARY KEY, nome TEXT, idade int, email TEXT, especialidade TEXT, crm TEXT, cidade TEXT);";

    public BancoDAO(Context context) {
        super(context, NOMEBANCO, null, VERSAOBANCO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLEPACIENTE);
        db.execSQL(TABLEMEDICO);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Paciente;");

    }
}
