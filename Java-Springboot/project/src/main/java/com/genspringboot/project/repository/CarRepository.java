package com.genspringboot.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
/* import org.springframework.data.repository.CrudRepository; */

import com.genspringboot.project.model.Car;

public interface CarRepository extends JpaRepository <Car,Integer> {

    //Cuaadno yo haga funcionar esto y va a revisar en la posicion 1, reconoce el simbolo de interrogacion pero que va a buscar en la posicion 1 con los datos que le mandamos. 
    @Query(value = "SELECT * FROM car WHERE marca = ?1", nativeQuery = true)
    //Indicamos donde va a recepcionar
    List <Car> findAllAutoMarca (String marca);

    @Query(value = "SELECT * FROM car WHERE color = ?1", nativeQuery = true)
    List <Car> findAllAutoColor(String color);

    @Query(value = "SELECT * FROM car WHERE color = ?1 AND marca = ?2", nativeQuery = true)
    List <Car> findAllAutoColorMarca(String color, String marca);

        //Aqui le digo que me seleccione todo de car, idenfiticando el id como c, uniendo el id de car con carsell y el id de carsell, que me lo tire en un a lista. 
    @Query(value = "SELECT * FROM car c JOIN c.carsell cs", nativeQuery = true)
    List <Car> buscarAutosVendidos();
    
}
