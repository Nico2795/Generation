package com.genspringboot.project.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.genspringboot.project.model.BuySell;
import com.genspringboot.project.repository.BuySellRepository;

@Service
@Transactional
public class BuySellService {
    private BuySellRepository buySellRepository;

    public BuySellService(BuySellRepository buySellRepository){
        this.buySellRepository = buySellRepository;
    }

    public void buySell(BuySell buySell){
        buySellRepository.save(buySell);
    }

    public List <BuySell> findAll(){
        return buySellRepository.findAll();
    }

    public void eliminarBuySell(Integer id){
        buySellRepository.deleteById(id);
    }

    public List <BuySell> buscarPorMonto(int monto){
        return buySellRepository.findAllByMonto(monto);
    }

    public List <BuySell> buscarPorFecha(Date fechaCompra){
        return buySellRepository.findByFecha(fechaCompra);
    
}

    public void saveBuySell(BuySell buySell) {
        buySellRepository.save(buySell);
    }

    public void updateBuySell(BuySell buySell) {
        buySellRepository.save(buySell);
    }

}
