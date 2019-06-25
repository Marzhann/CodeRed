package com.ubs.objects;

public class Program {
    public static void main(String[] args){
        Product gum = new Product(100, 2.56, "gum");
        Product banana = new Product(55, 9.99, "banana");
        Product iceCream = new Product(40, 14.99, "ice cream");
        //System.out.println(gum.totalPrice());
        Product[] products = new Product[3];
        products[0] = gum;
        products[1] = banana;
        products[2] = iceCream;

        double allTotalPrice = 0;
        for(int i = 0; i < products.length; i++){
            allTotalPrice = allTotalPrice + products[i].totalPrice();
        }
        System.out.println("Total price of all products is: " + allTotalPrice);

    }
}
