package br.edu.catolica.pokedex.Model;

import br.edu.catolica.pokedex.Abstracts.AGolpe;

public class Golpe extends AGolpe {
    public String Nome;
    public String tipo;
    public int poder;
    public String categoria;
    public double precisao;
    public String efeito;

    public Golpe(String nome, String tipo, int poder, String categoria, double precisao, String efeito) {
        Nome = nome;
        this.tipo = tipo;
        this.poder = poder;
        this.categoria = categoria;
        this.precisao = precisao;
        this.efeito = efeito;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecisao() {
        return precisao;
    }

    public void setPrecisao(double precisao) {
        this.precisao = precisao;
    }

    public String getEfeito() {
        return efeito;
    }

    public void setEfeito(String efeito) {
        this.efeito = efeito;
    }

    @Override
    public String toString() {
        return "Golpe{" +
                "Nome='" + Nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", poder=" + poder +
                ", categoria='" + categoria + '\'' +
                ", precisao=" + precisao +
                ", efeito='" + efeito + '\'' +
                '}';
    }
}
