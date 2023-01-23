package com.genspringboot.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.genspringboot.project.model.CarSell;
import com.genspringboot.project.service.CarSellService;

@RestController
@CrossOrigin("*")
public class CarSellController {

    private CarSellService carSellService;

    public CarSellController(@Autowired CarSellService carSellService){
        this.carSellService = carSellService;
    }

    @PostMapping("/CarSell/save")
    public void guardarCarSell(@RequestBody CarSell carsell){ 
        carSellService.saveCarSell(carsell);
    }

    @PutMapping("/CarSell/update")
    public void actualizarLicencia(@RequestBody CarSell carsell){
        carSellService.updateCarSell(carsell);
    }

    @GetMapping("/CarSell/findAll")
    public List <CarSell> todasLasCarSell(){
        return carSellService.findAll();
    }

    @DeleteMapping("/CarSell/eliminarCarSell/{id}")
    public void deleteCarSell(@PathVariable Integer id){
        carSellService.eliminarCarSell(id);
    }

    //Estado
    @GetMapping("/CarSell/buscarPorCantidad/{cantidad}")
    public List <CarSell> buscarPorCantidad(@PathVariable int cantidad){
        return carSellService.buscarPorCantidad(cantidad);
    }
    //Estado y clase

    //Fecha de vencimiento & usuario
    
}
    

