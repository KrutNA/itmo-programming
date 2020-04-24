package com.krutna.doonos_book.space.objects;

import com.krutna.doonos_book.Entity;
import com.krutna.doonos_book.exceptions.UnsignedException;
import com.krutna.doonos_book.space.AstronomicalObjectCharacteristics;

public abstract class AstronomicalObject extends Entity {
  public interface Type {}

  private AstronomicalObjectCharacteristics characteristics;

  protected Type type;

  // @Inject
  public AstronomicalObject(
      String name, Type type, AstronomicalObjectCharacteristics characteristics)
      throws UnsignedException {
    super(name);
    this.type = type;
    this.characteristics = characteristics;
  }

  @Override
  public String toString() {
    return String.format(
        "%s: {name: %s, type: %s, characteristics: %s}",
        this.getClass().getSimpleName(), this.name, this.type, this.characteristics);
  }

  public Type getType() {
    return this.type;
  }

  public AstronomicalObjectCharacteristics getCharacteristics() {
    return this.characteristics;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }

    if (this == obj) {
      return true;
    }

    if ((obj instanceof AstronomicalObject)
        && ((AstronomicalObject) obj).toString().equals(this.toString())
        && ((AstronomicalObject) obj).characteristics.equals(this.characteristics)) {
      return true;
    }

    return false;
  }

  @Override
  public int hashCode() {
    final int argsCount = 3;
    return (this.name.hashCode() / argsCount)
        + (this.type.hashCode() / argsCount)
        + (this.characteristics.hashCode() / argsCount);
  }
}
