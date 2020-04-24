package com.krutna.vonnie.entities.abilities;

import com.krutna.vonnie.entities.Entity;
import com.krutna.vonnie.exceptions.PartException;

/** Observer */
public interface Observer {
  public String lookAt(Entity obj);

  public String lookAtPartWithName(String name) throws PartException;
}
