package edu.bu.met.cs665.email;

/**
 * Name: Mingjia Gong
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/14/2023
 * File Name: Vip.java
 * Description: This is a class which implements Customer.
 * This class represents Vip customers.
 * User can customize its special words or sentences, which will be used in templates.
 */
public class Vip implements Customer {
  private String word1 = "Vip";

  private String word2 = "Good evening";

  @Override
  public String getWord1() {
    return word1;
  }

  @Override
  public String getWord2() {
    return word2;
  }

}
