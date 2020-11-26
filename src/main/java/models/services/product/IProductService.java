package models.services.product;

import models.entities.Product;

import java.util.List;

public interface IProductService {
    boolean add(Product product);
    boolean delete(int id);
    List<Product> findAll();
    Product findById(int id);
    boolean update(Product p);
}
