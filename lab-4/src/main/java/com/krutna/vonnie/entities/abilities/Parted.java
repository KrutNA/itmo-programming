package com.krutna.vonnie.entities.abilities;

import com.krutna.vonnie.entities.Entity;
import com.krutna.vonnie.exceptions.PartException;

public interface Parted {
  public Entity getPartByName(String name) throws PartException;
}
