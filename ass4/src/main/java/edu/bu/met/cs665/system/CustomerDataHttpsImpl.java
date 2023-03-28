package edu.bu.met.cs665.system;

/**
 * Name: Mingjia Gong
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/27/2023
 * File Name: CustomerDataHttpsImpl.java
 * Description: This class implements CustomerDataHttps, which represents a new System.
 */
public class CustomerDataHttpsImpl implements CustomerDataHttps {
  @Override
  public void printCustomer(int customerId) {
    System.out.println("New System customerId: " + customerId);
  }

  @Override
  public void getCustomerHttps(int customerId) {
    System.out.println("New System get customerId: " + customerId);
  }
}
