package edu.bu.met.cs665.email;

/**
 * Name: Mingjia Gong
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/14/2023
 * File Name: CompanyImpl.java
 * Description: This is a class which implements Company.
 * Users can use this class to create a Company instance.
 */
public class CompanyImpl implements Company {
  @Override
  public Customer createCustomer(String type) {
    if (type.equals("Business")) {
      return new Business();
    } else if (type.equals("Returning")) {
      return new Returning();
    } else if (type.equals("Frequent")) {
      return new Frequent();
    } else if (type.equals("New")) {
      return new New();
    } else if (type.equals("Vip")) {
      return new Vip();
    } else {
      return null;
    }
  }

  @Override
  public String useTemplate(String template, Customer customer) {
    if (template.equals("Template1")) {
      return new TemplateImpl1(customer).generateEmail();
    } else {
      return null;
    }
  }
}
