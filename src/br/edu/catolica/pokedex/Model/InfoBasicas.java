package br.edu.catolica.pokedex.Model;

import br.edu.catolica.pokedex.Abstracts.AInfoBasicas;

import java.util.Arrays;

public class InfoBasicas extends AInfoBasicas {
    String nome;
    String[] tipo;
    String descricao;

    public InfoBasicas(String nome, String tipo, String descricao){
        this.nome = nome;
        this.tipo = new String[1];
        this.tipo[0] = tipo;
        this.descricao = descricao;
    }
    public InfoBasicas(String nome, String tipo1, String tipo2, String descricao){
        this.nome = nome;
        this.tipo = new String[2];
        this.tipo[0] = tipo1;
        this.tipo[1] = tipo2;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        try {
            this.tipo = new String[1];
            this.tipo[0] = tipo;
        }catch (Exception e){
            System.err.println(e);
        }
    }

    public void setTipo(String tipo1, String tipo2) {
        try {
            this.tipo = new String[2];
            this.tipo[0] = tipo1;
            this.tipo[1] = tipo2;
        }catch (Exception e){
            System.err.println(e);
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "InfoBasicas{" +
                "nome='" + nome + '\'' +
                ", tipo=" + Arrays.toString(tipo) +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
