package com.trybe.acc.java.jogodasfazendas;

/**
 * This class represents a sample class.
 *
 * @author joao
 */
public class PlayerResult {
  String playerName;
  Farm[] farms;

  public PlayerResult(String name, Farm[] farms) {
    this.playerName = name;
    this.farms = farms;
  }

  /**
   * This class represents a sample class.
   *
   * @author joao
   */
  public double score() {
    double cont = 0;
    for (Farm index : farms) {
      cont += index.area();
    }
    return cont;
  }

  public String toString() {
    return playerName + "has score " + score();
  }
}
