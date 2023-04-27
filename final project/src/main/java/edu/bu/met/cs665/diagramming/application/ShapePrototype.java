package edu.bu.met.cs665.diagramming.application;

/**
 * Name: Mingjia Gong
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/15/2023
 * File Name: ShapePrototype.java
 * Description: This is an interface that defines the contract for objects
 * that can be cloned to create new instances of Shape objects.
 */
public interface ShapePrototype {

  /**
   * Creates a new instance of Shape that is a clone of the current object.
   * The exact behavior of the clone() method is dependent on the implementation in the Shape class.
   *
   * @return A new instance of Shape that is a clone of the current object.
   */
  Shape clone();

}
