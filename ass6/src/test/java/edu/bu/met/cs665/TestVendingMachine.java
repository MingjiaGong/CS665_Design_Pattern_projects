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
  public void testEspresso() {
    // Create a drink
    Coffee myDrink = new Espresso();

    // add 4 unit Milk
    myDrink.addMilk();
    myDrink.addMilk();
    myDrink.addMilk();
    myDrink.addMilk();
    // add 1 unit sugar
    myDrink.addSugar();

    assertEquals(myDrink.getPrice(), 3.6, 0.1);
  }

  @Test
  public void testAmericano() {
    // Create a drink
    VendingMachine vm = new VendingMachine();
    Drink americano = vm.creatDrink("Americano");

    // add 2 unit Milk
    americano.addMilk();
    americano.addMilk();

    // add 4 unit sugar
    americano.addSugar();
    americano.addSugar();
    americano.addSugar();
    americano.addSugar();

    assertEquals(americano.getPrice(), 4.3, 0.1);
  }

  @Test
  public void testLatteMacchiato() {
    // Create a drink
    VendingMachine vm = new VendingMachine();
    Drink latteMacchiato = vm.creatDrink("Latte Macchiato");

    // add 4 unit Milk
    latteMacchiato.addMilk();
    latteMacchiato.addMilk();
    latteMacchiato.addMilk();
    latteMacchiato.addMilk();

    // add 4 unit sugar
    latteMacchiato.addSugar();
    latteMacchiato.addSugar();
    latteMacchiato.addSugar();
    latteMacchiato.addSugar();

    assertEquals(latteMacchiato.getPrice(), 5.8, 0.1);
  }

  @Test
  public void testBlackTea() {
    // Create a drink
    VendingMachine vm = new VendingMachine();
    Drink blackTea = vm.creatDrink("Black Tea");

    assertEquals(blackTea.getPrice(), 2, 0.1);
  }

  @Test
  public void testGreenTea() {
    // Create a drink
    VendingMachine vm = new VendingMachine();
    Drink greenTea = vm.creatDrink("Green Tea");
    greenTea.addMilk();

    assertEquals(greenTea.getPrice(), 3, 0.1);
  }

  @Test
  public void testYellowTea() {
    // Create a drink
    VendingMachine vm = new VendingMachine();
    Drink yellowTea = vm.creatDrink("Yellow Tea");
    yellowTea.addMilk();

    assertEquals(yellowTea.getPrice(), 4, 0.1);
  }


}
