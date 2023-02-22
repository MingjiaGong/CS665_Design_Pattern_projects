package edu.bu.met.cs665;

import edu.bu.met.cs665.machine.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Name: Mingjia Gong
 * Course: CS-655 Software Designs & Patterns
 * Date:02/02/2023
 * File Name: TestVendingMachine.java
 * Description:
 */
public class TestVendingMachine {
    @Test
    public void testEspresso(){
        // Create a drink
        Coffee myDrink = new Espresso();

        // add 4 unit Milk
        myDrink.addMilk();
        myDrink.addMilk();
        myDrink.addMilk();
        myDrink.addMilk();
        // add 1 unit sugar
        myDrink.addSugar();

        assertEquals(myDrink.getPrice(), 3.6,0.1);
    }

    @Test
    public void testAmericano(){
        // Create a drink
        Coffee myDrink = new Americano();

        // add 2 unit Milk
        myDrink.addMilk();
        myDrink.addMilk();

        // add 4 unit sugar
        myDrink.addSugar();
        myDrink.addSugar();
        myDrink.addSugar();
        myDrink.addSugar();

        assertEquals(myDrink.getPrice(), 4.3,0.1);
    }

    @Test
    public void testLatteMacchiato(){
        // Create a drink
        Coffee myDrink = new LatteMacchiato();

        // add 4 unit Milk
        myDrink.addMilk();
        myDrink.addMilk();
        myDrink.addMilk();
        myDrink.addMilk();

        // add 4 unit sugar
        myDrink.addSugar();
        myDrink.addSugar();
        myDrink.addSugar();
        myDrink.addSugar();

        assertEquals(myDrink.getPrice(), 5.8,0.1);
    }

    @Test
    public void testBlackTea(){
        // Create a drink
        Tea myDrink = new BlackTea();
        assertEquals(myDrink.getPrice(), 2,0.1);
    }

    @Test
    public void testGreenTea(){
        // Create a drink
        Tea myDrink = new GreenTea();
        assertEquals(myDrink.getPrice(), 3,0.1);
    }

    @Test
    public void testYellowTea(){
        // Create a drink
        Tea myDrink = new YellowTea();
        assertEquals(myDrink.getPrice(), 4,0.1);
    }





}
