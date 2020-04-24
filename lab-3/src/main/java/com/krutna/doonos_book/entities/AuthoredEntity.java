package com.krutna.doonos_book.entities;

import com.krutna.doonos_book.Characteristic;
import com.krutna.doonos_book.Entity;
import com.krutna.doonos_book.book.entities.CharacterizedEntity;
import java.util.List;

public class AuthoredEntity extends CharacterizedEntity {
  protected Entity author;

  public AuthoredEntity(String name, Entity author, List<Characteristic> characteristics) {
    super(name, characteristics);
    this.author = author;
  }

  public Entity getAuthor() {
    return this.author;
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
            .anyMatch(characteristic -> characteristic.equals((AuthoredEntity) obj)))) {
      return true;
    }

    if ((obj instanceof CharacterizedEntity)
        && ((AuthoredEntity) obj).toString().equals(this.toString())
        && (((AuthoredEntity) obj).getAuthor() == this.author)
        && ((AuthoredEntity) obj).getCharacteristics().equals(this.characteristics)) {
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
