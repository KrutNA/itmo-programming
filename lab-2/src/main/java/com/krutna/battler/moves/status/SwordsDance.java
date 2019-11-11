package com.krutna.battler.moves.status;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class SwordsDance extends StatusMove {
  public SwordsDance() {
    super();
    this.type = Type.NORMAL;
  }

  @Override
  protected void applySelfEffects(Pokemon pokemon) {
    pokemon.addEffect(new Effect().stat(Stat.ATTACK, -1));
  }
}
