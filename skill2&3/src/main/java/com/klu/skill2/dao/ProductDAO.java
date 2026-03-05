package com.klu.skill2.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.klu.skill2.entity.Product;
import com.klu.skill2.util.HibernateUtil;

public class ProductDAO {

    // CREATE
    public void addProduct(Product product) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        session.persist(product);

        tx.commit();
        session.close();
    }

    // READ
    public Product getProduct(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Product product = session.find(Product.class, id);
        session.close();
        return product;
    }

    // UPDATE
    public void updateProduct(int id, double price, int quantity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Product product = session.find(Product.class, id);
        if (product != null) {
            product.setPrice(price);
            product.setQuantity(quantity);
            session.merge(product);
        }

        tx.commit();
        session.close();
    }

    // DELETE
    public void deleteProduct(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Product product = session.find(Product.class, id);
        if (product != null) {
            session.remove(product);
        }

        tx.commit();
        session.close();
    }
}