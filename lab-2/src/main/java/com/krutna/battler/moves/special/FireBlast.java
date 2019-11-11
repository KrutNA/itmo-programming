package com.krutna.battler.moves.special;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class FireBlast extends SpecialMove {
  public FireBlast() {
    super(Type.FIRE, 110, 85);
  }

  @Override
  protected void applyOppEffects(Pokemon pokemon) {
    pokemon.addEffect(new Effect().chance(0.1).condition(Status.BURN));
  }
}
