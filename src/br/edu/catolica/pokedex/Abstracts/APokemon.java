package br.edu.catolica.pokedex.Abstracts;

public abstract class APokemon extends AbstrataIdentificador{
    public AInfoBasicas infoBasicas;

    public AInfoBasicas getInfoBasicas(){
        return infoBasicas;
    }

    public void setInfoBasicas(AInfoBasicas infoBasicas) {
        this.infoBasicas = infoBasicas;
    }
}
