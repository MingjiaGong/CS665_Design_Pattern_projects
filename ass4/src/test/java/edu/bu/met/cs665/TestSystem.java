package edu.bu.met.cs665;

import edu.bu.met.cs665.system.*;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * This class is to  write some Unit tests.
 */

public class TestSystem {

  @Test
  public void testOldSystemInterface() {
    // Test the old system object implements the old system interface
    CustomerDataUsb oldSystem = new CustomerDataUsbImpl();

    assertTrue(oldSystem instanceof CustomerDataUsb);
  }

  @Test
  public void testNewSystemInterface() {
    // Test the new system object implements the new system interface
    CustomerDataHttps newSystem = new CustomerDataHttpsImpl();

    assertTrue(newSystem instanceof CustomerDataHttps);
  }

  @Test
  public void testOldSystemAdapterMethodOne() {
    // Given: A CustomerDataHttps object
    CustomerDataUsb oldSystem = new CustomerDataUsbImpl();
    // Given: An adapter object that uses the new system
    CustomerDataHttps customer = new UsbAdapter(oldSystem);

    // Redirect System.out to a ByteArrayOutputStream
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));

    // When: Call printCustomer function
    customer.printCustomer(1);

    // Get the output from the ByteArrayOutputStream
    String consoleOutput = outputStream.toString().trim();

    // Then: Confirm the expected result is the same as output.
    assertEquals("Old System customerId: 1", consoleOutput);
  }

  @Test
  public void testOldSystemAdapterMethodTwo() {
    // Given: A CustomerDataHttps object.
    CustomerDataUsb oldSystem = new CustomerDataUsbImpl();
    // Given: An adapter object that uses the new system
    CustomerDataHttps customer = new UsbAdapter(oldSystem);

    // Redirect System.out to a ByteArrayOutputStream
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));

    // When: Call printCustomer function
    customer.getCustomerHttps(1);

    // Get the output from the ByteArrayOutputStream
    String consoleOutput = outputStream.toString().trim();

    // Then: Confirm the expected result is the same as output.
    assertEquals("Old System get customerId: 1", consoleOutput);
  }

  @Test
  public void testNewSystemAdapterMethodOne() {
    // Given: A CustomerDataHttps object
    CustomerDataHttps newSystem = new CustomerDataHttpsImpl();

    // Redirect System.out to a ByteArrayOutputStream
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));

    // When: Call printCustomer function
    newSystem.printCustomer(1);

    // Get the output from the ByteArrayOutputStream
    String consoleOutput = outputStream.toString().trim();

    // Then: Confirm the expected result is the same as output.
    assertEquals("New System customerId: 1", consoleOutput);
  }

  @Test
  public void testNewSystemAdapterMethodTwo() {
    // Given: A CustomerDataHttps object
    CustomerDataHttps newSystem = new CustomerDataHttpsImpl();

    // Redirect System.out to a ByteArrayOutputStream
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));

    // When: Call printCustomer function
    newSystem.getCustomerHttps(1);

    // Get the output from the ByteArrayOutputStream
    String consoleOutput = outputStream.toString().trim();

    // Then: Confirm the expected result is the same as output.
    assertEquals("New System get customerId: 1", consoleOutput);
  }
}
