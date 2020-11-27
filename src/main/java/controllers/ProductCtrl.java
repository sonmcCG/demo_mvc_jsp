package controllers;

import models.entities.Product;
import models.services.product.ProductServiceImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@javax.servlet.annotation.WebServlet(name = "ProductCtrl", urlPatterns = "/products")
public class ProductCtrl extends javax.servlet.http.HttpServlet {
    ProductServiceImpl productService = new ProductServiceImpl();
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        List<Product> products = productService.findAll();
        request.setAttribute("products",products);
        request.getRequestDispatcher("/product/list.jsp").forward(request,response);
    }
}
