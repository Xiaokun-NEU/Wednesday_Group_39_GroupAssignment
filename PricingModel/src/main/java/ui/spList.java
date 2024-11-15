/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import model.ProductManagement.ProductCatalog;
import model.Supplier.SupplierDirectory;

/**
 * Class to initialize and provide access to product and supplier data.
 */
public class spList {
    private static ProductCatalog productCatalog;
    private static SupplierDirectory supplierDirectory;

    public static void initializeData() {

        productCatalog = new ProductCatalog("10 Products");

        productCatalog.newProduct("product1", 50, 100, 80);
        productCatalog.newProduct("product2", 60, 150, 120);
        productCatalog.newProduct("product3", 100, 150, 120);
        productCatalog.newProduct("product4", 300, 120, 180);
        productCatalog.newProduct("product5", 250, 100, 150);
        productCatalog.newProduct("product6", 270, 80, 120);
        productCatalog.newProduct("product7", 370, 240, 120);
        productCatalog.newProduct("product8", 270, 80, 120);
        productCatalog.newProduct("product9", 270, 80, 120);
        productCatalog.newProduct("product10", 270, 80, 120);

     
        supplierDirectory = new SupplierDirectory();
        supplierDirectory.newSupplier("Supplier1");
        supplierDirectory.newSupplier("Supplier2");
        supplierDirectory.newSupplier("Supplier3");
        supplierDirectory.newSupplier("Supplier4");
        supplierDirectory.newSupplier("Supplier5");
    }

 
    public static ProductCatalog getProductCatalog() {
        return productCatalog;
    }

 
    public static SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }
}
