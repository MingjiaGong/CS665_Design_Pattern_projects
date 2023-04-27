package edu.bu.met.cs665.diagramming_application;

/**
 * Name: Mingjia Gong
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/15/2023
 * File Name: Rectangle.java
 * Description: This is a concrete class that extends the Shape class and represents a Rectangle shape object.
 * It inherits properties and methods from the Shape class, such as color, type, size, and transparency,
 * and also provides its own constructors for creating Rectangle objects with different property values.
 */
public class Rectangle extends Shape{
  /**
   * Default constructor for creating a Rectangle object with default property values.
   * It sets the color to a new int array with all elements initialized to 0 (representing black color),
   * sets the size to 100, sets the type to "Rectangle", sets the transparency to 1 (fully opaque),
   * and prints a message indicating that the Rectangle was created successfully.
   */
  public Rectangle() {
    super.setColor(new int[3]);
    super.setSize(100);
    super.setType("Rectangle");
    super.setTransparency(1);
    System.out.println("Rectangle create successfully");
  }

  /**
   * This is a constructor that creates a new Rectangle object by cloning an existing Shape object.
   * It takes a Shape object as a parameter and sets the Rectangle object's property values based on the values of the Shape object.
   * It sets these property values using the super keyword to call the corresponding setter methods from the parent Shape class.
   *
   * @param rectangle An instance of Shape
   */
  public Rectangle(Shape rectangle) {
    super.setColor(rectangle.getColor());
    super.setSize(rectangle.getSize());
    super.setType(rectangle.getType());
    super.setTransparency(rectangle.getTransparency());
  }

  @Override
  public Shape clone() {
    System.out.println("Rectangle copy successfully");
    return new Rectangle(this);
  }
}
