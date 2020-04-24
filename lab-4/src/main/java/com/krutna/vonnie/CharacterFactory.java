package com.krutna.vonnie;

import com.krutna.vonnie.entities.Character;
import com.krutna.vonnie.entities.Entity;
import com.krutna.vonnie.entities.SimpleEntity;
import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
  private static Character rubet, toger, vonnie, potachok, rober, kingo, bobiRu, they;

  public Character getRubet() {
    if (rubet == null) {
      rubet = new Character("Rubet");
    }
    return rubet;
  }

  public Character getToger() {
    if (toger == null) {
      toger = new Character("Toger");
    }
    return toger;
  }

  public Character getVonnie() {
    if (vonnie == null) {
      Map<String, Entity> parts = new HashMap<>();
      parts.put("right paw", new SimpleEntity("Right paw"));
      parts.put("other paw", new SimpleEntity("Left paw"));
      vonnie = new Character("Vonnie", parts);
    }
    return vonnie;
  }

  public Character getPotachok() {
    if (potachok == null) {
      potachok = new Character("Potachok");
    }
    return potachok;
  }

  public Character getRober() {
    if (rober == null) {
      rober = new Character("Krosfer Rober");
    }
    return rober;
  }

  public Character getKingo() {
    if (kingo == null) {
      kingo = new Character("Kingo");
    }
    return kingo;
  }

  public Character getBobiRu() {
    if (bobiRu == null) {
      bobiRu = new Character("Bobi Ru");
    }
    return bobiRu;
  }

  public Character getThem() {
    if (they == null) {
      they = new Character("Them");
    }
    return they;
  }
}
