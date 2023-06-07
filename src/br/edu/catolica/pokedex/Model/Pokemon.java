package br.edu.catolica.pokedex.Model;

import br.edu.catolica.pokedex.Abstracts.*;
import br.edu.catolica.pokedex.Interface.Falar;

import java.util.ArrayList;
import java.util.List;

public class Pokemon extends APokemon implements Falar{
    AInfoBasicas infoBasicas;
    ACaracteristicasFisicas caracteristicasFisicas;
    AStats stats;
    List<AHabilidade> habilidades;
    List<AGolpe> golpes;

    public Pokemon (AInfoBasicas infoBasicas, ACaracteristicasFisicas caracteristicasFisicas,
                    AStats stats, AHabilidade habilidade){
     this.infoBasicas = infoBasicas;
     this.caracteristicasFisicas = caracteristicasFisicas;
     this.stats = stats;
     this.habilidades = new ArrayList<>();
     this.habilidades.add(habilidade);
     this.golpes = new ArrayList<>();
    }

    public AInfoBasicas getInfoBasicas() {
        return infoBasicas;
    }

    public void setInfoBasicas(AInfoBasicas infoBasicas) {
        this.infoBasicas = infoBasicas;
    }

    public ACaracteristicasFisicas getCaracteristicasFisicas() {
        return caracteristicasFisicas;
    }

    public void setCaracteristicasFisicas(ACaracteristicasFisicas caracteristicasFisicas) {
        this.caracteristicasFisicas = caracteristicasFisicas;
    }

    public AStats getStats() {
        return stats;
    }

    public void setStats(AStats stats) {
        this.stats = stats;
    }

    public List<AHabilidade> getHabilidades() {
        return habilidades;
    }

    public void addHabilidade(AHabilidade habilidade){
        try {
            this.habilidades.add(habilidade);
        }catch (Exception e){
            System.err.println(e);
        }
    }
    public void removerHabilidade(AHabilidade habilidade){
        try {
            this.habilidades.remove(habilidade);
        }catch (Exception e){
            System.err.println(e);
        }
    }

    public List<AGolpe> getGolpes() {
        return golpes;
    }

    public void addGolpe(AGolpe golpe){
        try {
            this.golpes.add(golpe);
        }catch (Exception e){
            System.err.println(e);
        }
    }
    public void removerGolpe(AGolpe golpe){
        try {
            this.golpes.remove(golpe);
        }catch (Exception e){
            System.err.println(e);
        }
    }

    @Override
    public void falar() {
        try {
            System.out.println(getCaracteristicasFisicas().getFala());
        }catch (Exception e){
            System.err.println(e);
        }
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "infoBasicas=" + infoBasicas +
                ", caracteristicasFisicas=" + caracteristicasFisicas +
                ", stats=" + stats +
                ", habilidades=" + habilidades +
                ", golpes=" + golpes +
                '}';
    }
}
