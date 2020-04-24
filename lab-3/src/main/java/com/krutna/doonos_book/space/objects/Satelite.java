package com.krutna.doonos_book.space.objects;

import com.krutna.doonos_book.exceptions.UnsignedException;
import com.krutna.doonos_book.space.AstronomicalObjectCharacteristics;
import com.krutna.doonos_book.space.objects.AstronomicalObject.Type;

public class Satelite extends AstronomicalObject {
  public enum Type implements AstronomicalObject.Type {
    NONE("none"),
    // I'm so sorry, but this fucking book...
    HOLLOW("hollow, like rubber ball");

    private String name;

    private Type(String name) {
      this.name = name;
    }

    @Override
    public String toString() {
      return this.name;
    }
  }

  public Satelite(String name, Type type, AstronomicalObjectCharacteristics characteristics)
      throws UnsignedException {
    super(name, type, characteristics);
  }
}
