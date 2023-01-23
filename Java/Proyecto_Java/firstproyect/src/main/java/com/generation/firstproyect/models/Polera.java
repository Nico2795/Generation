package com.generation.firstproyect.models;

public class Polera {
    private String color;
    private String disenio;
    private String tamaño;
    private String material;
    private String genero;

    public Polera(){
        
    }

    public Polera(String color, String disenio, String tamaño, String material, String genero){
        this.color = color;
        this.disenio = disenio;
        this.tamaño = tamaño;
        this.material = material;
        this.genero = genero;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }
    

    public String getDisenio() {
        return disenio;
    }

    public void setDisenio(String disenio) {
        this.disenio = disenio;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    void abrigar(){
        System.out.println("estoy siendo usada");
    }
    
}
