package com.krutna.vonnie.entities;

public class SimpleEntity implements Entity {
  String name;

  public SimpleEntity(final String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public String toString() {
    return String.format("%s: {name: %s}", this.getClass().getSimpleName(), this.name);
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }

    if (obj == this) {
      return true;
    }

    if (obj.hashCode() != this.hashCode()) {
      return false;
    }

    if ((obj instanceof Entity)
        && ((Entity) obj).getName().equals(this.name)
        && (this.getClass().equals(this.getClass()))) {
      return true;
    }

    return false;
  }

  @Override
  public int hashCode() {
    return this.name.hashCode();
  }
}
