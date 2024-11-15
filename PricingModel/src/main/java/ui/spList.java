/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import model.ProductManagement.Product;
import model.ProductManagement.ProductCatalog;
import model.Supplier.Supplier;
import model.Supplier.SupplierDirectory;

/**
 *
 * @author xiaokunchen
 */
public class spList {


public class Splist {
    public static void main(String[] args) {
        
        ProductCatalog catalog = new ProductCatalog("10 Products");

        Product product1 = catalog.newProduct("product1", 50, 100, 80);
        Product product2 = catalog.newProduct("product2", 60, 150, 120);
        Product product3 = catalog.newProduct("product3",100, 150, 120); 
        Product product4 = catalog.newProduct("product4",300, 120, 180); 
        Product product5 = catalog.newProduct("product5",250, 100, 150); 
        Product product6 = catalog.newProduct("product6",270, 80, 120); 
        Product product7 = catalog.newProduct("product7",370, 240, 120); 
        Product product8 = catalog.newProduct("product8",270, 80, 120); 
        Product product9 = catalog.newProduct("product9",270, 80, 120); 
        Product product10 = catalog.newProduct("product10",270, 80, 120); 
       
        SupplierDirectory supplier = new SupplierDirectory();
        
        Supplier supplier1 = supplier.newSupplier("Supplier1");
        Supplier supplier2 = supplier.newSupplier("Supplier2");
        Supplier supplier3 = supplier.newSupplier("Supplier3");
        Supplier supplier4 = supplier.newSupplier("Supplier4");
        Supplier supplier5 = supplier.newSupplier("Supplier5");
        }
    }
}
