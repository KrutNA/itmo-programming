package com.krutna.doonos_book.entities;

public enum Material {
  GLASS("glass"),
  STEEL("steel"),
  IRON("iron"),
  BRICK("brick"),
  GOLD("gold"),
  SILVER("silver"),
  WOOD("wood");

  private String name;

  Material(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public String toString() {
    return String.format("%s{%s}", this.getClass().getSimpleName(), this.name);
  }
}
