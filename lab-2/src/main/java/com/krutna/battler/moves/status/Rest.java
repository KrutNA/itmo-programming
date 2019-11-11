package com.krutna.battler.moves.status;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Rest extends StatusMove {
  public Rest() {
    super();
    this.type = Type.PSYCHIC;
  }

  @Override
  protected void applySelfEffects(Pokemon pokemon) {
    pokemon.addEffect(new Effect().turns(2).condition(Status.SLEEP));
    pokemon.addEffect(new Effect().stat(Stat.HP, -666));
  }
}
