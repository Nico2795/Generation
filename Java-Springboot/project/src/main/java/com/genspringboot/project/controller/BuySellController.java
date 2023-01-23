package com.genspringboot.project.controller;

import java.util.Date;
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

import com.genspringboot.project.model.BuySell;
import com.genspringboot.project.service.BuySellService;

@RestController
@CrossOrigin("*")

public class BuySellController {

    private BuySellService buySellService;

    public BuySellController(@Autowired BuySellService buySellService){
        this.buySellService = buySellService;
    }

    @PostMapping("/BuySell/save")
    public void guardarBuySell(@RequestBody BuySell buySell){ 
        buySellService.saveBuySell(buySell);
    }

    @PutMapping("/BuySell/update")
    public void actualizarLicencia(@RequestBody BuySell buySell){
        buySellService.updateBuySell(buySell);
    }

    @GetMapping("/BuySell/findAll")
    public List <BuySell> todasLasBuySell(){
        return buySellService.findAll();
    }

    @DeleteMapping("/BuySell/eliminarBuySell/{id}")
    public void deleteBuySell(@PathVariable Integer id){
        buySellService.eliminarBuySell(id);
    }

    //Estado
    @GetMapping("/BuySell/buscarPorMonto/{monto}")
    public List <BuySell> buscarPorMonto(@PathVariable int monto){
        return buySellService.buscarPorMonto(monto);
    }

    @GetMapping("/BuySell/buscarPorFecha/{fechaCompra}")
    public List <BuySell> buscarPorFecha(@PathVariable Date fechaCompra){
        return buySellService.buscarPorFecha(fechaCompra);
    }
    
    
}
    

