package edu.bu.met.cs665.email;

/**
 * Name: Mingjia Gong
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/14/2023
 * File Name: TemplateImpl1.java
 * Description: This is a class which implements Template.
 * This class represents a concrete template.
 * User can use this template to generate personalized emails.
 */
public class TemplateImpl1 implements Template {
  private Customer customer;

  /**
   * This is the constructor of TemplateImpl1 class.
   *
   * @param customer A customer instance which contains customized words or sentences.
   */
  public TemplateImpl1(Customer customer) {
    this.customer = customer;
  }

  @Override
  public String generateEmail() {
    return customer.getWord2() + ", " + customer.getWord1();
  }
}
