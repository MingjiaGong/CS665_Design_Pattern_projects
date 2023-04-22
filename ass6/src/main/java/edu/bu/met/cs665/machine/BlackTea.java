package edu.bu.met.cs665.machine;

/**
 * Name: Mingjia Gong
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/21/2023
 * File Name: BlackTea.java
 * Description: This class is to create a cup of Black Tea.
 */
public class BlackTea extends Tea {
  public BlackTea() {
    super.setBasePrice(2);
    System.out.println("Create Black Tea successful.");
  }
}
