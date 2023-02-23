package edu.bu.met.cs665.deliverysystem;

/**
 * Name: Mingjia Gong
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/21/2023
 * File Name: DeliveryRequest.java
 * Description: This class represents a delivery request.
 * A delivery request should have shopName, deliveryItem, receiverName and deliveryTime.
 */
public class DeliveryRequest {
  String shopName;
  String deliveryItem;
  String receiverName;
  String deliveryTime;

  /**
   * This is the constructor of DeliveryRequest class.
   *
   * @param shopName     Name of the shipping store
   * @param deliveryItem Name of the goods to be shipped
   * @param receiverName Name of the receiver
   * @param deliveryTime Time of arrival
   */
  public DeliveryRequest(String shopName, String deliveryItem,
                         String receiverName, String deliveryTime) {
    this.shopName = shopName;
    this.deliveryItem = deliveryItem;
    this.receiverName = receiverName;
    this.deliveryTime = deliveryTime;
  }
}
