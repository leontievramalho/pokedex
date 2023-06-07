package br.edu.catolica.pokedex.Abstracts;

import br.edu.catolica.pokedex.Model.InfoBasicas;

public abstract class AbstrataIdentificador {
    public AInfoBasicas infoBasicas;

    public AInfoBasicas getInfoBasicas() {
        return this.infoBasicas;
    }

    public void setInfoBasicas(AInfoBasicas infoBasicas) {
        this.infoBasicas = infoBasicas;
    }
}
