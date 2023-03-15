package edu.bu.met.cs665.email;

/**
 * Name: Mingjia Gong
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/14/2023
 * File Name: Company.java
 * Description: This is an interface represents a company.
 * A company can create different kinds of customers
 * and use different templates to generate personalized email according to different customers.
 */
public interface Company {
  /**
   * To easily create a desired customer instance.
   *
   * @param type The desired customer type.
   * @return A Customer instance which is the same as the customer type.
   */
  Customer createCustomer(String type);

  /**
   * To generate personalized email according to different customers and templates.
   *
   * @param template A base template.
   * @param customer A Customer instance which contains customized words or sentences.
   * @return A personalized email.
   */
  String useTemplate(String template, Customer customer);
}
