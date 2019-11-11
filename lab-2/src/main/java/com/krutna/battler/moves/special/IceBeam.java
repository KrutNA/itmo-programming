package com.krutna.battler.moves.special;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class IceBeam extends SpecialMove {
  public IceBeam() {
    super(Type.ICE, 90, 100);
  }

  @Override
  protected void applyOppEffects(Pokemon pokemon) {
    pokemon.addEffect(new Effect().chance(0.1).condition(Status.FREEZE));
  }
}
