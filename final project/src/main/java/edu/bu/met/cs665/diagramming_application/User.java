package edu.bu.met.cs665.diagramming_application;

public class User {

  public static void main(String[] arg){
    Shape shape = new Star();
    shape.setColor(new int[]{1,2,3});
    shape.setSize(150);
    shape.setTransparency(0.5);
    shape.print();

    Shape cloneShape = shape.clone();
    cloneShape.setSize(300);
    cloneShape.print();
  }

}
