package com.ubs.superfarm;

import java.util.ArrayList;

public class Inventory {
    int money;

    Inventory(){
        this.money = 1000;
    }

    ArrayList<FarmingField> myFields = new ArrayList<>();

    public void buySimpleField(){
        FarmingField field = new FarmingField();
        if(money > field.sowingCost){
            myFields.add(field);
            money = money - field.sowingCost;
            System.out.println("Field bought! Cost is: "+ field.sowingCost);
        }
        else {
            System.out.println("You don't have enough money to buy a simple field");
        }
    }

    public void buyStrawberryField(){
        StrawberryField strField = new StrawberryField();
        if(money > strField.sowingCost){
            myFields.add(strField);
            money = money - strField.sowingCost;
            System.out.println("Strawberry field bought! Cost is: "+ strField.sowingCost);
        }
        else{
            System.out.println("You don't have enough money to buy a strawberry field");
        }
    }

    public void buyEnhancedField(){
        EnhancedField enhField = new EnhancedField();
        if(money > enhField.sowingCost){
            myFields.add(enhField);
            money = money - enhField.sowingCost;
            System.out.println("Enhanced field bought! Cost is: "+ enhField.sowingCost);
        }
        else{
            System.out.println("You don't have enough money to buy an enhanced field");
        }
    }

    public void nextTurn(){
        System.out.println("Next turn");
        for(FarmingField i : myFields){
            money = money + i.calculateProfit();
        }
        System.out.println("You have "+ money + " money.");
    }
}
