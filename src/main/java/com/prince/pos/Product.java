package com.prince.pos;

public class Product {
    private String name;
    private double price;
    private int stocks;

    public Product(String name, double price, int stocks){
        this.name = name;
        this.price = price;
        this.stocks = stocks;
    }
    // Getters to be able to access
    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getStocks(){
        return stocks;
    }
    //Setters
    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setStocks(int stocks) {
        this.stocks = stocks;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return name.equals(product.name);
    }
    @Override
    public int hashCode(){
        return name.hashCode();
    }
}
