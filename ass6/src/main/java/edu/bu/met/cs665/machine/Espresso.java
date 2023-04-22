package edu.bu.met.cs665.machine;

/**
 * Name: Mingjia Gong
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/21/2023
 * File Name: Espresso.java
 * Description: This class is to create a cup of Espresso.
 */
public class Espresso extends Coffee {
  public Espresso() {
    super.setBasePrice(2);
    System.out.println("Create Espresso successful.");
  }

}
