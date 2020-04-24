package com.krutna.vonnie.entities.abilities;

/** Thinker */
public interface Thinker {
  public String remember(boolean ability);

  public String think(String description);

  public String forgot(String description);
}
