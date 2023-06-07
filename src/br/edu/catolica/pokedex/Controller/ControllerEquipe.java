package br.edu.catolica.pokedex.Controller;

import br.edu.catolica.pokedex.DAO.DAOEquipe;
import br.edu.catolica.pokedex.DAO.DAOLinhaEvolutiva;
import br.edu.catolica.pokedex.Interface.Evolucao;
import br.edu.catolica.pokedex.Model.LinhaEvolutiva;
import br.edu.catolica.pokedex.Model.Pokemon;

public class ControllerEquipe implements Evolucao {
    public DAOEquipe equipe = new DAOEquipe();
    public DAOLinhaEvolutiva evolucoes = new DAOLinhaEvolutiva();

    @Override
    public Pokemon evoluir(Pokemon pokemon, String metodo){
        try {
            for (int i = 0; i < this.equipe.baseDeDados.size(); i++) {
                if (this.equipe.baseDeDados.get(i).equals(pokemon)) {
                    for (LinhaEvolutiva familia : this.evolucoes.baseDeDados) {
                        if (familia.getPokemon().equals(pokemon)) {
                            this.equipe.atualizar(i, familia.evoluir(pokemon, metodo));
                            return familia.evoluir(pokemon, metodo);
                        }
                    }
                }
            }
        }catch (Exception e){
            System.err.println(e);
        }
        System.out.println("A evolução não pode ser concluída. Verifique o Pokémon e o método." +
                " Verifique também se a linha evolutiva deste Pokémon está inserida no DAOEquipe.");
        return pokemon;
    }

    public boolean inserirPokemon(Pokemon pokemon){
        try {
            if (this.equipe.baseDeDados.size() < 6) {
                return this.equipe.inserir(pokemon);
            } else {
                System.out.println("Você já atingiu o máximo de 6 Pokémons");
            }
        } catch (Exception e){
            System.err.println(e);
        }
        return false;
    }

    public boolean removerPokemon(Pokemon pokemon){
        try {
            if (this.equipe.baseDeDados.size() > 1) {
                return this.equipe.remover(pokemon);
            } else {
                System.out.println("Você deve ter pelo menos 1 pokémon na sua equipe");
            }
        } catch (Exception e){
            System.err.println(e);
        }
        return false;
    }

}
