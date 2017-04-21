package com.elrondsadvice.saudeqi;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText edtLogin;
    private EditText edtSenha;
    private Button btnLogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtLogin = (EditText) findViewById(R.id.edtLogin);
        edtSenha = (EditText) findViewById(R.id.edtSenha);
        btnLogar = (Button) findViewById(R.id.btnLogar);
    }

    private  boolean validarCamposLogin(String login, String senha)
    {
        boolean resultado = true;
        if(login == null || "".equals(login))
        {
            edtLogin.setError("Campo Login Obrigatório");
            resultado =  false;
        }

        if(senha == null || "".equals(senha))
        {
            edtSenha.setError("Campo Senha Obrigatório");
            resultado = false;
        }

        return resultado;
    }
}
