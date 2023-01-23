package com.generation.firstproyect.models;

public class  Portatil extends Electronicos {
    String programar;

    public Portatil() {
        super();
    }

    public Portatil(String cables, String fuenteDeEnergia, String placaElectronica, String botones, String memoria,
            String ventilación, String panelElectronico, String programar) {
        super(cables, fuenteDeEnergia, placaElectronica, botones, memoria, ventilación, panelElectronico);
        this.programar = programar;
    }

    public String getProgramar() {
        return programar;
    }

    public void setProgramar(String programar) {
        this.programar = programar;
    }

    @Override
    public String toString() {
        return super.toString()+"Portatil [programar=" + programar + "]";
    }

    

}
