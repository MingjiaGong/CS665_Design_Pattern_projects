package edu.bu.met.cs665.deliverysystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Name: Mingjia Gong
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/21/2023
 * File Name: ShopImpl.java
 * Description: This is a class that implements Shop.
 * Users can use this class to create a Shop instance.
 */
public class ShopImpl implements Shop {
  private String shopName;
  private DeliveryRequest latestDeliveryRequest;

  private List<DeliveryRequest> deliveryRequestHistory;

  private HashMap<String, List<Driver>> driverList = new HashMap<>();

  /**
   * This is the constructor of ShopImpl class.
   *
   * @param shopName Name of the shipping store
   */
  public ShopImpl(String shopName) {
    this.shopName = shopName;
    deliveryRequestHistory = new ArrayList<>();
  }

  @Override
  public void subscribe(Driver d) {
    String type = d.getType();
    if (!driverList.containsKey(type)) {
      List<Driver> temp = new ArrayList<>();
      temp.add(d);
      driverList.put(type, temp);
    } else {
      driverList.get(type).add(d);
    }

  }

  @Override
  public void unsubscribe(Driver d) {
    String type = d.getType();
    driverList.get(type).remove(d);

  }

  @Override
  public void createOrder(String deliveryItem, String receiverName, String deliveryTime) {
    latestDeliveryRequest = new DeliveryRequest(this.shopName, deliveryItem,
                                                 receiverName, deliveryTime);

    deliveryRequestHistory.add(latestDeliveryRequest);

  }

  @Override
  public void placeOrder() {
    for (List<Driver> list : driverList.values()) {
      for (Driver d : list) {
        d.updateSelf(this.latestDeliveryRequest);
      }
    }
  }

  @Override
  public void placeOrder(String type) {
    for (Driver d : driverList.get(type)) {
      d.updateSelf(this.latestDeliveryRequest);
    }

  }

  @Override
  public DeliveryRequest getLatestDeliveryRequest() {
    return latestDeliveryRequest;
  }

  @Override
  public List<DeliveryRequest> getDeliveryRequestHistory() {
    return deliveryRequestHistory;
  }
}
