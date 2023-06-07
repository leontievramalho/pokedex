package br.edu.catolica.pokedex.DAO;

import br.edu.catolica.pokedex.Abstracts.AbstrataIdentificador;
import br.edu.catolica.pokedex.Interface.InterfaceDAO;

import java.util.ArrayList;
import java.util.List;

public class DAO<T extends AbstrataIdentificador> implements InterfaceDAO<T> {

    public List<T> baseDeDados = new ArrayList<>();
    @Override
    public List<T> procurar(String nome) {
        List<T> resultado = new ArrayList<>();
        try{
            for(T objt : this.baseDeDados){
                if(objt.getInfoBasicas().getNome().toLowerCase().contains(nome)){
                    resultado.add(objt);
                }
            }
        } catch (Exception e){
            System.err.println(e);
        }
        return resultado;
    }

    @Override
    public boolean inserir(T objeto) {
        return this.baseDeDados.add(objeto);
    }

    @Override
    public boolean remover(T objeto) {
        return this.baseDeDados.remove(objeto);
    }

    @Override
    public void atualizar(int pos, T objeto) {
        this.baseDeDados.set(pos, objeto);
    }

    @Override
    public List<T> listarTodos() {
        System.out.println(this.baseDeDados);
        return this.baseDeDados;
    }
}
