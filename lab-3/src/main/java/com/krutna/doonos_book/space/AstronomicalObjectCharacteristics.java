package com.krutna.doonos_book.space;

import com.krutna.doonos_book.Entity;
import com.krutna.doonos_book.exceptions.UnsignedException;
import java.util.List;

public class AstronomicalObjectCharacteristics {
  private double atmosphere;
  private double middleRadius;
  private double temperature;
  private double mass;
  private List<Entity> entities;

  // @Inject
  public AstronomicalObjectCharacteristics(
      double atmosphere, double radius, double mass, double temperature, List<Entity> entities)
      throws UnsignedException {
    if (atmosphere < 0) {
      throw new UnsignedException(atmosphere);
    }
    if (radius < 0) {
      throw new UnsignedException(radius);
    }
    if (mass < 0) {
      throw new UnsignedException(mass);
    }
    if (temperature < 0) {
      throw new UnsignedException(temperature);
    }
    this.atmosphere = atmosphere;
    this.middleRadius = radius;
    this.temperature = temperature;
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

  double getTemperature() {
    return this.temperature;
  }

  void resetAtmosphere() {
    this.atmosphere = 0D;
    this.temperature *= 2;
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
