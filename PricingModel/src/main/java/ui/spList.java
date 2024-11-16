/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

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
    
    public static void initializeData() {
        // Initialize ProductCatalog
        productCatalog = new ProductCatalog();
        Product product1 = productCatalog.newProduct("product1", 50, 30, 40);
        Product product2 = productCatalog.newProduct("product2", 60, 35, 45);
        Product product3 = productCatalog.newProduct("product3", 100, 60, 80);
        Product product4 = productCatalog.newProduct("product4", 300, 200, 250);
        Product product5 = productCatalog.newProduct("product5", 250, 150, 200);
        Product product6 = productCatalog.newProduct("product6", 270, 180, 220);
        Product product7 = productCatalog.newProduct("product7", 370, 250, 300);
        Product product8 = productCatalog.newProduct("product8", 270, 170, 210);
        Product product9 = productCatalog.newProduct("product9", 200, 100, 150);
        Product product10 = productCatalog.newProduct("product10", 270, 180, 240);
        Product product11 = productCatalog.newProduct("product11", 300, 250, 280);
        Product product12 = productCatalog.newProduct("product12", 60, 40, 50);
        Product product13 = productCatalog.newProduct("product13", 100, 75, 90);
        Product product14 = productCatalog.newProduct("product14", 300, 220, 260);
        Product product15 = productCatalog.newProduct("product15", 250, 170, 210);
        Product product16 = productCatalog.newProduct("product16", 270, 200, 230);
        Product product17 = productCatalog.newProduct("product17", 370, 300, 340);
        Product product18 = productCatalog.newProduct("product18", 150, 90, 120);
        Product product19 = productCatalog.newProduct("product19", 270, 200, 240);
        Product product20 = productCatalog.newProduct("product20", 310, 260, 290);
        Product product21 = productCatalog.newProduct("product21", 80, 50, 65);
        Product product22 = productCatalog.newProduct("product22", 110, 70, 95);
        Product product23 = productCatalog.newProduct("product23", 150, 100, 130);
        Product product24 = productCatalog.newProduct("product24", 320, 250, 280);
        Product product25 = productCatalog.newProduct("product25", 260, 190, 230);
        Product product26 = productCatalog.newProduct("product26", 280, 220, 250);
        Product product27 = productCatalog.newProduct("product27", 400, 300, 350);
        Product product28 = productCatalog.newProduct("product28", 190, 140, 170);
        Product product29 = productCatalog.newProduct("product29", 280, 210, 240);
        Product product30 = productCatalog.newProduct("product30", 340, 270, 310);
        Product product31 = productCatalog.newProduct("product31", 70, 45, 60);
        Product product32 = productCatalog.newProduct("product32", 90, 60, 75);
        Product product33 = productCatalog.newProduct("product33", 200, 150, 180);
        Product product34 = productCatalog.newProduct("product34", 320, 260, 300);
        Product product35 = productCatalog.newProduct("product35", 270, 200, 230);
        Product product36 = productCatalog.newProduct("product36", 290, 230, 270);
        Product product37 = productCatalog.newProduct("product37", 420, 350, 390);
        Product product38 = productCatalog.newProduct("product38", 200, 140, 170);
        Product product39 = productCatalog.newProduct("product39", 280, 210, 250);
        Product product40 = productCatalog.newProduct("product40", 310, 260, 290);
        Product product41 = productCatalog.newProduct("product41", 330, 270, 300);
        Product product42 = productCatalog.newProduct("product42", 75, 55, 65);
        Product product43 = productCatalog.newProduct("product43", 120, 80, 100);
        Product product44 = productCatalog.newProduct("product44", 220, 160, 200);
        Product product45 = productCatalog.newProduct("product45", 310, 240, 280);
        Product product46 = productCatalog.newProduct("product46", 270, 200, 230);
        Product product47 = productCatalog.newProduct("product47", 350, 280, 320);
        Product product48 = productCatalog.newProduct("product48", 180, 130, 160);
        Product product49 = productCatalog.newProduct("product49", 290, 230, 260);
        Product product50 = productCatalog.newProduct("product50", 310, 250, 290);
       
        
        // Initialize SupplierDirectory
        supplierDirectory = new SupplierDirectory();
        Supplier supplier1 = supplierDirectory.newSupplier("Supplier1");
        Supplier supplier2 = supplierDirectory.newSupplier("Supplier2");
        Supplier supplier3 = supplierDirectory.newSupplier("Supplier3");
        Supplier supplier4 = supplierDirectory.newSupplier("Supplier4");
        Supplier supplier5 = supplierDirectory.newSupplier("Supplier5");

        // Assign products to Supplier1
        productAndSupplier(product1, supplier1);
        productAndSupplier(product2, supplier1);
        productAndSupplier(product3, supplier1);
        productAndSupplier(product4, supplier1);
        productAndSupplier(product5, supplier1);
        productAndSupplier(product6, supplier1);
        productAndSupplier(product7, supplier1);
        productAndSupplier(product8, supplier1);
        productAndSupplier(product9, supplier1);
        productAndSupplier(product10, supplier1);
        
        // Assign products to Supplier2
        productAndSupplier(product11, supplier2);
        productAndSupplier(product12, supplier2);
        productAndSupplier(product13, supplier2);
        productAndSupplier(product14, supplier2);
        productAndSupplier(product15, supplier2);
        productAndSupplier(product16, supplier2);
        productAndSupplier(product17, supplier2);
        productAndSupplier(product18, supplier2);
        productAndSupplier(product19, supplier2);
        productAndSupplier(product20, supplier2);
        
        // Assign products to Supplier3
        productAndSupplier(product21, supplier3);
        productAndSupplier(product22, supplier3);
        productAndSupplier(product23, supplier3);
        productAndSupplier(product24, supplier3);
        productAndSupplier(product25, supplier3);
        productAndSupplier(product26, supplier3);
        productAndSupplier(product27, supplier3);
        productAndSupplier(product28, supplier3);
        productAndSupplier(product29, supplier3);
        productAndSupplier(product30, supplier3);

        // Assign products to Supplier4
        productAndSupplier(product31, supplier4);
        productAndSupplier(product32, supplier4);
        productAndSupplier(product33, supplier4);
        productAndSupplier(product34, supplier4);
        productAndSupplier(product35, supplier4);
        productAndSupplier(product36, supplier4);
        productAndSupplier(product37, supplier4);
        productAndSupplier(product38, supplier4);
        productAndSupplier(product39, supplier4);
        productAndSupplier(product40, supplier4);

        // Assign products to Supplier5
        productAndSupplier(product41, supplier5);
        productAndSupplier(product42, supplier5);
        productAndSupplier(product43, supplier5);
        productAndSupplier(product44, supplier5);
        productAndSupplier(product45, supplier5);
        productAndSupplier(product46, supplier5);
        productAndSupplier(product47, supplier5);
        productAndSupplier(product48, supplier5);
        productAndSupplier(product49, supplier5);
        productAndSupplier(product50, supplier5);

        // Add 10 suppliers
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
