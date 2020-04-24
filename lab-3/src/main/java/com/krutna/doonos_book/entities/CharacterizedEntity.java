package com.krutna.doonos_book.book.entities;

import com.krutna.doonos_book.Characteristic;
import com.krutna.doonos_book.Entity;
import java.util.List;

public class CharacterizedEntity extends Entity {
  protected List<Characteristic> characteristics;

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

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }

    if (this == obj) {
      return true;
    }

    if ((obj instanceof Characteristic)
        && (this.characteristics.stream()
            .anyMatch(characteristic -> characteristic.equals((Characteristic) obj)))) {
      return true;
    }

    if ((obj instanceof CharacterizedEntity)
        && ((CharacterizedEntity) obj).toString().equals(this.toString())
        && ((CharacterizedEntity) obj).characteristics.equals(this.characteristics)) {
      return true;
    }

    return false;
  }

  @Override
  public int hashCode() {
    final int argsCount = 2;
    return (this.name.hashCode() / argsCount) + (this.characteristics.hashCode() / argsCount);
  }
}
