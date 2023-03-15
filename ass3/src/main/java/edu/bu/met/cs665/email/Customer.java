package edu.bu.met.cs665.email;

/**
 * Name: Mingjia Gong
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/14/2023
 * File Name: Customer.java
 * Description: This is an interface which represents different kinds of customers.
 * All the customers should have required words or sentences and their getter methods,
 * which will be used in templates.
 */
public interface Customer {
  /**
   * To get the customized word1.
   *
   * @return customized word1.
   */
  String getWord1();

  /**
   * To get the customized word2.
   *
   * @return customized word2.
   */
  String getWord2();
}
