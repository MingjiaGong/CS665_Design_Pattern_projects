package edu.bu.met.cs665.diagramming.application;

/**
 * Name: Mingjia Gong
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/15/2023
 * File Name: User.java
 * Description: The `User` class serves as an entry point to the program,
 * creating and manipulating shapes.
 */
public class User {

  /**
   * The `main` method is the starting point of the program.
   * It creates a `Star` shape and sets its properties.
   * Then it clones the shape, modifies its size and prints both shapes.
   */
  public static void main(String[] arg) {
    Shape shape = new Star();
    shape.setColor(new int[]{1, 2, 3});
    shape.setSize(150);
    shape.setTransparency(0.5);
    shape.print();

    Shape cloneShape = shape.clone();
    cloneShape.setSize(300);
    cloneShape.print();
  }

}
