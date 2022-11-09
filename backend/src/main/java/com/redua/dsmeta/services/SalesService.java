package com.redua.dsmeta.services;

import com.redua.dsmeta.entities.Sale;
import com.redua.dsmeta.repositories.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesService {

    @Autowired
    private SalesRepository repository;

    public List<Sale> findSales(){
        return repository.findAll();
    }
}
