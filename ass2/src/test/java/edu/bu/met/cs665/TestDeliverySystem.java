package edu.bu.met.cs665;

import edu.bu.met.cs665.deliverysystem.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This class is to  write some Unit tests.
 */
public class TestDeliverySystem {
  public TestDeliverySystem() {

  }


  @Test
  public void testSubscribeAndNotifyAll() {
    //Given: a shop object with the following name
    Shop shop = new ShopImpl("Lucky Shop");
    // Given: five driver objects with the following car type.
    Driver driver1 = new DriverImpl("van");
    Driver driver2 = new DriverImpl("taxi");
    Driver driver3 = new DriverImpl("scooter");
    Driver driver4 = new DriverImpl("van");
    Driver driver5 = new DriverImpl("taxi");

    // When: these drivers subscribe the shop.
    driver1.subscribe(shop);
    driver2.subscribe(shop);
    driver3.subscribe(shop);
    driver4.subscribe(shop);
    driver5.subscribe(shop);
    // When: the shop create delivery request with the following information.
    shop.createOrder("apples", "Jack", "2023-3-1 18:00");
    // When: the shop notify all drivers.
    shop.placeOrder();

    // Then: we confirm the expected result is the same as the value obtained from
    // driver's latest delivery request.
    assertEquals(shop.getLatestDeliveryRequest(), driver1.getLatestDeliveryRequest());
    assertEquals(shop.getLatestDeliveryRequest(), driver2.getLatestDeliveryRequest());
    assertEquals(shop.getLatestDeliveryRequest(), driver3.getLatestDeliveryRequest());
    assertEquals(shop.getLatestDeliveryRequest(), driver4.getLatestDeliveryRequest());
    assertEquals(shop.getLatestDeliveryRequest(), driver5.getLatestDeliveryRequest());

  }

  @Test
  public void testNotifySpecifiedDriver() {
    //Given: a shop object with the following name
    Shop shop = new ShopImpl("Lucky Shop");
    // Given: five driver objects with the following car type.
    Driver driver1 = new DriverImpl("van");
    Driver driver2 = new DriverImpl("taxi");
    Driver driver3 = new DriverImpl("scooter");
    Driver driver4 = new DriverImpl("van");
    Driver driver5 = new DriverImpl("taxi");

    // When: these drivers subscribe the shop.
    driver1.subscribe(shop);
    driver2.subscribe(shop);
    driver3.subscribe(shop);
    driver4.subscribe(shop);
    driver5.subscribe(shop);
    // When: the shop create delivery request with the following information.
    shop.createOrder("apples", "Jack", "2023-3-1 18:00");
    // When: the shop notify the following specific type of drivers.
    shop.placeOrder("taxi");

    // Then: we confirm the expected result is the same as the value obtained from
    // driver's latest delivery request.
    assertEquals(null, driver1.getLatestDeliveryRequest());
    assertEquals(shop.getLatestDeliveryRequest(), driver2.getLatestDeliveryRequest());
    assertEquals(null, driver3.getLatestDeliveryRequest());
    assertEquals(null, driver4.getLatestDeliveryRequest());
    assertEquals(shop.getLatestDeliveryRequest(), driver5.getLatestDeliveryRequest());
  }

  @Test
  public void testNotifyAllAvailable() {
    //Given: a shop object with the following name
    Shop shop = new ShopImpl("Lucky Shop");
    // Given: five driver objects with the following car type.
    Driver driver1 = new DriverImpl("van");
    Driver driver2 = new DriverImpl("taxi");
    Driver driver3 = new DriverImpl("scooter");
    Driver driver4 = new DriverImpl("van");
    Driver driver5 = new DriverImpl("taxi");

    // When: these drivers subscribe the shop.
    driver1.subscribe(shop);
    driver2.subscribe(shop);
    driver3.subscribe(shop);
    driver4.subscribe(shop);
    driver5.subscribe(shop);
    // When: these drivers mark themselves as unavailable.
    driver1.unavailable();
    driver2.unavailable();
    // When: the shop create delivery request with the following information.
    shop.createOrder("apples", "Jack", "2023-3-1 18:00");
    // When: the shop notify all drivers.
    shop.placeOrder();

    // Then: we confirm the expected result is the same as the value obtained from
    // driver's latest delivery request.
    assertEquals(null, driver1.getLatestDeliveryRequest());
    assertEquals(null, driver2.getLatestDeliveryRequest());
    assertEquals(shop.getLatestDeliveryRequest(), driver3.getLatestDeliveryRequest());
    assertEquals(shop.getLatestDeliveryRequest(), driver4.getLatestDeliveryRequest());
    assertEquals(shop.getLatestDeliveryRequest(), driver5.getLatestDeliveryRequest());

  }

  @Test
  public void testUnsubscribe() {
    //Given: a shop object with the following name
    Shop shop = new ShopImpl("Lucky Shop");
    // Given: five driver objects with the following car type.
    Driver driver1 = new DriverImpl("van");
    Driver driver2 = new DriverImpl("taxi");
    Driver driver3 = new DriverImpl("scooter");
    Driver driver4 = new DriverImpl("van");
    Driver driver5 = new DriverImpl("taxi");

    // When: these drivers subscribe the shop.
    driver1.subscribe(shop);
    driver2.subscribe(shop);
    driver3.subscribe(shop);
    driver4.subscribe(shop);
    driver5.subscribe(shop);
    // When: these drivers unsubscribe the shop.
    driver3.unsubscribe(shop);
    driver4.unsubscribe(shop);
    // When: the shop create delivery request with the following information.
    shop.createOrder("apples", "Jack", "2023-3-1 18:00");
    // When: the shop notify all drivers.
    shop.placeOrder();

    // Then: we confirm the expected result is the same as the value obtained from
    // driver's latest delivery request.
    assertEquals(shop.getLatestDeliveryRequest(), driver1.getLatestDeliveryRequest());
    assertEquals(shop.getLatestDeliveryRequest(), driver2.getLatestDeliveryRequest());
    assertEquals(null, driver3.getLatestDeliveryRequest());
    assertEquals(null, driver4.getLatestDeliveryRequest());
    assertEquals(shop.getLatestDeliveryRequest(), driver5.getLatestDeliveryRequest());
  }

  @Test
  public void testComplexCase() {
    //Given: a shop object with the following name
    Shop shop = new ShopImpl("Lucky Shop");
    // Given: five driver objects with the following car type.
    Driver driver1 = new DriverImpl("van");
    Driver driver2 = new DriverImpl("taxi");
    Driver driver3 = new DriverImpl("scooter");
    Driver driver4 = new DriverImpl("van");
    Driver driver5 = new DriverImpl("taxi");

    // When: these drivers subscribe the shop.
    driver1.subscribe(shop);
    driver2.subscribe(shop);
    driver3.subscribe(shop);
    driver4.subscribe(shop);
    driver5.subscribe(shop);
    // When: these drivers mark themselves as unavailable.
    driver4.unavailable();
    // When: the shop create delivery request with the following information.
    shop.createOrder("apples", "Jack", "2023-3-1 18:00");
    // When: the shop notify all drivers.
    shop.placeOrder();
    // When: these drivers mark themselves as available.
    driver4.available();
    // When: the shop create delivery request with the following information.
    shop.createOrder("Balls", "Max", "2023-3-2 18:00");
    // When: the shop notify the following car type of drivers.
    shop.placeOrder("van");
    // When: these drivers unsubscribe the shop.
    driver5.unsubscribe(shop);
    // When: the shop create delivery request with the following information.
    shop.createOrder("Chips", "Tom", "2023-3-3 18:00");
    // When: the shop create delivery request with the following information.
    shop.placeOrder("taxi");

    // Then: we confirm the expected result is the same as the value obtained from
    // driver's latest delivery request.
    assertEquals(shop.getDeliveryRequestHistory().get(1), driver1.getLatestDeliveryRequest());
    assertEquals(shop.getLatestDeliveryRequest(), driver2.getLatestDeliveryRequest());
    assertEquals(shop.getDeliveryRequestHistory().get(0), driver3.getLatestDeliveryRequest());
    assertEquals(shop.getDeliveryRequestHistory().get(1), driver4.getLatestDeliveryRequest());
    assertEquals(shop.getDeliveryRequestHistory().get(0), driver5.getLatestDeliveryRequest());
  }


}
