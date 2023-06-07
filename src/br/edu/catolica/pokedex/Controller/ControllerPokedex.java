package br.edu.catolica.pokedex.Controller;

import br.edu.catolica.pokedex.DAO.DAOPokedex;
import br.edu.catolica.pokedex.Model.Pokemon;

public class ControllerPokedex {
    DAOPokedex pokedex = new DAOPokedex();

    public boolean inserirPokemon(Pokemon pokemon){
        try {
            for(Pokemon pkm : this.pokedex.baseDeDados)
                if(pkm.getInfoBasicas().getNome().toLowerCase()
                        .equals(pokemon.getInfoBasicas().getNome().toLowerCase())){
                    return false;
                }
            return this.pokedex.inserir(pokemon);
        } catch (Exception e){
            System.err.println(e);
        }
        return false;
    }
}
