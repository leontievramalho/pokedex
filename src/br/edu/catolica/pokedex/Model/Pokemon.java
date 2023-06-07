package br.edu.catolica.pokedex.Model;

import br.edu.catolica.pokedex.Abstracts.*;
import br.edu.catolica.pokedex.Interface.Falar;
import java.util.HashSet;
import java.util.Set;

public class Pokemon extends APokemon implements Falar{
    public ACaracteristicasFisicas caracteristicasFisicas;
    public AStats stats;
    public Set<AHabilidade> habilidades;
    public Set<AGolpe> golpes;

    public Pokemon (AInfoBasicas infoBasicas, ACaracteristicasFisicas caracteristicasFisicas,
                    AStats stats, AHabilidade habilidade, AGolpe golpe){
     this.infoBasicas = infoBasicas;
     this.caracteristicasFisicas = caracteristicasFisicas;
     this.stats = stats;
     this.habilidades = new HashSet<>();
     this.habilidades.add(habilidade);
     this.golpes = new HashSet<>();
     this.golpes.add(golpe);
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

    public Set<AHabilidade> getHabilidades() {
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

    public Set<AGolpe> getGolpes() {
        return golpes;
    }

    public void addGolpe(AGolpe golpe){
        try {
            if(this.golpes.size()<4) {
                this.golpes.add(golpe);
            }else
                System.out.println("Número máximo de golpes atingidos, remova um golpe antes");
        }catch (Exception e){
            System.err.println(e);
        }
    }
    public void removerGolpe(AGolpe golpe){
        try {
            if (this.golpes.size()>1) {
                this.golpes.remove(golpe);
            } else
                System.out.println("Não foi possível remover. O pokémon deve ter pelo menos 1 golpe.");
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
