package gof.structural.bridge;

public class Client {
  public static void test() {
    Shape s1 = new RedCircle();
    s1.draw();

    System.out.println("***********************************");

    Shape s2 = new BlueSquare();
    s2.draw();
  }
}
