package com.ubs.superfarm;

public class EnhancedField extends FarmingField {
    int enhancementMultiplier;

    EnhancedField(){
        this.enhancementMultiplier = 10;
        this.sowingCost = 150;
        this.name = "Enhanced Field";
    }

    @Override
    int calculateProfit(){
        return this.baseProfitAfterHarvest * enhancementMultiplier;
    }
}
