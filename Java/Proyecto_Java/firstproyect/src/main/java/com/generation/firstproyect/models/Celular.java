package com.generation.firstproyect.models;

public class Celular extends Electronicos {
    Boolean llamadas;

    public Celular() {
    }

    public Celular(String cables, String fuenteDeEnergia, String placaElectronica, String botones, String memoria,
            String ventilación, String panelElectronico, Boolean llamadas) {
        super(cables, fuenteDeEnergia, placaElectronica, botones, memoria, ventilación, panelElectronico);
        this.llamadas = llamadas;
    }

    public Boolean getLlamadas() {
        return llamadas;
    }

    public void setLlamadas(Boolean llamadas) {
        this.llamadas = llamadas;
    }

    @Override
    public String toString() {
        return super.toString()+"Celular [llamadas=" + llamadas + "]";
    }


    
}
