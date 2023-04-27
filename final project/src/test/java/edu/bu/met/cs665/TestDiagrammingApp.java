package edu.bu.met.cs665;

import edu.bu.met.cs665.diagramming.application.*;
import edu.bu.met.cs665.diagramming_application.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Name: Mingjia Gong
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/21/2023
 * File Name: TestDiagrammingApp.java
 * Description: Write some tests for your program like the examples below.
 */
public class TestDiagrammingApp {

    public TestDiagrammingApp() {
    }

    @Test
    public void testCircle() {
        // Given: Create a default Circle and change its size.
        Shape shape = new Circle();
        shape.setSize(78);

        // When: Clone this shape.
        Shape cloneShape = shape.clone();

        // Then: we confirm the expected result is the same as the value obtained from
        // the getter method
        assertEquals(78,cloneShape.getSize());
    }

    @Test
    public void testHeart() {
        // Given: Create a default Heart and change its transparency.
        Shape shape = new Heart();
        shape.setTransparency(0.5);

        // When: Clone this shape.
        Shape cloneShape = shape.clone();

        // Then: we confirm the expected result is the same as the value obtained from
        // the getter method
        assertEquals(0.5,cloneShape.getTransparency(),0.1);
    }

    @Test
    public void testRectangle() {
        // Given: Create a default Rectangle and change its transparency.
        Shape shape = new Rectangle();
        shape.setTransparency(0.7);

        // When: Clone this shape and change its color.
        Shape cloneShape = shape.clone();
        cloneShape.setColor(new int[]{4,5,6});

        // Then: we confirm the expected result is the same as the value obtained from
        // the getter method
        assertEquals(0.7,cloneShape.getTransparency(),0.1);
        assertEquals(4,cloneShape.getColor()[0]);
        assertEquals(5,cloneShape.getColor()[1]);
        assertEquals(6,cloneShape.getColor()[2]);
        assertEquals(0,shape.getColor()[0]);
        assertEquals(0,shape.getColor()[1]);
        assertEquals(0,shape.getColor()[2]);

    }

    @Test
    public void testStar() {
        // Given: Create a default Star and change its color.
        Shape shape = new Star();
        shape.setColor(new int[]{1,2,3});

        // When: Clone this shape and change its size.
        Shape cloneShape = shape.clone();
        cloneShape.setSize(200);

        // Then: we confirm the expected result is the same as the value obtained from
        // the getter method
        assertEquals(1,cloneShape.getColor()[0]);
        assertEquals(2,cloneShape.getColor()[1]);
        assertEquals(3,cloneShape.getColor()[2]);
        assertEquals(200,cloneShape.getSize());
        assertEquals(100,shape.getSize());

    }

    @Test
    public void testTriangle() {
        // Given: Create a default Triangle and change its size.
        Shape shape = new Triangle();
        shape.setSize(150);

        // When: Clone this shape and change its transparency.
        Shape cloneShape = shape.clone();
        cloneShape.setTransparency(0.5);

        // Then: we confirm the expected result is the same as the value obtained from
        // the getter method
        assertEquals(150,cloneShape.getSize());
        assertEquals(0.5,cloneShape.getTransparency(),0.1);
        assertEquals(1,shape.getTransparency(),0.1);

    }



}
