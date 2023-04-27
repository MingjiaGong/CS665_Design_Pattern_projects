package edu.bu.met.cs665.diagramming_application;

/**
 * Name: Mingjia Gong
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/15/2023
 * File Name: Heart.java
 * Description: This is a concrete class that extends the Shape class and represents a heart shape object.
 * It inherits properties and methods from the Shape class, such as color, type, size, and transparency,
 * and also provides its own constructors for creating heart objects with different property values.
 */
public class Heart extends Shape{
  /**
   * Default constructor for creating a Heart object with default property values.
   * It sets the color to a new int array with all elements initialized to 0 (representing black color),
   * sets the size to 100, sets the type to "Heart", sets the transparency to 1 (fully opaque),
   * and prints a message indicating that the heart was created successfully.
   */
  public Heart() {
    super.setColor(new int[3]);
    super.setSize(100);
    super.setType("Heart");
    super.setTransparency(1);
    System.out.println("Heart create successfully");
  }

  /**
   * This is a constructor that creates a new Heart object by cloning an existing Shape object.
   * It takes a Shape object as a parameter and sets the Heart object's property values based on the values of the Shape object.
   * It sets these property values using the super keyword to call the corresponding setter methods from the parent Shape class.
   *
   * @param heart An instance of Shape
   */
  public Heart(Shape heart) {
    super.setColor(heart.getColor());
    super.setSize(heart.getSize());
    super.setType(heart.getType());
    super.setTransparency(heart.getTransparency());
  }

  @Override
  public Shape clone() {
    System.out.println("Heart copy successfully");
    return new Heart(this);
  }
}
