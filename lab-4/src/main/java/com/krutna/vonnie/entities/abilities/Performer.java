package com.krutna.vonnie.entities.abilities;

import com.krutna.vonnie.entities.Entity;

public interface Performer {

  public enum Type {
    NONE(""),
    OCCASIONALLY("ocassionally"),
    PURPOSELY("purposely"),
    FRIENDLY("friendly");

    private String name;

    private Type(String name) {
      this.name = name;
    }

    @Override
    public String toString() {
      return this.name;
    }
  }

  public String pour(Entity what, Entity to);

  public String eat(Entity what);

  public String push(Entity what, Type type);

  public String throwIn(Entity what);

  public String throwTo(Entity what, Entity to);
}
