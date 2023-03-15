package edu.bu.met.cs665.email;

/**
 * Name: Mingjia Gong
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/14/2023
 * File Name: New.java
 * Description: This is a class which implements Customer.
 * This class represents new customers.
 * User can customize its special words or sentences, which will be used in templates.
 */
public class New implements Customer {
  private String word1 = "New";

  private String word2 = "Good morning";

  @Override
  public String getWord1() {
    return word1;
  }

  @Override
  public String getWord2() {
    return word2;
  }
}
