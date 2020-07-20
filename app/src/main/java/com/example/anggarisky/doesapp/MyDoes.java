package com.example.anggarisky.doesapp;

public class MyDoes {

    String titledoes ,datedoes,descjjdoes;

    public MyDoes() {
    }

    public MyDoes(String titledoes, String datedoes, String descjjdoes) {
        this.titledoes = titledoes;
        this.datedoes = datedoes;
        this.descjjdoes = descjjdoes;
    }

    public String getTitledoes() {
        return titledoes;
    }

    public void setTitledoes(String titledoes) {
        this.titledoes = titledoes;
    }

    public String getDatedoes() {
        return datedoes;
    }

    public void setDatedoes(String datedoes) {
        this.datedoes = datedoes;
    }

    public String getDescjjdoes() {
        return descjjdoes;
    }

    public void setDescjjdoes(String descjjdoes) {
        this.descjjdoes = descjjdoes;
    }
}
