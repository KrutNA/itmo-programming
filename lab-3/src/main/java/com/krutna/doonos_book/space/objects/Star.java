package com.krutna.doonos_book.space.objects;

import com.krutna.doonos_book.space.AstronomicalObjectCharacteristics;
import com.krutna.doonos_book.space.objects.AstronomicalObject.Type;

public class Star extends AstronomicalObject {
  public enum Type implements AstronomicalObject.Type {
    RED_GIANT("red giant"),
    MID_SIZED("mid-sized"),
    RED_DWARF("red dwarf"),
    YELLOW_DWARF("yellow dwarf"),
    ORANGE_DWARF("orange dwarf"),
    PLANETARY_NEBULA("planetary nebula"),
    BLUE_DWARF("blue dwarf"),
    WHITE_DWARF("white dwarf"),
    BLACK_DWARF("black dwarf"),
    NEUTRON_STAR("neutron star"),
    PROTOSTAR("protostar"),
    MASSIVE_STAR("massive star"),
    RED_SUPERGIANT("red supergiant"),
    SUPERNOVA("supernova"),
    BLACK_HOLE("black hole");

    private String name;

    private Type(String name) {
      this.name = name;
    }

    @Override
    public String toString() {
      return this.name;
    }
  }

  public Star(String name, Type type, AstronomicalObjectCharacteristics characteristics) {
    super(name, type, characteristics);
  }
}
