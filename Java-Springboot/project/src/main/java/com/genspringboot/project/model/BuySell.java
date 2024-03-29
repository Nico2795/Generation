package com.genspringboot.project.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/* import com.fasterxml.jackson.annotation.JsonManagedReference; */

@Entity(name="BuySell")
public class BuySell {
    @Id
    @GeneratedValue
    private Integer id;
    @Range(min=0)
    private int monto; //el monto no puede permitir valores menores a 0, es por esto que podemos ocupar el range
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaCompra;

    //recepcionar One to many (many to one)

    /* @JsonManagedReference */
    //cuando se recibe una relacion many to one el fecth type es LAZY
    @ManyToOne(fetch = FetchType.LAZY)
    //vamos a unir la columna user_id y que los datos vienen de User user;
    @JoinColumn(name="user_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private User user;

    //many to many auto
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name="CarSell",
        joinColumns = @JoinColumn(name="buySell_id"),
        inverseJoinColumns = @JoinColumn(name = "car_id")
    )
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private List <Car> car;

    public BuySell() {
    }

    
    
    public BuySell(Integer id, @Range(min = 0) int monto, Date fechaCompra, User user, List<Car> car) {
        this.id = id;
        this.monto = monto;
        this.fechaCompra = fechaCompra;
        this.user = user;
        this.car = car;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Car> getCar() {
        return car;
    }

    public void setCar(List<Car> car) {
        this.car = car;
    }

    
    
}
