package com.ciklum.ciklumwebhw4.service;

import com.ciklum.ciklumwebhw4.dao.ProductDao;
import com.ciklum.ciklumwebhw4.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductDao productDao;

    @Autowired
       public ProductService(ProductDao productDao) {
        this.productDao = productDao;
    }

    public List<Product> getAll() {
        return productDao.findAll();
    }

    public void delete(int id) {
        productDao.deleteById(id);
    }

    public void save(Product product) {
        productDao.save(product);
    }
}
