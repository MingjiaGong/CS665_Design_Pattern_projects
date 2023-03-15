package edu.bu.met.cs665.email;

/**
 * Name: Mingjia Gong
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/14/2023
 * File Name: Returning.java
 * Description: This is a class which implements Customer.
 * This class represents returning customers.
 * User can customize its special words or sentences, which will be used in templates.
 */
public class Returning implements Customer {
  private String word1 = "Returning";

  private String word2 = "Good afternoon";

  @Override
  public String getWord1() {
    return word1;
  }

  @Override
  public String getWord2() {
    return word2;
  }
}
