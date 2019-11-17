package com.krutna.doonos_book.space;

import com.krutna.doonos_book.Entity;
import java.util.List;

public class AstronomicalObjectCharacteristics {
  private double atmosphere;
  private double middleRadius;
  private double mass;
  private List<Entity> entities;

  // @Inject
  public AstronomicalObjectCharacteristics(
      double atmosphere, double radius, double mass, List<Entity> entities) {
    this.atmosphere = atmosphere;
    this.middleRadius = radius;
    this.mass = mass;
    this.entities = entities;
  };

  double getAtmosphere() {
    return this.atmosphere;
  }

  double getRadius() {
    return this.middleRadius;
  }

  double getMass() {
    return this.mass;
  }

  List<Entity> getEntities() {
    return this.entities;
  }

  @Override
  public String toString() {
    return String.format(
        "%s: {atmosphere: %f, radius: %f, mass: %f, objects: %s}",
        this.getClass().getSimpleName(),
        this.atmosphere,
        this.middleRadius,
        this.mass,
        this.entities.toString());
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }

    if (this == obj) {
      return true;
    }

    if ((obj instanceof AstronomicalObjectCharacteristics)
        && (((AstronomicalObjectCharacteristics) obj).atmosphere == this.atmosphere)
        && (((AstronomicalObjectCharacteristics) obj).mass == this.mass)
        && (((AstronomicalObjectCharacteristics) obj).middleRadius == this.middleRadius)
        && (((AstronomicalObjectCharacteristics) obj).entities.equals(this.entities))) {
      return true;
    }

    return false;
  }

  @Override
  public int hashCode() {
    final int argsCount = 4;
    return ((int) this.atmosphere / argsCount)
        + ((int) this.mass / argsCount)
        + ((int) this.middleRadius / argsCount)
        + (this.entities.hashCode() / argsCount);
  }
}
