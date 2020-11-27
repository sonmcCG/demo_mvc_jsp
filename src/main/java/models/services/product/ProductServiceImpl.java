package models.services.product;

import models.dal.ConnectMySqlDb;
import models.entities.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements IProductService {
    private final String QUERY_GET_ALL = "select * from product";

    @Override
    public boolean add(Product product) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public List<Product> findAll() {
        List<Product> products = new ArrayList<>();
        try {
            Connection connection = ConnectMySqlDb.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(QUERY_GET_ALL);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                float price = rs.getFloat("price");
                Product p = new Product(id,name,price);
                products.add(p);
            }
        } catch (Exception e) {

        }
        return products;
    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public boolean update(Product p) {
        return false;
    }
}
