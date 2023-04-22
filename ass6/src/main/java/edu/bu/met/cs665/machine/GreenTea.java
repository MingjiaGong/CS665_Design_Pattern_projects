package edu.bu.met.cs665.machine;

/**
 * Name: Mingjia Gong
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/21/2023
 * File Name: GreenTea.java
 * Description:  This class is to create a cup of Green Tea.
 */
public class GreenTea extends Tea {
  public GreenTea() {
    super.setBasePrice(3);
    System.out.println("Create Green Tea successful.");
  }
}
