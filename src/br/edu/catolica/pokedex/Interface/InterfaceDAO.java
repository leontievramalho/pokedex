package br.edu.catolica.pokedex.Interface;

import br.edu.catolica.pokedex.Abstracts.APokemon;

import java.util.List;

public interface InterfaceDAO<T> {

    List<T> procurar(String nome);

    public boolean inserir(T objeto);

    public boolean remover(T objeto);
    public void atualizar(int pos, T objeto);

    public List<T> listarTodos();
}
