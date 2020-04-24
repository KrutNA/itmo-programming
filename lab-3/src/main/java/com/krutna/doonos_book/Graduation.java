package com.krutna.doonos_book;

public class Graduation extends Characteristic {
  String level;

  public Graduation(String subject, String level) {
    super(subject);
    this.level = level;
  }

  public String getGraduationLevel() {
    return this.level;
  }

  public String getGraduationSubject() {
    return this.name;
  }

  @Override
  public String getInfo() {
    return String.format("%s %s", this.name, this.level);
  }

  @Override
  public String toString() {
    return String.format(
        "%s: {subject: %s, level: %s}", this.getClass().getSimpleName(), this.name, this.level);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }

    if (obj == this) {
      return true;
    }

    if ((obj instanceof Graduation)
        && ((Graduation) obj).name.equals(this.name)
        && ((Graduation) obj).getGraduationLevel().equals(this.level)
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
