package com.krutna.battler.moves.status;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Leer extends StatusMove {
  public Leer() {
    super();
    this.type = Type.NORMAL;
    this.accuracy = 100;
  }

  @Override
  protected void applyOppEffects(Pokemon pokemon) {
    pokemon.addEffect(new Effect().stat(Stat.DEFENSE, 1));
  }
}
