/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import model.ProductManagement.ProductCatalog;
import model.Supplier.SupplierDirectory;
import model.Personnel.Person;
import model.Personnel.PersonDirectory;

/**
 * Class to initialize and provide access to product and supplier data.
 */
public class spList {
    private static ProductCatalog productCatalog;
    private static SupplierDirectory supplierDirectory;
    private static PersonDirectory personDirectory;
    
    public static void main(String[] args) {
        initializeData();
        }
    public static void initializeData() {
        
        
        productCatalog = new ProductCatalog();

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
    

        PersonDirectory personDirectory = new PersonDirectory();

        Person person1 = personDirectory.newPerson("001");
        Person person2 = personDirectory.newPerson("002");
        Person person3 = personDirectory.newPerson("003");
        Person person4 = personDirectory.newPerson("004");
        Person person5 = personDirectory.newPerson("005");
        Person person6 = personDirectory.newPerson("006");
        Person person7 = personDirectory.newPerson("007");
        Person person8 = personDirectory.newPerson("008");
        Person person9 = personDirectory.newPerson("009");
        Person person10 = personDirectory.newPerson("010");
        Person person11 = personDirectory.newPerson("011");
        Person person12 = personDirectory.newPerson("012");
        Person person13 = personDirectory.newPerson("013");
        Person person14 = personDirectory.newPerson("014");
        Person person15 = personDirectory.newPerson("015");
        Person person16 = personDirectory.newPerson("016");
        Person person17 = personDirectory.newPerson("017");
        Person person18 = personDirectory.newPerson("018");
        Person person19 = personDirectory.newPerson("019");
        Person person20 = personDirectory.newPerson("020");
        
    }
    
    public static ProductCatalog getProductCatalog() {
        return productCatalog;
    }

 
    public static SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }
    
    public static PersonDirectory getPersonList() {
        return personDirectory;
    }
}
