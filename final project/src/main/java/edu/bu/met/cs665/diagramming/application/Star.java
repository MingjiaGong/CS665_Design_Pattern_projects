package edu.bu.met.cs665.diagramming.application;

/**
 * Name: Mingjia Gong
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/15/2023
 * File Name: Star.java
 * Description: This is a concrete class that extends the Shape class
 * and represents a Star shape object.
 * It inherits properties and methods from the Shape class,
 * such as color, type, size, and transparency, and also provides its own constructors
 * for creating Star objects with different property values.
 */
public class Star extends Shape {
  /**
   * Default constructor for creating a Star object with default property values.
   * It sets the color to a new int array with all elements initialized to 0 (representing black),
   * sets the size to 100, sets the type to "Star", sets the transparency to 1 (fully opaque),
   * and prints a message indicating that the Star was created successfully.
   */
  public Star() {
    super.setColor(new int[3]);
    super.setSize(100);
    super.setType("Star");
    super.setTransparency(1);
    System.out.println("Star create successfully");
  }

  /**
   * This is a constructor that creates a new Star object by cloning an existing Shape object.
   * It takes a Shape object as a parameter and sets the Star object's property values
   * based on the values of the Shape object.
   * It sets these property values using the super keyword to call the corresponding setter methods
   * from the parent Shape class.
   *
   * @param star An instance of Shape
   */
  public Star(Shape star) {
    super.setColor(star.getColor());
    super.setSize(star.getSize());
    super.setType(star.getType());
    super.setTransparency(star.getTransparency());
  }

  @Override
  public Shape clone() {
    System.out.println("Star copy successfully");
    return new Star(this);
  }
}
