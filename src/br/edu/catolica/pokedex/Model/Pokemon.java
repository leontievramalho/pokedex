package br.edu.catolica.pokedex.Model;

import br.edu.catolica.pokedex.Abstracts.ACaracteristicasFisicas;
import br.edu.catolica.pokedex.Abstracts.AHabilidade;
import br.edu.catolica.pokedex.Abstracts.AInfoBasicas;
import br.edu.catolica.pokedex.Abstracts.AStats;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    AInfoBasicas infoBasicas;
    ACaracteristicasFisicas caracteristicasFisicas;
    AStats stats;
    List<AHabilidade> habilidades;
    List<Golpe> golpes;

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
        this.habilidades.add(habilidade);
    }
    public void removerHabilidade(AHabilidade habilidade){
        this.habilidades.remove(habilidade);
    }

    public List<Golpe> getGolpes() {
        return golpes;
    }

    public void addGolpe(Golpe golpe){
        this.golpes.add(golpe);
    }
    public void removerGolpe(Golpe golpe){
        this.golpes.remove(golpe);
    }
}
