package com.imorochi.gof.structural.bridge;

public abstract class Square extends Shape {

  @Override
  public void draw() {
    System.out.println("Drawing a Square");

    this.paint();
  }
  
  public abstract void paint();

}
