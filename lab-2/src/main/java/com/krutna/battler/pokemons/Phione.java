package com.krutna.battler.pokemons;

import com.krutna.battler.moves.special.BubbleBeam;
import com.krutna.battler.moves.special.DazzlingGleam;
import com.krutna.battler.moves.special.WaterPulse;
import com.krutna.battler.moves.status.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Phione extends Pokemon {
  public Phione(String name, int level) {
    super(name, level);
    this.setStats(80, 80, 80, 80, 80, 80);
    this.setType(Type.WATER);
    this.setMove(new Rest(), new BubbleBeam(), new WaterPulse(), new DazzlingGleam());
  }
}
