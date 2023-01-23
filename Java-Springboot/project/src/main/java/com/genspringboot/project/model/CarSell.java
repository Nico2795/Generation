package com.genspringboot.project.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity(name="CarSell")
public class CarSell {
    @Id
    @GeneratedValue
    private Integer id;
    private int cantidad;

    //la relacion many to many implica que son dos many to one, para hacer la relacion final entre ambas

    //Debo poner la primera relacion many to one a auto
    //Al ser una relacion de tabla relacional ya no se llama a JSON
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JoinColumn(name="car_id")
    private Car car;

    //Ahora hacemos el otro many to one a buysell
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JoinColumn(name = "buySell_id")



    private BuySell buySell;

    public CarSell() {
    }

    public CarSell(Integer id, int cantidad, Car car, BuySell buySell) {
        this.id = id;
        this.cantidad = cantidad;
        this.car = car;
        this.buySell = buySell;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public BuySell getBuySell() {
        return buySell;
    }

    public void setBuySell(BuySell buySell) {
        this.buySell = buySell;
    }

    

    
}
