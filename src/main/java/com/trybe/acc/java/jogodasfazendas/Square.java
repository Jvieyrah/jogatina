package com.trybe.acc.java.jogodasfazendas;

/**
 * This class represents a sample class.
 *
 * @author joao
 */
public class Square implements Farm {
  double side;

  public Square(double side) {
    super();
    this.side = side;
  }

  @Override
  public double area() {
    // TODO Auto-generated method stub
    return this.side * this.side;
  }

}
