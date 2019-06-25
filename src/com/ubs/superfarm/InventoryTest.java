package com.ubs.superfarm;

import org.junit.Test;

import static org.junit.Assert.*;

public class InventoryTest {

    @Test
    public void shouldNotAllowToBuyFieldWhenMoneyIsNegative(){
        Inventory inventory = new Inventory();
        inventory.money = 0;
        inventory.buyStrawberryField();

        assertEquals(0, inventory.myFields.size());
    }

}