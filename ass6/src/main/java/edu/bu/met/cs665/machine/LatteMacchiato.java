package edu.bu.met.cs665.machine;

/**
 * Name: Mingjia Gong
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/21/2023
 * File Name: LatteMacchiato.java
 * Description:  This class is to create a cup of Latte Macchiato.
 */
public class LatteMacchiato extends Coffee {
  public LatteMacchiato() {
    super.setBasePrice(4);
    System.out.println("Create LatteMacchiato successful.");
  }
}
