package edu.bu.met.cs665.deliverysystem;

import java.util.List;

/**
 * Name: Mingjia Gong
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/21/2023
 * File Name: Shop.java
 * Description: This is an interface represents a Shop.
 * Shops can publish the latest delivery request,
 */
public interface Shop {
  /**
   * This method can allow drivers to subscribe this Shop.
   *
   * @param d A driver who want to subscribe this shop.
   */
  void subscribe(Driver d);

  /**
   * This method can allow drivers to unsubscribe this Shop.
   *
   * @param d A driver who want to subscribe this shop.
   */
  void unsubscribe(Driver d);

  /**
   * This method can allow shop to create a delivery request.
   *
   * @param deliveryItem Name of the goods to be shipped.
   * @param receiverName Name of the receiver.
   * @param deliveryTime Time of arrival.
   */
  void createOrder(String deliveryItem, String receiverName, String deliveryTime);

  /**
   * This method can allow every driver who subscribe the shop to receive a delivery request.
   */
  void placeOrder();

  /**
   * his method can allow specific type of driver
   * who subscribe the shop to receive a delivery request.
   *
   * @param type The car type of drivers, such as van, taxi, and scooter.
   */
  void placeOrder(String type);

  /**
   * This method can get the latest delivery request.
   *
   * @return The latest delivery request
   */
  DeliveryRequest getLatestDeliveryRequest();

  /**
   * This method can get the delivery request history.
   *
   * @return The delivery request history.
   */
  List<DeliveryRequest> getDeliveryRequestHistory();
}
