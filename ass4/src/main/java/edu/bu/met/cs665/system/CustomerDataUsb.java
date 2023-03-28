package edu.bu.met.cs665.system;

/**
 * Name: Mingjia Gong
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/27/2023
 * File Name: CustomerDataUsb.java
 * Description: This interface represents an old System.
 */
public interface CustomerDataUsb {

  /**
   * This is the specificRequest in Adapter Pattern.
   * @param customerId  a unique ID for every customer.
   */
  void printCustomer(int customerId);

  /**
   * This is the specificRequest in Adapter Pattern.
   * @param customerId  a unique ID for every customer.
   */
  void getCustomerUsb(int customerId);
}
