package com.redua.dsmeta.repositories;

import com.redua.dsmeta.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepository extends JpaRepository<Sale, Long> {
}
