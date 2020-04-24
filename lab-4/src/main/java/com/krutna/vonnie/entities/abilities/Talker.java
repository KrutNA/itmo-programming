package com.krutna.vonnie.entities.abilities;

import com.krutna.vonnie.entities.Entity;

/** Talker */
public interface Talker {
  public String say(String msg);

  public String sayTo(String msg, Entity obj);
}
