package edu.bu.met.cs665.machine;

/**
 * Name: Mingjia Gong
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/21/2023
 * File Name: Drink.java
 * Description: This interface represent different kinds of drink.
 */
public interface Drink {
  double milkPrice = 0.5;
  int sugar = 0;
  double sugarPrice = 0.1;

  /**
   * To set base price.
   *
   * @param basePrice The new base price of drink.
   */
  void setBasePrice(double basePrice);

  /**
   * To get the price of a drink.
   *
   * @return The price of a drink.
   */
  double getPrice();

  /**
   * Add one unit milk to coffee,up to 3 unit.
   */
  void addMilk();


  /**
   * Add one unit sugar to coffee,up to 3 unit.
   */
  void addSugar();


}
