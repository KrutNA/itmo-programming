package com.krutna.vonnie.entities.abilities;

import com.krutna.vonnie.entities.Location;

/** Walker */
public interface Walker {
  public String startOff();

  public String goTo(Location location);

  public String lagALittle();

  public String go();

  public String creepUp();

  public String stopWaiting();

  public String runBack();

  public String stop();
}
