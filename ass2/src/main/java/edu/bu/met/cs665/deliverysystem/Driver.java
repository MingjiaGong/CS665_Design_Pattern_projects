package edu.bu.met.cs665.deliverysystem;

/**
 * Name: Mingjia Gong
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/21/2023
 * File Name: Driver.java
 * Description: This is an interface represents a driver.
 * Drivers can subscribe and unsubscribe different shops, receive the latest delivery request,
 * and mark themselves as not available to refuse delivery request.
 */
public interface Driver {
  /**
   * Subscribed shops can use this method to update the latest delivery request to drivers.
   *
   * @param latestDeliveryRequest The latest delivery request from shop.
   */
  void updateSelf(DeliveryRequest latestDeliveryRequest);

  /**
   * This method can subscribe a shop.
   *
   * @param shop A shop which can publish the latest delivery request to driver.
   */
  void subscribe(Shop shop);

  /**
   * This method can unsubscribe a shop.
   *
   * @param shop A shop which can publish the latest delivery request to driver.
   */
  void unsubscribe(Shop shop);

  /**
   * This method can get the car type of drivers.
   *
   * @return Return the car type of drivers, such as van, taxi, and scooter.
   */
  String getType();

  /**
   * This method can mark themselves as not available.
   * Unavailable drivers can not receive the latest delivery request.
   */
  void unavailable();

  /**
   * This method can mark themselves as available.
   * Available drivers can receive the latest delivery request.
   */
  void available();

  /**
   * This method can get the latest delivery request.
   *
   * @return The latest delivery request.
   */
  DeliveryRequest getLatestDeliveryRequest();
}
