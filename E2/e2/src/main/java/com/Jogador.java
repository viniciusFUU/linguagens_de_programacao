package com;

public class Jogador {
    private String nome;
    private String posicao;
    private String clube;

    public Jogador(String nome, String posicao, String clube){
        this.nome = nome;
        this.posicao = posicao;
        this.clube = clube;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }
}
