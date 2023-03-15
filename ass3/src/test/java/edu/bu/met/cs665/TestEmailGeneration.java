package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import edu.bu.met.cs665.email.Company;
import edu.bu.met.cs665.email.CompanyImpl;
import edu.bu.met.cs665.email.Customer;
import org.junit.Test;

/**
 * This class is to  write some Unit tests.
 */
public class TestEmailGeneration {
  public TestEmailGeneration() {
  }

  @Test
  public void testBusiness() {
    // Given: A company object
    Company company = new CompanyImpl();

    // When: Generate an email with Template1 and business customer.
    Customer customer = company.createCustomer("Business");
    String email = company.useTemplate("Template1", customer);

    // Then: we confirm the expected result is the same as the email.
    assertEquals("Hello, Business", email);
  }


  @Test
  public void testFrequent() {
    // Given: A company object
    Company company = new CompanyImpl();

    // When: Generate an email with Template1 and frequent customer.
    Customer customer = company.createCustomer("Frequent");
    String email = company.useTemplate("Template1", customer);

    // Then: we confirm the expected result is the same as the email.
    assertEquals("Hi, Frequent", email);
  }


  @Test
  public void testNew() {
    // Given: A company object
    Company company = new CompanyImpl();

    // When: Generate an email with Template1 and new customer.//
    Customer customer = company.createCustomer("New");
    String email = company.useTemplate("Template1", customer);

    // Then: we confirm the expected result is the same as the email.
    assertEquals("Good morning, New", email);
  }


  @Test
  public void testReturning() {
    // Given: A company object
    Company company = new CompanyImpl();

    // When: Generate an email with Template1 and returning customer.
    Customer customer = company.createCustomer("Returning");
    String email = company.useTemplate("Template1", customer);

    // Then: we confirm the expected result is the same as the email.
    assertEquals("Good afternoon, Returning", email);
  }


  @Test
  public void testVIP() {
    // Given: A company object
    Company company = new CompanyImpl();

    // When: Generate an email with Template1 and VIP customer.
    Customer customer = company.createCustomer("Vip");
    String email = company.useTemplate("Template1", customer);

    // Then: we confirm the expected result is the same as the email.
    assertEquals("Good evening, Vip", email);
  }


}


