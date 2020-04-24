package com.krutna.doonos_book;

public class Characteristic {
  protected String name;

  public Characteristic(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public String getInfo() {
    return this.name;
  }

  @Override
  public String toString() {
    return String.format("%s: {name: %s}", this.getClass().getSimpleName(), this.name);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }

    if (obj == this) {
      return true;
    }

    if ((obj instanceof Characteristic)
        && ((Characteristic) obj).name.equals(this.name)
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
