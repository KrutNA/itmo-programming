package com.krutna.doonos_book.space;

import com.krutna.doonos_book.space.objects.AstronomicalObject;
import java.util.List;
import java.util.Vector;

public class AstronomicalSystem {
  private AstronomicalObject object;
  private List<AstronomicalSystem> mains;
  private List<AstronomicalSystem> elements;

  // @Inject
  public AstronomicalSystem(AstronomicalObject object) {
    this.object = object;
  }

  // @Inject
  public AstronomicalSystem(AstronomicalSystem main, List<AstronomicalSystem> elements) {
    this.mains = new Vector<>();
    this.mains.add(main);
    this.elements = elements;
  }

  // @Inject
  public AstronomicalSystem(List<AstronomicalSystem> mains, List<AstronomicalSystem> elements) {
    this.mains = mains;
    this.elements = elements;
  }

  // @Inject
  public AstronomicalSystem(List<AstronomicalSystem> elements) {
    this.elements = elements;
  }

  public AstronomicalObject getObject() {
    return this.object;
  }

  public List<AstronomicalSystem> getMains() {
    return this.mains;
  }

  public List<AstronomicalSystem> getElements() {
    return this.elements;
  }

  @Override
  public String toString() {
    if (this.object != null) {
      return String.format("%s: {%s}", this.getClass().getSimpleName(), this.object.toString());
    }

    return String.format(
        "%s: {mains: %s, elements: %s}",
        this.getClass().getSimpleName(),
        this.mains.size() == 1 ? this.mains.get(0).toString() : this.mains.toString(),
        this.elements.toString());
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }

    if (this == obj) {
      return true;
    }

    if (this.object != null
        && (obj instanceof AstronomicalSystem)
        && ((AstronomicalSystem) obj).getObject() != null
        && this.object.equals(((AstronomicalSystem) obj).getObject())) {
      return true;
    }

    if ((obj instanceof AstronomicalSystem)
        && this.mains == null
        && ((AstronomicalSystem) obj).getMains() == null
        && ((AstronomicalSystem) obj).getElements().equals(this.elements)) {
      return true;
    }

    if ((obj instanceof AstronomicalSystem)
        && this.mains != null
        && ((AstronomicalSystem) obj).getMains() != null
        && ((AstronomicalSystem) obj).getMains().equals(this.mains)
        && ((AstronomicalSystem) obj).getElements().equals(this.elements)) {
      return true;
    }

    return false;
  }

  @Override
  public int hashCode() {
    final int argsCount = 3;
    return (this.object != null
            ? this.object.hashCode() / argsCount
            : this.mains.hashCode() / argsCount)
        + this.elements.hashCode() / argsCount;
  }
}
