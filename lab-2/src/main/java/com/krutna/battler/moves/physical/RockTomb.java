package com.krutna.battler.moves.physical;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class RockTomb extends PhysicalMove {
  public RockTomb() {
    super(Type.ROCK, 60, 95);
  }

  @Override
  protected void applyOppEffects(Pokemon pokemon) {
    pokemon.addEffect(new Effect().stat(Stat.SPEED, 1));
  }
}
