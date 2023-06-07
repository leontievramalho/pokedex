package br.edu.catolica.pokedex.Model;

import br.edu.catolica.pokedex.Abstracts.ALinhaEvolutiva;
import br.edu.catolica.pokedex.Interface.Evolucao;

import java.util.List;

public class LinhaEvolutiva extends ALinhaEvolutiva implements Evolucao {
    public Pokemon pokemon;
    public Pokemon evolucao;
    public String metodo;

    public LinhaEvolutiva(Pokemon pokemon, Pokemon evolucao, String metodo){
        this.pokemon = pokemon;
        this.evolucao = evolucao;
        this.metodo = metodo;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public Pokemon getEvolucao() {
        return evolucao;
    }

    public void setEvolucao(Pokemon evolucao) {
        this.evolucao = evolucao;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public Pokemon evoluir(Pokemon pokemon, String metodo) {
        try {
            if (metodo.toLowerCase().equals(this.metodo.toLowerCase())) {
                return this.evolucao;
            }
            System.out.println("A evolução não pode ser concluída. Verifique o Pokémon e o método.");
        }catch (Exception e){
            System.err.println(e);
        }
        return pokemon;
    }

    @Override
    public String toString() {
        return "LinhaEvolutiva{" +
                "pokemon=" + pokemon +
                ", evolucao=" + evolucao +
                ", metodo='" + metodo + '\'' +
                '}';
    }
}
