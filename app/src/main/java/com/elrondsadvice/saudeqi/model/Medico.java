package com.elrondsadvice.saudeqi.model;

/**
 * Created by walterjunior on 14/03/17.
 */

public class Medico extends  Pessoa{

    public String especialidade;
    public String crm;
    public String cidade;

    public Medico(String nome, int idade, String email) {
        super(nome, idade, email);
    }


    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
