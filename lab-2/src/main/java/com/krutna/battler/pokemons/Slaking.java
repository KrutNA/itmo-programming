package com.krutna.battler.pokemons;

import com.krutna.battler.moves.special.ShadowBall;

public class Slaking extends Vigoroth {
  public Slaking(String name, int level) {
    super(name, level);
    this.setStats(150, 160, 100, 95, 65, 100);
    this.addMove(new ShadowBall());
  }
}
