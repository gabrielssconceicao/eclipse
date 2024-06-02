package aula03;

import java.util.ArrayList;
import java.util.List;

import aula03.entities.Circle;
import aula03.entities.Rectangle;
import aula03.entities.Shape;

public class App {
  public static void main(String[] args) {
    List<Shape> shapes = new ArrayList<>();
    shapes.add(new Rectangle(2.0, 3.0));
    shapes.add(new Circle(2.0));

    List<Circle> circles = new ArrayList<>();
    circles.add(new Circle(2.0));
    circles.add(new Circle(3.0));
    System.out.println("Total area: " + totalArea(shapes));

    System.out.println("Total area: " + totalArea(circles));
  }

  private static double totalArea(List<? extends Shape> shapes) {
    double sum = 0.0;
    for (Shape shape : shapes) {
      sum += shape.area();
    }
    return sum;
  }
}
