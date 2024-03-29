package com.genspringboot.project.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.validator.constraints.Range;

/* import com.fasterxml.jackson.annotation.JsonIgnore; */


@Entity(name="Car")
public class Car {
    @Id
    @GeneratedValue
    private Integer id;
    private String marca;
    private String modelo;
    private String color;
    @Range(min=0)
    private int valor;
    private int anio;

    //Many to many
    //Aqui nadie toma ni nadie recibe
   /*  @JsonIgnore */
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name =  "CarSell",//nombre de la tabla relacional
        joinColumns = @JoinColumn(name= "car_id"),//nombre de la columna de mi tabla
        inverseJoinColumns = @JoinColumn(name="buySell_id")//nombre de la columna de la tabla de la otra relacion
    )
    //nos va a decir que CarSell no existe asi que hay que crearlo. 
    private List <CarSell> carSell;

    public Car() {
    }

    public Car(Integer id, String marca, String modelo, String color, @Range(min = 0) int valor, int anio,
            List<CarSell> carSell) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.valor = valor;
        this.anio = anio;
        this.carSell = carSell;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public List<CarSell> getCarSell() {
        return carSell;
    }

    public void setCarSell(List<CarSell> carSell) {
        this.carSell = carSell;
    }

    
    

    
}
