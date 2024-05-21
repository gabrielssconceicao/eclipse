package exemple03.app;

import exemple03.model.entities.AbstractShape;
import exemple03.model.entities.Circle;
import exemple03.model.entities.Rectangle;
import exemple03.model.enums.Color;

public class App {

  public static void main(String[] args) {

    AbstractShape s1 = new Circle(Color.WHITE, 2.0);
    AbstractShape s2 = new Rectangle(Color.BLACK, 3.0, 4.0);

    System.out.println("Circle area: " + String.format("%.2f", s1.area()));
    System.out.println("Circle color: " + s1.getColor());
    System.out.println("Rectangle area: " + String.format("%.2f", s2.area()));
    System.out.println("Rectangle color: " + s2.getColor());
  }
}
