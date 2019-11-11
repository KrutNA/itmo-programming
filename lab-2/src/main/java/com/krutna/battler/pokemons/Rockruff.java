package com.krutna.battler.pokemons;

import com.krutna.battler.moves.physical.RockTomb;
import com.krutna.battler.moves.physical.Tackle;
import com.krutna.battler.moves.status.Leer;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Rockruff extends Pokemon {
  public Rockruff(String name, int level) {
    super(name, level);
    this.setType(Type.ROCK);
    this.setStats(45, 65, 40, 30, 40, 60);
    this.setMove(new RockTomb(), new Tackle(), new Leer());
  }
}
