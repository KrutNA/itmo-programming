package com.krutna.doonos_book;

import com.krutna.doonos_book.book.entities.CharacterizedEntity;
import com.krutna.doonos_book.entities.AuthoredEntity;
import com.krutna.doonos_book.entities.Material;
import com.krutna.doonos_book.entities.MaterialEntity;
import com.krutna.doonos_book.exceptions.UnsignedException;
import com.krutna.doonos_book.space.AstronomicalObjectCharacteristics;
import com.krutna.doonos_book.space.AstronomicalSystem;
import com.krutna.doonos_book.space.objects.Planet;
import com.krutna.doonos_book.space.objects.Satelite;
import com.krutna.doonos_book.space.objects.Star;
import java.util.List;
import java.util.Vector;

public class Project {
  public static void main(String[] args) {
    Vector<Characteristic> doonosCharacteristics = new Vector<>();
    Satelite moon;
    Planet earth;
    Star sun;
    CharacterizedEntity doono = new CharacterizedEntity("Doono", setupVector());

    try {
      moon =
          new Satelite(
              "Moon",
              Satelite.Type.HOLLOW,
              new AstronomicalObjectCharacteristics(
                  0D,
                  1740D,
                  7.35E22,
                  273D,
                  setupVector(
                      new CharacterizedEntity(
                          "loonatics",
                          setupVector(
                              new Characteristic("knows couldn't live outside"),
                              new Characteristic("can't live in dome"),
                              new Characteristic("moves inside"),
                              new Characteristic("lives inside"))),
                      new MaterialEntity("dome", Material.GLASS))));

      earth =
          new Planet(
              "Earth",
              Planet.Type.TERRESRIAL,
              new AstronomicalObjectCharacteristics(
                  100D,
                  6371D,
                  5.9726E24,
                  100D,
                  setupVector(
                      doono,
                      new CharacterizedEntity(
                          "dwarfs", setupVector(new Characteristic("interested in reading"))),
                      new Entity("scientists"),
                      new CharacterizedEntity(
                          "Zveozdochkin",
                          setupVector(
                              new Characteristic("kind"),
                              new Characteristic("short"),
                              new Characteristic("demanding"),
                              new Characteristic("irreconcilable"),
                              new Characteristic("not angry"),
                              new Characteristic("member of the academy of astronomical science"),
                              new Characteristic("appreciates accuracy"),
                              new Characteristic("appreciates order"),
                              new Characteristic("hates fantasies"),
                              new Characteristic("hates inventions"),
                              new Graduation("astronomical", "professor"))),
                      new AuthoredEntity(
                          "Doono's Book",
                          doono,
                          setupVector(
                              new Characteristic("interesting"),
                              new Characteristic("not scientifically confirmed"),
                              new Characteristic("nonsense"))))));

      sun =
          new Star(
              "Sun",
              Star.Type.YELLOW_DWARF,
              new AstronomicalObjectCharacteristics(
                  0D, 4.379E6, 1.9885E30, 4000D, setupVector(new Entity("sunlight"))));

      AstronomicalSystem system =
          new AstronomicalSystem(
              new AstronomicalSystem(sun),
              setupVector(
                  new AstronomicalSystem(
                      new AstronomicalSystem(earth), setupVector(new AstronomicalSystem(moon)))));

      System.out.println(system.toString());
    } catch (UnsignedException e) {
      System.out.println(e.getMessage());
    }
  }

  private static <T> List<T> setupVector(T... args) {
    Vector<T> vector = new Vector<>();

    for (T arg : args) {
      vector.add(arg);
    }

    return vector;
  }
}
