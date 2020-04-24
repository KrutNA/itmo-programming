package com.krutna.vonnie.entities;

import com.krutna.vonnie.entities.abilities.Observer;
import com.krutna.vonnie.entities.abilities.Parted;
import com.krutna.vonnie.entities.abilities.Performer;
import com.krutna.vonnie.entities.abilities.Talker;
import com.krutna.vonnie.entities.abilities.Thinker;
import com.krutna.vonnie.entities.abilities.Walker;
import com.krutna.vonnie.exceptions.NoPartsException;
import com.krutna.vonnie.exceptions.PartException;
import java.util.HashMap;
import java.util.Map;

/**
 * Character. This class represents any character with some base abilities like watching, talking,
 * thinking, walking.
 */
public class Character extends AbstractAbilitiedEntity
    implements Parted, Walker, Observer, Thinker, Talker, Performer {
  Map<String, Entity> parts;

  public Character(final String name) {
    super(name);
    this.parts = new HashMap<>();
  }

  public Character(final String name, final Map<String, Entity> parts) {
    super(name);
    this.parts = parts;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public String say(final String msg) {
    return String.format("%s sayed \"%s\"", this.name, msg);
  }

  @Override
  public String sayTo(final String msg, final Entity obj) {
    return String.format("%s sayed to %s: \"%s\"", this.name, obj.getName(), msg);
  }

  @Override
  public String remember(final boolean ability) {
    return String.format("%s%s remember", this.name, ability ? "" : " not");
  }

  @Override
  public String think(final String description) {
    return String.format("%s thought \"%s\"", this.name, description);
  }

  @Override
  public String lookAt(final Entity obj) {
    return String.format("%s looked at %s", obj.getName());
  }

  @Override
  public String startOff() {
    return String.format("%s start off", this.name);
  }

  @Override
  public String goTo(final Location location) {
    return String.format("%s goes to %s", this.name, location.getName());
  }

  @Override
  public String lagALittle() {
    return String.format("%s lag a little", this.name);
  }

  @Override
  public String go() {
    return String.format("%s goes", this.name);
  }

  @Override
  public String creepUp() {
    return String.format("%s creep up", this.name);
  }

  @Override
  public String stopWaiting() {
    return String.format("%s stoped waiting", this.name);
  }

  @Override
  public String runBack() {
    return String.format("%s run back", this.name);
  }

  @Override
  public Entity getPartByName(final String name) throws PartException {
    if (this.parts == null) {
      throw new NoPartsException(this);
    }
    if (!this.parts.containsKey(name)) {
      throw new PartException(name);
    }
    return this.parts.get(name);
  }

  @Override
  public String lookAtPartWithName(final String name) throws PartException {
    return String.format("%s looked at %s", this.name, this.getPartByName(name).getName());
  }

  @Override
  public String stop() {
    return String.format("%s stopped", this.name);
  }

  @Override
  public String pour(final Entity what, final Entity to) {
    return String.format("%s poured %s to %s", this.name, what.getName(), to.getName());
  }

  @Override
  public String eat(final Entity what) {
    return String.format("%s ate %s", this.name, what.getName());
  }

  @Override
  public String push(final Entity what, final Type type) {
    return String.format("%s pushed %s %s", this.name, what.getName(), type);
  }

  @Override
  public String forgot(final String description) {
    return String.format("%s forgot", this.name, description);
  }

  @Override
  public String throwIn(final Entity what) {
    return String.format("%s throwed in %s", this.name, what.getName());
  }

  @Override
  public String throwTo(final Entity what, final Entity to) {
    return String.format("%s throw %s to ", this.name, what.getName(), to.getName());
  }
}
