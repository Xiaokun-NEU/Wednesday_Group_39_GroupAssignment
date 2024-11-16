/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.ProductManagement;

import java.util.ArrayList;

import model.OrderManagement.OrderItem;
import model.Supplier.Supplier;

/**
 *
 * @author kal bugrara
 */
public class Product {
    private String name;

    public String getName() {
        return name;
    }
    private double fixedPrice;
    private double costPrice;
    private double targetPrice;
    private int availability;
    private Supplier supplier;
    private double revenue;
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }
    ArrayList<OrderItem> orderitems;
        public Product( int fp, int cp, int tp) {
            
        fixedPrice = fp;
        costPrice = cp;
        targetPrice = tp;
        orderitems = new ArrayList();
    }
    public Product(String n, int fp, int cp, int tp, int qt) {
        name = n;
        fixedPrice = fp;
        costPrice = cp;
        targetPrice = tp;
        quantity = qt;
        orderitems = new ArrayList();
    }
        public Product updateProduct(int fp, int cp, int tp) {
        fixedPrice = fp;
        costPrice = cp;
        targetPrice = tp;
        return this; //returns itself
    }
    
    public void addOrderItem(OrderItem oi){     
        orderitems.add(oi);
    }
    //Number of item sales above target 
    public int getNumberOfProductSalesAboveTarget(){
        int sum = 0;
        for (OrderItem oi: orderitems){
            if(oi.isActualAboveTarget()==true) sum = sum +1;
        }
        return sum;
    }
    public int getNumberOfProductSalesBelowTarget(){
        int sum = 0;
        for (OrderItem oi: orderitems){
            if(oi.isActualBelowTarget()==true) sum = sum +1;
        }
        return sum;
    }    
    
        public boolean isProductAlwaysAboveTarget(){
        
        for (OrderItem oi: orderitems){
            if(oi.isActualAboveTarget()==false) return false; //
        }
        return true;
    }
    //calculates the revenues gained or lost (in relation to the target)
    //For example, if target is at $2000 and actual is $2500 then revenue gained
    // is $500 above the expected target. If the actual is $1800 then the lose will be $200
    // Add all these difference to get the total including wins and loses
    
        public double getOrderPricePerformance() {
        double sum = 0;
        for (OrderItem oi : orderitems) {
            sum = sum + oi.calculatePricePerformance();     //positive and negative values       
        }
        return sum;
    }
        public int getSalesVolume() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            sum = sum + oi.getOrderItemTotal();     //positive and negative values       
        }
        return sum;
    }
    public void setName(String n){
        name = n;
    }
    
    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Supplier getSupplier() {
        return supplier;
    }
    
    public void setFixedPrice(double fixPrice) {
        this.fixedPrice = fixPrice;
    }
    public double getFixedPrice(){
        return fixedPrice;
    }
    public double getCostPrice(){
        return costPrice;
    }

    public void setTargetPrice(double targetPrice) {
        this.targetPrice = targetPrice;
    }
    public double getTargetPrice() {return targetPrice;}

    
    
    @Override
        public String toString(){
            return name;
    } 
}