package edu.bu.met.cs665.system;

/**
 * Name: Mingjia Gong
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/27/2023
 * File Name: CustomerDataUsbImpl.java
 * Description: This is the Adaptee in Adapter Pattern.
 * This class implements CustomerDataUsb, which represents an old System.
 */
public class CustomerDataUsbImpl implements CustomerDataUsb {
  @Override
  public void printCustomer(int customerId) {
    System.out.println("Old System customerId: " + customerId);
  }

  @Override
  public void getCustomerUsb(int customerId) {
    System.out.println("Old System get customerId: " + customerId);
  }
}
