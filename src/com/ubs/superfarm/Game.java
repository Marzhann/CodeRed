package com.ubs.superfarm;


import java.util.Scanner;

public class Game {
    public static void main(String[] args){
/*
        StrawberryField firstStField = new StrawberryField();
        StrawberryField secondStField = new StrawberryField();

        EnhancedField firstEnhField = new EnhancedField(5);
        EnhancedField secondEnhField = new EnhancedField(10);

        firstStField.baseProfitAfterHarvest = 450;
        firstStField.baseProfitAfterHarvest = 500;
        firstEnhField.baseProfitAfterHarvest = 10;
        secondEnhField.baseProfitAfterHarvest = 10;

        FarmingField[] fieldsArr = new FarmingField[4];
        fieldsArr[0] = firstStField;
        fieldsArr[1] = secondStField;
        fieldsArr[2] = firstEnhField;
        fieldsArr[3] = secondEnhField;

        for(FarmingField each : fieldsArr) {
            System.out.println(each.calculateProfit());
        }
*/

        Inventory inventory = new Inventory();
        System.out.println("Starting capital is: " + inventory.money);
        System.out.println("How much profit would you like to earn?");
        Scanner userInput = new Scanner(System.in);
        int userProfit = userInput.nextInt();
        System.out.println("There are 3 type of fields: \nStandard field; Strawberry field; Enhanced field \n" +
                "Buy fields and gather you desired profit");

        while (inventory.money < userProfit){
            System.out.println("How many standard fields would you like to buy?");
            int userField = userInput.nextInt();
            if(userField > 0){
                System.out.println("Buying "+ userField +" fields");
                for(int i = 0; i < userField; i++){
                    inventory.buySimpleField();
                }
            }

            inventory.nextTurn();

            System.out.println("How many strawberry fields would you like to buy?");
            userField = userInput.nextInt();
            if(userField > 0){
                System.out.println("Buying "+ userField +" strawberry fields");
                for(int i = 0; i < userField; i++){
                    inventory.buyStrawberryField();
                }
            }

            inventory.nextTurn();

            if(inventory.money >= 5000){
                System.out.println("Your profit has reached 5000. Now you are able to buy an enhanced field");
                System.out.println("How many enhanced fields would you like to buy?");
                userField = userInput.nextInt();
                if(userField > 0){
                    System.out.println("Buying "+ userField + "enhanced fields");
                    for(int i = 0; i < userField; i++){
                        inventory.buyEnhancedField();
                    }
                }

                inventory.nextTurn();
            }
        }

        System.out.println("Congratulations, Happy Farmer! You have gathered desired profit. Your capital: " + inventory.money);

    }
}
