package com.trybe.acc.java.jogodasfazendas;

/**
 * This class represents a sample class.
 *
 * @author joao
 */
public class Circle implements Farm {
  static double PI = 3.14;
  double radius;

  public Circle(double radius) {
    super();
    this.radius = radius;
  }

  @Override
  public double area() {
    // TODO Auto-generated method stub
    return Circle.PI * Math.pow(radius, 2);
  }
}
