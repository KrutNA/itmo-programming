package com.krutna.vonnie.exceptions;

public class PartException extends Exception {

  private static final long serialVersionUID = 1L;

  public PartException(final String name) {
    super(String.format("No such part \"%s\"", name));
  }
}
