package edu.bu.met.cs665.email;

/**
 * Name: Mingjia Gong
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/14/2023
 * File Name: Template.java
 * Description: This is an interface which represents different kinds of templates.
 * All the templates can generate personalized emails.
 */
public interface Template {
  /**
   * To generate personalized emails.
   *
   * @return  personalized emails
   */
  String generateEmail();
}
