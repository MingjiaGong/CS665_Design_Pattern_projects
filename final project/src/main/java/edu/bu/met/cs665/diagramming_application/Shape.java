package edu.bu.met.cs665.diagramming_application;

/**
 * Name: Mingjia Gong
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/15/2023
 * File Name: Shape.java
 * Description: Shape is an abstract class that represents a generic shape object
 * with properties such as color, type, size, and transparency.
 * The Shape class also implements the ShapePrototype interface,
 * which provides a contract for cloning Shape objects.
 */
public abstract class Shape implements ShapePrototype {
  private int[] color;
  private String type;
  private int size;
  private double transparency;


  @Override
  public Shape clone() {
    return null;
  }

  /**
   * This is to print variables in a Shape.
   */
  public void print(){
    System.out.println("Color: " +color[0]+" "+color[1]+" "+color[2]);
    System.out.println("Type: " +type);
    System.out.println("Size: "+size);
    System.out.println("Transparency: "+transparency);
    System.out.println();
  }

  /**
   * Gets the color property of the Shape object.
   *
   * @return An array of integers representing the color of the shape in RGB format.
   */
  public int[] getColor() {
    return color;
  }

  /**
   * Sets the color property of the Shape object.
   *
   * @param color An array of integers representing the color of the shape in RGB format.
   */
  public void setColor(int[] color) {
    this.color = color;
  }

  /**
   * Gets the type property of the Shape object.
   *
   * @return The type of the shape.
   */
  public String getType() {
    return type;
  }

  /**
   * Sets the type property of the Shape object.
   *
   * @param type The type of the shape.
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Gets the size property of the Shape object.
   *
   * @return The size of the shape.
   */
  public int getSize() {
    return size;
  }

  /**
   * Sets the size property of the Shape object.
   *
   * @param size The size of the shape.
   */
  public void setSize(int size) {
    this.size = size;
  }

  /**
   * Gets the transparency property of the Shape object.
   *
   * @return The transparency of the shape.
   */
  public double getTransparency() {
    return transparency;
  }

  /**
   * Sets the transparency property of the Shape object.
   *
   * @param transparency The transparency of the shape.
   */
  public void setTransparency(double transparency) {
    this.transparency = transparency;
  }
}
