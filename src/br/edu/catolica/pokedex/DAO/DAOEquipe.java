package br.edu.catolica.pokedex.DAO;

import br.edu.catolica.pokedex.Model.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class DAOEquipe extends DAO<Pokemon> {
    public Pokemon[] baseDeDados = new Pokemon[6];

    @Override
    public boolean inserir(Pokemon pokemon) {
        try {
            for (int i = 0; i < baseDeDados.length; i++) {
                if (baseDeDados[i] == null) {
                    baseDeDados[i] = pokemon;
                    return true;
                }
            }
        }catch (Exception e){
            System.err.println(e);
        }
        System.out.println("Número máximo de pokémons atingido.");
        return false;
    }
    @Override
    public void atualizar(int pos, Pokemon pokemon) {
        this.baseDeDados[pos] = pokemon;
    }

    @Override
    public boolean remover(Pokemon pokemon) {
        try {
            for (int i = 0; i < this.baseDeDados.length; i++) {
                if (this.baseDeDados[i] != null && this.baseDeDados[i].equals(pokemon)) {
                    this.baseDeDados[i] = null;
                    return true;
                }
            }
        }catch (Exception e){
            System.err.println(e);
        }
        return false;
    }

    @Override
    public List<Pokemon> procurar(String nome) {
        List<Pokemon> resultado = new ArrayList<>();
        try{
            for(Pokemon pk : this.baseDeDados){
                if(pk != null && pk.getInfoBasicas().getNome().toLowerCase().contains(nome.toLowerCase())){
                    resultado.add(pk);
                }
            }
        } catch (Exception e){
            System.err.println(e);
        }
        return resultado;
    }

    @Override
    public List<Pokemon> listarTodos() {
        List<Pokemon> todos = new ArrayList<>();
        for(Pokemon pk : this.baseDeDados){
            if(pk != null)
                System.out.println(pk.getInfoBasicas().getNome());
            todos.add(pk);
        }
        return todos;
    }
}
