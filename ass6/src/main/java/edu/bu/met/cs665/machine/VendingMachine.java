package edu.bu.met.cs665.machine;


/**
 * Name: Mingjia Gong
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/21/2023
 * File Name: VendingMachine.java
 * Description: This class represent a vending machine.
 */
public class VendingMachine {

  public VendingMachine() {
  }

  /**
   * This method is to create a Drink objects.
   * This is a factory method.
   *
   * @param drinkName This is the name of the drink you want to create.
   * @return
   */
  public Drink creatDrink(String drinkName) {

    switch (drinkName) {
      case "Espresso":
        Drink espresso = new Espresso();
        return espresso;
      case "Americano":
        Drink americano = new Americano();
        return americano;
      case "Latte Macchiato":
        Drink latteMacchiato = new LatteMacchiato();
        return latteMacchiato;
      case "Black Tea":
        Drink black = new BlackTea();
        return black;
      case "Green Tea":
        Drink green = new GreenTea();
        return green;
      case "Yellow Tea":
        Drink yellow = new YellowTea();
        return yellow;
      default:
        System.out.println("Error, Please try again.");
        return null;

    }
  }

}
