package edu.bu.met.cs665.machine;

/**
 * Name: Mingjia Gong
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/21/2023
 * File Name: Tea.java
 * Description: This class is to create a cup of Yellow Tea.
 */
public class YellowTea extends Tea {
  public YellowTea() {
    super.setBasePrice(4);
    System.out.println("Create Yellow Tea successful.");
  }
}
