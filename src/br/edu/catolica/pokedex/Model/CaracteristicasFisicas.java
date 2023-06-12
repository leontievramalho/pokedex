package br.edu.catolica.pokedex.Model;

import br.edu.catolica.pokedex.Abstracts.ACaracteristicasFisicas;

public class CaracteristicasFisicas extends ACaracteristicasFisicas {
    public double alturaCm;
    public double pesoG;

    public CaracteristicasFisicas(double alturaCm, double pesoG, String fala) {
        this.alturaCm = alturaCm;
        this.pesoG = pesoG;
        this.fala = fala;
    }

    public double getAlturaCm() {
        return alturaCm;
    }

    public void setAlturaCm(double alturaCm) {
        this.alturaCm = alturaCm;
    }

    public double getPesoG() {
        return pesoG;
    }

    public void setPesoG(double pesoG) {
        this.pesoG = pesoG;
    }

    @Override
    public String toString() {
        return "CaracteristicasFisicas{" +
                "alturaCm=" + alturaCm +
                ", pesoG=" + pesoG +
                ", fala='" + fala + '\'' +
                '}';
    }
}

