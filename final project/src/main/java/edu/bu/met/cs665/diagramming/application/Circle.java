package edu.bu.met.cs665.diagramming.application;

/**
 * Name: Mingjia Gong
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/15/2023
 * File Name: Circle.java
 * Description: This is a concrete class that extends the Shape class
 * and represents a circle shape object.
 * It inherits properties and methods from the Shape class,
 * such as color, type, size, and transparency, and also provides its own constructors
 * for creating circle objects with different property values.
 */
public class Circle extends Shape {

  /**
   * Default constructor for creating a Circle object with default property values.
   * It sets the color to a new int array with all elements initialized to 0 (representing black),
   * sets the size to 100, sets the type to "Circle", sets the transparency to 1 (fully opaque),
   * and prints a message indicating that the circle was created successfully.
   */
  public Circle() {
    super.setColor(new int[3]);
    super.setSize(100);
    super.setType("Circle");
    super.setTransparency(1);
    System.out.println("Circle create successfully");
  }

  /**
   * This is a constructor that creates a new Circle object by cloning an existing Shape object.
   * It takes a Shape object as a parameter and sets the Circle object's property values
   * based on the values of the Shape object.
   * It sets these property values using the super keyword to call the corresponding setter methods
   * from the parent Shape class.
   *
   * @param circle An instance of Shape
   */
  public Circle(Shape circle) {
    super.setColor(circle.getColor());
    super.setSize(circle.getSize());
    super.setType(circle.getType());
    super.setTransparency(circle.getTransparency());
  }

  @Override
  public Shape clone() {
    System.out.println("Circle copy successfully");
    return new Circle(this);
  }
}
