package com.genspringboot.project.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/* import com.fasterxml.jackson.annotation.JsonBackReference; */



 //Aqui le indicamos cual será el nombre de la tabla que almacene el nombre dentro de la base de datos
 //Luego crear los atributos de nuestro usuasrio
 //Como es uina tyabla tenemos q ue indicarle cual es la llave primaria, especificarle que lo que viene es un id.
 //Con el @Id le indicamos que lo que viene especificamente es un iD de la tabla
 //Generamos la llave primaria con el @GeneratedaValue
 // 

@Entity(name = "User")
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    //Podemos usar Column para especificarle una redaccion especifica para la tabla, ese name está diciendo que el nombre de la columna para el atributo last name se redacte así
    @Column(name = "last_name")
    private String lastName;
    @Column(name="email", unique = true)
    private String correo;
    //Despues de los atributos y antes del costructor debería ir la relacion one to one, esto es para dar un orden.
    //relacion one to one, para crear las relaciones tenemos que hacer esto:
    //jsonbackreference le estamos avisando que lo que viene es de tipo json, el one to one viene con instrucciones en json.
    //En estas relaciones uno es a uno da lo mismo por donde parto haciendo la relacion. 
    /* @JsonBackReference */
    //Creamos una relacion one to one y tenemos que mapearla con la relacion que vamos a llamar, esto conecta de orden logico como cascada, el fetch hace la conexion final, y faltaría definir el atributo con el que lo vamos a conectasr
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)//lazy cuando yo mando una relacion uno a uno
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private License license;

    //Creamos una relacion one to many, para hacer referencia a que el usuario puede hacer muchas compras y ventas. 

    /* @JsonBackReference */
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)//cuando recepciono una relacion uno es a uno o cuando envio una relacion uno es a muchos. 
    //debemos decirle que tendra una lista de compras./venta que tendra el usuario.  Debe ser Eager en el caso de uno es a muchos
    private List <BuySell> buySell;

    public User() {
    }

    public User(int id, String name, String lastName, String correo) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
}


