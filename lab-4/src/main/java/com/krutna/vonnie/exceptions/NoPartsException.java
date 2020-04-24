package com.krutna.vonnie.exceptions;

import com.krutna.vonnie.entities.Entity;

public class NoPartsException extends RuntimeException {
  private static final long serialVersionUID = -4191383569407494252L;

  public NoPartsException(final Entity obj) {
    super(String.format("Class %s doesn't contain parts", obj.toString()));
  }
}
