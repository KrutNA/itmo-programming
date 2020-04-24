package com.krutna.doonos_book.space.objects;

import com.krutna.doonos_book.exceptions.UnsignedException;
import com.krutna.doonos_book.space.AstronomicalObjectCharacteristics;
import com.krutna.doonos_book.space.objects.AstronomicalObject.Type;

public class Planet extends AstronomicalObject {
  public enum Type implements AstronomicalObject.Type {
    GAS_GIANT("gas giant"),
    TERRESRIAL("terresrial");

    private String name;

    private Type(String name) {
      this.name = name;
    }

    @Override
    public String toString() {
      return this.name;
    }
  }

  public Planet(String name, Type type, AstronomicalObjectCharacteristics characteristics)
      throws UnsignedException {
    super(name, type, characteristics);
  }
}
