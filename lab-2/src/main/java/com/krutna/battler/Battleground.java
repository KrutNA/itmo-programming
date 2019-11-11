package com.krutna.battler;

import com.krutna.battler.pokemons.Lycanroc;
import com.krutna.battler.pokemons.Phione;
import com.krutna.battler.pokemons.Rockruff;
import com.krutna.battler.pokemons.Slaking;
import com.krutna.battler.pokemons.Slakoth;
import com.krutna.battler.pokemons.Vigoroth;
import ru.ifmo.se.pokemon.Battle;

public class Battleground {
  public static void main(String[] args) {
    Battle battle = new Battle();
    final String string = null;
    battle.addFoe(new Phione("'ошибаетесь, мухи на него слетаются по другой причине'", 99));
    battle.addAlly(new Rockruff("'джава'", 23));
    battle.addFoe(new Lycanroc("'deprecated с рождения'", 75));
    battle.addAlly(new Slakoth("'интерфейс не класс'", 38));
    battle.addFoe(new Vigoroth("'ты чёт его перегружаешь'", 38));
    battle.addAlly(new Slaking("'не стыдно, что от меня наследуешься?'", 38));
    battle.go();
  }
}
