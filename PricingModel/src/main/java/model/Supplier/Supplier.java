/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Supplier;

import java.util.ArrayList;
import java.util.List;
import model.ProductManagement.Product;

import model.ProductManagement.ProductCatalog;
import model.ProductManagement.ProductSummary;
import model.ProductManagement.ProductsReport;

/**
 *
 * @author kal bugrara
 */
public class Supplier {

    String name;
    ProductCatalog productcatalog;
    ProductsReport productsreport;
    
    public double calculateTotalRevenue(){
        double totalRevenue = 0.0;
        for (Product product : products) {
        double targetPrice = product.getTargetPrice();
        int salesVolume = product.getQuantity();
        double costPrice = product.getCostPrice();
        totalRevenue += targetPrice * salesVolume - (costPrice * salesVolume);
    }
        return totalRevenue;
    }
    
    public double calculateTotalGrossProfit() {
    double totalGrossProfit = 0.0;
    for (Product product : products) {
        double targetPrice = product.getTargetPrice();
        int salesVolume = product.getQuantity();
        totalGrossProfit += targetPrice * salesVolume;
    }
    return totalGrossProfit;
}
    
    public int calculateTotalSalesVolume() {
    int totalSalesVolume = 0;
    for (Product product : products) {
        totalSalesVolume += product.getQuantity();
    }
    return totalSalesVolume;
}

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public double getGrossProfit() {
        return grossProfit;
    }

    public void setGrossProfit(double grossProfit) {
        this.grossProfit = grossProfit;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }
    private int sales;
    private double grossProfit;
    private double totalRevenue;
    private List<Product> products;

    public Supplier(String n) {
        name = n;
        productcatalog = new ProductCatalog("software");
        products = new ArrayList<>();

    }

    public ProductsReport prepareProductsReport() {

        if (productsreport == null) {
        productsreport = productcatalog.generatProductPerformanceReport();
    }
        return productsreport;
    }

    public ArrayList<ProductSummary> getProductsAlwaysAboveTarget() {

        if (productsreport == null) {
            productsreport = prepareProductsReport();
        }
        return productsreport.getProductsAlwaysAboveTarget();

    }

    public String getName() {
        return name;
    }

    public ProductCatalog getProductCatalog() {
        return productcatalog;
    }
    //add supplier product ..
    public void addProduct(Product product) {
        products.add(product);
        productcatalog.addProduct(product); // Keep the catalog and list consistent
        product.setSupplier(this); // Set the supplier for the product
    }

    public List<Product> getProducts() {
        return products;
    }
    //update supplier product ...
    @Override
    public String toString() {
        return name;

    }
}
