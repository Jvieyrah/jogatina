package com.trybe.acc.java.jogodasfazendas;

/**
 * This class represents a sample class.
 *
 * @author joao
 */
public class Rectangle extends Polygon {
  public Rectangle(double base, double height) {
    super(base, height);
    // TODO Auto-generated constructor stub
  }

  @Override
  public double area() {
    // TODO Auto-generated method stub
    return (this.base * this.height);
  }
}
