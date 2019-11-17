package com.krutna.doonos_book.exceptions;

public class UnsignedException extends Exception {
  public UnsignedException(float value) {
    super(String.format("Expected value above zero, got %f", value));
  }

  public UnsignedException(int value) {
    super(String.format("Expected value above zero, got %d", value));
  }
}
