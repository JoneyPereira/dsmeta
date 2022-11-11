package com.redua.dsmeta.controllers;

import com.redua.dsmeta.entities.Sale;
import com.redua.dsmeta.services.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SalesService service;

    @GetMapping
    public Page<Sale> buscaVendas(@RequestParam(value = "minDate", defaultValue = "") String minDate,
                                  @RequestParam(value = "maxDate", defaultValue = "") String maxDate,
                                  Pageable pageable){
        return service.findSales(minDate, maxDate, pageable);
    }
}
