package com.ciklum.ciklumwebhw4.dao;

import com.ciklum.ciklumwebhw4.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {

}