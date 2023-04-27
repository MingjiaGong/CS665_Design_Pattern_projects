package edu.bu.met.cs665.diagramming_application;

/**
 * Name: Mingjia Gong
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/15/2023
 * File Name: Triangle.java
 * Description: This is a concrete class that extends the Shape class and represents a Triangle shape object.
 * It inherits properties and methods from the Shape class, such as color, type, size, and transparency,
 * and also provides its own constructors for creating Triangle objects with different property values.
 */
public class Triangle extends Shape{
  /**
   * Default constructor for creating a Triangle object with default property values.
   * It sets the color to a new int array with all elements initialized to 0 (representing black color),
   * sets the size to 100, sets the type to "Triangle", sets the transparency to 1 (fully opaque),
   * and prints a message indicating that the Triangle was created successfully.
   */
  public Triangle() {
    super.setColor(new int[3]);
    super.setSize(100);
    super.setType("Triangle");
    super.setTransparency(1);
    System.out.println("Triangle create successfully");
  }

  /**
   * This is a constructor that creates a new Triangle object by cloning an existing Shape object.
   * It takes a Shape object as a parameter and sets the Triangle object's property values based on the values of the Shape object.
   * It sets these property values using the super keyword to call the corresponding setter methods from the parent Shape class.
   *
   * @param triangle An instance of Shape
   */
  public Triangle(Shape triangle) {
    super.setColor(triangle.getColor());
    super.setSize(triangle.getSize());
    super.setType(triangle.getType());
    super.setTransparency(triangle.getTransparency());
  }

  @Override
  public Shape clone() {
    System.out.println("Triangle copy successfully");
    return new Triangle(this);
  }
}
