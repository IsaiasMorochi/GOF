package gof.structural.bridge;

public abstract class Circle extends Shape {

  @Override
  public void draw() {
    System.out.println("Drawing a Circle");

    this.paint();
  }
  
  public abstract void paint();

}
