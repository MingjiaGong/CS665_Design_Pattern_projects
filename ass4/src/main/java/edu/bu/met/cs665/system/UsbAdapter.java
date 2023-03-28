package edu.bu.met.cs665.system;

/**
 * Name: Mingjia Gong
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/27/2023
 * File Name: UsbAdapter.java
 * Description:This class implements CustomerData,
 * it is an Adapter in Adapter Pattern.
 */
public class UsbAdapter implements CustomerDataHttps {
  private CustomerDataUsb oldSystem;

  public UsbAdapter(CustomerDataUsb oldSystem) {
    this.oldSystem = oldSystem;
  }

  @Override
  public void printCustomer(int customerId) {
    oldSystem.printCustomer(customerId);
  }

  @Override
  public void getCustomerHttps(int customerId) {
    oldSystem.getCustomerUsb(customerId);
  }
}
