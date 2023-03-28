package edu.bu.met.cs665.system;

/**
 * Name: Mingjia Gong
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/27/2023
 * File Name: CustomerDataHttps.java
 * Description: This interface represents a new System.
 * This is the << interface >> Target in Adapter Pattern.
 */
public interface CustomerDataHttps {
  /**
   * This is the Request in Adapter Pattern.
   * @param customerId  a unique ID for every customer.
   */
  void printCustomer(int customerId);

  /**
   * This is the Request in Adapter Pattern.
   * @param customerId  a unique ID for every customer.
   */
  void getCustomerHttps(int customerId);
}
