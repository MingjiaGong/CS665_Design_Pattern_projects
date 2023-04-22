package edu.bu.met.cs665.machine;

/**
 * Name: Mingjia Gong
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/21/2023
 * File Name: Coffee.java
 * Description: This abstract class defines a type of drink, coffee,
 * it includes some common features of different kinds of coffee.
 * This class can reduce duplicated code, because any coffee
 * with common characteristics can extend this class.
 */
public abstract class Coffee implements Drink {

  private double basePrice;
  private int milk = 0;
  private int sugar = 0;



  public Coffee() {

  }

  @Override
  public void setBasePrice(double basePrice) {
    this.basePrice = basePrice;
  }


  @Override
  public double getPrice() {
    return basePrice + milkPrice * milk + sugarPrice * sugar;
  }

  @Override
  public void addMilk() {
    if (milk <= 2) {
      this.milk++;
      System.out.println("Add milk successfully.");
    } else {
      System.out.println("No more than three unit milk can be added.");
    }
  }


  @Override
  public void addSugar() {
    if (sugar <= 2) {
      this.sugar++;
      System.out.println("Add sugar successfully.");
    } else {
      System.out.println("No more than three unit sugar can be added.");
    }
  }



}
