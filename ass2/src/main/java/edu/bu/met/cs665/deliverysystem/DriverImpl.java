package edu.bu.met.cs665.deliverysystem;

import java.util.ArrayList;


/**
 * Name: Mingjia Gong
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/21/2023
 * File Name: DriverImpl.java
 * Description: This is a class which implements Driver.
 * Users can use this class to create a Driver instance.
 */
public class DriverImpl implements Driver {
  private String type;
  DeliveryRequest latestDeliveryRequest;

  private ArrayList<Shop> shopList;

  boolean ifAvailable;

  /**
   * This is the constructor of DriverImpl class.
   *
   * @param type  The car type of drivers, such as van, taxi, and scooter.
   */
  public DriverImpl(String type) {
    this.type = type;
    ifAvailable = true;
    shopList = new ArrayList<Shop>();
    latestDeliveryRequest = null;
  }


  @Override
  public void updateSelf(DeliveryRequest latestDeliveryRequest) {
    if (ifAvailable) {
      this.latestDeliveryRequest = latestDeliveryRequest;
    }
  }

  @Override
  public void subscribe(Shop shop) {
    shopList.add(shop);
    shop.subscribe(this);
  }

  @Override
  public void unsubscribe(Shop shop) {
    shopList.remove(shop);
    shop.unsubscribe(this);
  }

  @Override
  public String getType() {
    return this.type;
  }

  @Override
  public void unavailable() {
    ifAvailable = false;

  }

  @Override
  public void available() {
    ifAvailable = true;
  }


  @Override
  public DeliveryRequest getLatestDeliveryRequest() {
    return latestDeliveryRequest;
  }
}
