package com.ubs.objects;

public class Product {
    int quantityInStore;
    double price;
    String name;

    Product(int quantityInStore, double price, String name){
        this.quantityInStore = quantityInStore;
        this.price = price;
        this.name = name;
    }

    double totalPrice(){
        return this.quantityInStore * this.price;
    }

}
