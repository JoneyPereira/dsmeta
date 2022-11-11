package com.redua.dsmeta.services;

import com.redua.dsmeta.entities.Sale;
import com.redua.dsmeta.repositories.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class SalesService {

    @Autowired
    private SalesRepository repository;

    public Page<Sale> findSales(String minDate, String maxDate, Pageable pageable){
        LocalDate min = LocalDate.parse(minDate);
        LocalDate max = LocalDate.parse(maxDate);

        return repository.findSales(min, max, pageable);
    }
}
