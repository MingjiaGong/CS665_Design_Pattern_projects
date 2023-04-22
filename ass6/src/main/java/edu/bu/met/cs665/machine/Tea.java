package edu.bu.met.cs665.machine;

/**
 * Name: Mingjia Gong
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/21/2023
 * File Name: Tea.java
 * Description: This abstract class defines a type of drink, tea,
 * it includes some common features of different kinds of tea.
 * This class can reduce duplicated code,
 * because any tea with common characteristics can extend this class.
 */
public abstract class Tea implements Drink {
  private double basePrice;

  @Override
  public void setBasePrice(double basePrice) {
    this.basePrice = basePrice;
  }

  @Override
  public double getPrice() {
    return basePrice;
  }

  @Override
  public void addMilk() {
    System.out.println("This item can not add milk.");
  }

  @Override
  public void addSugar() {
    System.out.println("This item can not add Sugar.");
  }

}
