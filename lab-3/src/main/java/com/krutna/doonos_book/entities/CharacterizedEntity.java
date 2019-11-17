package com.krutna.doonos_book.book.entities;

import com.krutna.doonos_book.Characteristic;
import com.krutna.doonos_book.Entity;
import java.util.List;

public class CharacterizedEntity extends Entity {
  private List<Characteristic> characteristics;

  public CharacterizedEntity(String name, List<Characteristic> characteristics) {
    super(name);
    this.characteristics = characteristics;
  }

  public List<Characteristic> getCharacteristics() {
    return this.characteristics;
  }

  @Override
  public String toString() {
    return String.format(
        "%s: {name: %s, characteristics: %s}",
        this.getClass().getSimpleName(), this.name, this.characteristics.toString());
  }
}
