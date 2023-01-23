package com.generation.firstproyect.models;

public class Taza {
    String tamaño;
    String color;
    String contenido;
    Boolean mango;
    String material;



    void contener(){
        System.out.println("Puedo contener liquidos frios y caliente");
    }

    void aislarTemperatura(){
        System.out.println("Estoy aislando la temperatura");
    }
}
