package com.krutna.battler.pokemons;

import com.krutna.battler.moves.status.SwordsDance;
import ru.ifmo.se.pokemon.Type;

public class Lycanroc extends Rockruff {
  public Lycanroc(String name, int level) {
    super(name, level);
    this.setType(Type.ROCK);
    this.setStats(75, 115, 65, 55, 65, 112);
    this.addMove(new SwordsDance());
  }
}
