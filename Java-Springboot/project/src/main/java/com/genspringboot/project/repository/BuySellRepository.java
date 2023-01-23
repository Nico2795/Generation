package com.genspringboot.project.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.genspringboot.project.model.BuySell;

public interface BuySellRepository extends JpaRepository <BuySell, Integer> {

    @Query(value = "select * from buySell where monto = ?1", nativeQuery = true)
    List<BuySell> findAllByMonto(int monto);

    @Query(value= "select* from buySell where fechaCompra = ?1", nativeQuery = true)
    List<BuySell> findByFecha(Date fechaCompra);
    
}
