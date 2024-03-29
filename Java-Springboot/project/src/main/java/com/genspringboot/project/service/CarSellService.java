package com.genspringboot.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.genspringboot.project.model.CarSell;
import com.genspringboot.project.repository.CarSellRepository;

@Service
@Transactional
public class CarSellService {
    private CarSellRepository carSellRepository;

    public CarSellService(CarSellRepository carSellRepository){
        this.carSellRepository = carSellRepository;
    }

    public void saveCarSell(CarSell carsell){
        carSellRepository.save(carsell);
    }

    public void updateCarSell(CarSell carsell){
        carSellRepository.save(carsell);
    }

    public List <CarSell> findAll(){
        return carSellRepository.findAll();
    }

    public void eliminarCarSell(Integer id){
        carSellRepository.deleteById(id);
    }

    //Estado
    public List <CarSell> buscarPorCantidad(int cantidad){
        return carSellRepository.findAllCantidad(cantidad);
    }
}
