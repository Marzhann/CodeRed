package com.ubs.superfarm;

import java.util.Random;

public class FarmingField {
    int sowingCost;
    int baseProfitAfterHarvest;
    int droughtRisk;
    String name;
    Random random = new Random();

    FarmingField(){
        this.sowingCost = 20;
        this.baseProfitAfterHarvest = 40;
        this.droughtRisk = random.nextInt(100);
        this.name = "Standard Field";
    }

    int calculateProfit(){
        if(droughtRisk > 50){
            return 0;
        }
        else{
            return baseProfitAfterHarvest;
        }
    }
}
