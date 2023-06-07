package br.edu.catolica.pokedex.Interface;

import br.edu.catolica.pokedex.Model.LinhaEvolutiva;
import br.edu.catolica.pokedex.Model.Pokemon;

public interface Evolucao {
    Pokemon evoluir(Pokemon pokemon, String metodo);
}
