package com.klu.skill2.main;

import com.klu.skill2.dao.ProductDAO;
import com.klu.skill2.entity.Product;

public class MainApp {

    public static void main(String[] args) {

        ProductDAO dao = new ProductDAO();

        Product p1 = new Product("Dell i5", "Laptop", 55000, 10);
        Product p2 = new Product("Samsung", "Phone", 20000, 20);

        dao.addProduct(p1);
        dao.addProduct(p2);

        Product product = dao.getProduct(1);
        if (product != null) {
            System.out.println(product.getName());
        } else {
            System.out.println("Product not found");
        }

        dao.updateProduct(1, 60000, 8);
        System.out.println("Product updated");

        dao.deleteProduct(2);
        System.out.println("Product deleted");
    }
}