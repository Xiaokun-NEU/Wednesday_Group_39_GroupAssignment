/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package ui;
//
//import model.ProductManagement.ProductCatalog;
//import model.Supplier.SupplierDirectory;
//import model.Personnel.Person;
//import model.Personnel.PersonDirectory;
//import model.ProductManagement.Product;
//import model.Supplier.Supplier;
//
///**
// * Class to initialize and provide access to product and supplier data.
// */
//public class spList {
//    private static ProductCatalog productCatalog;
//    private static SupplierDirectory supplierDirectory;
//    private static PersonDirectory personDirectory;
//    
//    public static void main(String[] args) {
//        initializeData();
//        }
//    public static void initializeData() {
//        
//        
//        productCatalog = new ProductCatalog();
//
//        productCatalog.newProduct("product1", 50, 100, 80);
//        productCatalog.newProduct("product2", 60, 150, 120);
//        productCatalog.newProduct("product3", 100, 150, 120);
//        productCatalog.newProduct("product4", 300, 120, 180);
//        productCatalog.newProduct("product5", 250, 100, 150);
//        productCatalog.newProduct("product6", 270, 80, 120);
//        productCatalog.newProduct("product7", 370, 240, 120);
//        productCatalog.newProduct("product8", 270, 80, 120);
//        productCatalog.newProduct("product9", 270, 80, 120);
//        productCatalog.newProduct("product10", 270, 80, 120);
//        productCatalog.newProduct("product11", 50, 100, 80);
//        productCatalog.newProduct("product12", 60, 150, 120);
//        productCatalog.newProduct("product13", 100, 150, 120);
//        productCatalog.newProduct("product14", 300, 120, 180);
//        productCatalog.newProduct("product15", 250, 100, 150);
//        productCatalog.newProduct("product16", 270, 80, 120);
//        productCatalog.newProduct("product17", 370, 240, 120);
//        productCatalog.newProduct("product18", 270, 80, 120);
//        productCatalog.newProduct("product19", 270, 80, 120);
//        productCatalog.newProduct("product20", 270, 80, 120);
//       
//     
//        supplierDirectory = new SupplierDirectory();
//        
//        supplierDirectory.newSupplier("Supplier1");
//        supplierDirectory.newSupplier("Supplier2");
//        supplierDirectory.newSupplier("Supplier3");
//        supplierDirectory.newSupplier("Supplier4");
//        supplierDirectory.newSupplier("Supplier5");
//        
//        SupplierDirectory supplierDirectory = new SupplierDirectory();
//
//        Supplier supplier1 = supplierDirectory.newSupplier("Supplier1");
//        Supplier supplier2 = supplierDirectory.newSupplier("Supplier2");
//
//        supplier1.getProductCatalog().addProduct(new Product("Product1", 50, 100, 80));
//        supplier1.getProductCatalog().addProduct(new Product("Product2", 60, 120, 90));
//
//        // Assign products to supplier2
//        supplier2.getProductCatalog().addProduct(new Product("Product3", 70, 150, 100));
//        supplier2.getProductCatalog().addProduct(new Product("Product4", 80, 200, 160));
//
//
//        PersonDirectory personDirectory = new PersonDirectory();
//
//        Person person1 = personDirectory.newPerson("001");
//        Person person2 = personDirectory.newPerson("002");
//        Person person3 = personDirectory.newPerson("003");
//        Person person4 = personDirectory.newPerson("004");
//        Person person5 = personDirectory.newPerson("005");
//        Person person6 = personDirectory.newPerson("006");
//        Person person7 = personDirectory.newPerson("007");
//        Person person8 = personDirectory.newPerson("008");
//        Person person9 = personDirectory.newPerson("009");
//        Person person10 = personDirectory.newPerson("010");
//        
//        
//    }
//    
//    public static ProductCatalog getProductCatalog() {
//        return productCatalog;
//    }
//
// 
//    public static SupplierDirectory getSupplierDirectory() {
//        return supplierDirectory;
//    }
//    
//    public static PersonDirectory getPersonList() {
//        return personDirectory;
//    }
//    
//    public static void productAndSupplier(Product product, Supplier supplier) {
//        supplier.addProduct(product);
//    }
//    
//}
package ui;

import model.ProductManagement.ProductCatalog;
import model.Supplier.SupplierDirectory;
import model.Personnel.Person;
import model.Personnel.PersonDirectory;
import model.ProductManagement.Product;
import model.Supplier.Supplier;

public class spList {
    private static ProductCatalog productCatalog;
    private static SupplierDirectory supplierDirectory;
    private static PersonDirectory personDirectory;

    public static void main(String[] args) {
        initializeData();
    }
//        productCatalog.newProduct("product1", 50, 100, 80);
//        productCatalog.newProduct("product2", 60, 150, 120);
//        productCatalog.newProduct("product3", 100, 150, 120);
//        productCatalog.newProduct("product4", 300, 120, 180);
//        productCatalog.newProduct("product5", 250, 100, 150);
//        productCatalog.newProduct("product6", 270, 80, 120);
//        productCatalog.newProduct("product7", 370, 240, 120);
//        productCatalog.newProduct("product8", 270, 80, 120);
//        productCatalog.newProduct("product9", 270, 80, 120);
//        productCatalog.newProduct("product10", 270, 80, 120);
//        productCatalog.newProduct("product11", 50, 100, 80);
//        productCatalog.newProduct("product12", 60, 150, 120);
//        productCatalog.newProduct("product13", 100, 150, 120);
//        productCatalog.newProduct("product14", 300, 120, 180);
//        productCatalog.newProduct("product15", 250, 100, 150);
//        productCatalog.newProduct("product16", 270, 80, 120);
//        productCatalog.newProduct("product17", 370, 240, 120);
//        productCatalog.newProduct("product18", 270, 80, 120);
//        productCatalog.newProduct("product19", 270, 80, 120);
//        productCatalog.newProduct("product20", 270, 80, 120);
    public static void initializeData() {
        // Initialize ProductCatalog
        productCatalog = new ProductCatalog();
        Product product1 = productCatalog.newProduct("product1", 50, 100, 80);
        Product product2 = productCatalog.newProduct("product2", 60, 150, 120);
        Product product3 = productCatalog.newProduct("product3", 100, 150, 120);
        Product product4 = productCatalog.newProduct("product4", 300, 120, 180);

        // Initialize SupplierDirectory
        supplierDirectory = new SupplierDirectory();
        Supplier supplier1 = supplierDirectory.newSupplier("Supplier1");
        Supplier supplier2 = supplierDirectory.newSupplier("Supplier2");

        // Associate products with suppliers
        productAndSupplier(product1, supplier1);
        productAndSupplier(product2, supplier1);
        productAndSupplier(product3, supplier2);
        productAndSupplier(product4, supplier2);

        // Initialize PersonDirectory
        personDirectory = new PersonDirectory();
        personDirectory.newPerson("001");
        personDirectory.newPerson("002");
        personDirectory.newPerson("003");
        personDirectory.newPerson("004");
        personDirectory.newPerson("005");
        personDirectory.newPerson("006");
        personDirectory.newPerson("007");
        personDirectory.newPerson("008");
        personDirectory.newPerson("009");
        personDirectory.newPerson("010");
    }

    // Getter for ProductCatalog
    public static ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    // Getter for SupplierDirectory
    public static SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    // Getter for PersonDirectory
    public static PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    // Associate a product with a supplier
    public static void productAndSupplier(Product product, Supplier supplier) {
        supplier.addProduct(product);
    }
    
}
