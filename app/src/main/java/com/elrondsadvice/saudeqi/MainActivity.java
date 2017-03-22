package com.elrondsadvice.saudeqi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.elrondsadvice.saudeqi.essencial.PesquisaMedico;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference firebaseReference = FirebaseDatabase.getInstance().getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseReference.child("teste").setValue(100);
    }

    public void chamarProximaTela(View v)
    {
        Intent intent = new Intent(this, PesquisaMedico.class);
        startActivity(intent);
    }
}
