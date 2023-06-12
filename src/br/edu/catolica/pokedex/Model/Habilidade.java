package br.edu.catolica.pokedex.Model;

import br.edu.catolica.pokedex.Abstracts.AHabilidade;

public class Habilidade extends AHabilidade {
    public String nome;
    public String efeito;

    public Habilidade(String nome, String efeito) {
        this.nome = nome;
        this.efeito = efeito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEfeito() {
        return efeito;
    }

    public void setEfeito(String efeito) {
        this.efeito = efeito;
    }

    @Override
    public String toString() {
        return "Habilidade{" +
                "nome='" + nome + '\'' +
                ", efeito='" + efeito + '\'' +
                '}';
    }
}
