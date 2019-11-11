package com.krutna.battler.pokemons;

import com.krutna.battler.moves.special.FireBlast;
import com.krutna.battler.moves.special.IceBeam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Slakoth extends Pokemon {
  public Slakoth(String name, int level) {
    super(name, level);
    this.setType(Type.NORMAL);
    this.setStats(60, 60, 60, 35, 35, 35);
    this.setMove(new IceBeam(), new FireBlast());
  }
}
