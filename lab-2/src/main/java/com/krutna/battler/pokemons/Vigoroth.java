package com.krutna.battler.pokemons;

import com.krutna.battler.moves.status.FocusEnergy;

public class Vigoroth extends Slakoth {
  public Vigoroth(String name, int level) {
    super(name, level);
    this.setStats(80, 80, 80, 55, 55, 90);
    this.addMove(new FocusEnergy());
  }
}
