package com.ubs.superfarm;

import java.util.Random;

public class StrawberryField extends FarmingField {
    int snailsRisk;
    Random random = new Random();

    StrawberryField(){
        this.snailsRisk = random.nextInt(100);
        this.sowingCost = 30;
        this.name = "Strawberry Field";
    }

    @Override
    int calculateProfit(){
        if(snailsRisk > 50){
            return 0;
        }
        else{
            return this.baseProfitAfterHarvest * 2;
        }
    }
}
