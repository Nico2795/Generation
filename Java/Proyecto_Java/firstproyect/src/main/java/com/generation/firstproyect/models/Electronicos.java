package com.generation.firstproyect.models;

public class Electronicos {
    String cables;
    String fuenteDeEnergia;
    String placaElectronica;
    String botones;
    String memoria;
    String ventilación;
    String panelElectronico;
    
    
    public Electronicos() {
    }


    
    public Electronicos(String cables, String fuenteDeEnergia, String placaElectronica, String botones, String memoria,
            String ventilación, String panelElectronico) {
        this.cables = cables;
        this.fuenteDeEnergia = fuenteDeEnergia;
        this.placaElectronica = placaElectronica;
        this.botones = botones;
        this.memoria = memoria;
        this.ventilación = ventilación;
        this.panelElectronico = panelElectronico;
    }



    public String getCables() {
        return cables;
    }


    public void setCables(String cables) {
        this.cables = cables;
    }


    public String getFuenteDeEnergia() {
        return fuenteDeEnergia;
    }


    public void setFuenteDeEnergia(String fuenteDeEnergia) {
        this.fuenteDeEnergia = fuenteDeEnergia;
    }


    public String getPlacaElectronica() {
        return placaElectronica;
    }


    public void setPlacaElectronica(String placaElectronica) {
        this.placaElectronica = placaElectronica;
    }


    public String getBotones() {
        return botones;
    }


    public void setBotones(String botones) {
        this.botones = botones;
    }


    public String getMemoria() {
        return memoria;
    }


    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }


    public String getVentilación() {
        return ventilación;
    }


    public void setVentilación(String ventilación) {
        this.ventilación = ventilación;
    }


    public String getPanelElectronico() {
        return panelElectronico;
    }


    public void setPanelElectronico(String panelElectronico) {
        this.panelElectronico = panelElectronico;
    }



    @Override
    public String toString() {
        return "Electronicos [cables=" + cables + ", fuenteDeEnergia=" + fuenteDeEnergia + ", placaElectronica="
                + placaElectronica + ", botones=" + botones + ", memoria=" + memoria + ", ventilación=" + ventilación
                + ", panelElectronico=" + panelElectronico + "]";
    }

    
    
}
