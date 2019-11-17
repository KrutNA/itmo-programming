package com.krutna.doonos_book.entities;

import com.krutna.doonos_book.Entity;

public class MaterialEntity extends Entity {
  private Material material;

  public MaterialEntity(String name, Material material) {
    super(name);
    this.material = material;
  }

  public Material getMaterial() {
    return this.material;
  }

  @Override
  public String toString() {
    return String.format(
        "%s{name: %s, material: %s}",
        this.getClass().getSimpleName(), this.name, this.material.toString());
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }

    if (obj == this) {
      return true;
    }

    if ((obj instanceof MaterialEntity)
        && ((MaterialEntity) obj).getName().equals(this.name)
        && ((MaterialEntity) obj).getMaterial().equals(this.material)
        && (this.getClass().equals(this.getClass()))) {
      return true;
    }

    return false;
  }

  @Override
  public int hashCode() {
    final int argsCount = 2;
    return this.name.hashCode() / 2 + this.material.hashCode() / 2;
  }
}
