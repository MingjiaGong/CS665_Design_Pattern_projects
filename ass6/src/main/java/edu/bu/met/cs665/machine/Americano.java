package edu.bu.met.cs665.machine;

/**
 * Name: Mingjia Gong
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/21/2023
 * File Name: Americano.java
 * Description: This class is to create a cup of Americano.
 */
public class Americano extends Coffee {
  public Americano() {
    super.setBasePrice((double) 3);
    System.out.println("Create Americano successful.");
  }
}
