package entities;

public class Triangle {

  public double a;
  public double b;
  public double c;

  public Triangle() {
  }

  public Triangle(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public double area() {
    double p = (a + b + c) / 2;
    return Math.sqrt(p * (p - a) * (p - b) * (p - c));
  }

  @Override
  public String toString() {
    return String.format("Triangle: {%.1f, %.1f, %.1f}", a, b, c);
  }
}