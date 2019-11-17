package com.krutna.doonos_book;

import com.krutna.doonos_book.book.entities.CharacterizedEntity;
import com.krutna.doonos_book.entities.Material;
import com.krutna.doonos_book.entities.MaterialEntity;
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

    Satelite moon =
        new Satelite(
            "Moon",
            Satelite.Type.HOLLOW,
            new AstronomicalObjectCharacteristics(
                0D,
                1740D,
                7.35E22,
                setupVector(new Entity("loonatic"), new MaterialEntity("dome", Material.GLASS))));

    Planet earth =
        new Planet(
            "Earth",
            Planet.Type.TERRESRIAL,
            new AstronomicalObjectCharacteristics(
                100D,
                6371D,
                5.9726E24,
                setupVector(
                    new CharacterizedEntity("Doono", setupVector()),
                    new CharacterizedEntity(
                        "Zveozdochkin",
                        setupVector(
                            new Characteristic("kind"),
                            new Characteristic("short"),
                            new Characteristic("demanding"),
                            new Characteristic("irreconcilable"))),
                    new CharacterizedEntity(
                        "Doono's Book",
                        setupVector(
                            new Characteristic("interesting"),
                            new Characteristic("not scientifically confirmed"),
                            new Characteristic("nonsense"))))));

    Star sun =
        new Star(
            "Sun",
            Star.Type.YELLOW_DWARF,
            new AstronomicalObjectCharacteristics(
                0D, 4.379E6, 1.9885E30, setupVector(new Entity("sunlight"))));

    AstronomicalSystem system =
        new AstronomicalSystem(
            new AstronomicalSystem(sun),
            setupVector(
                new AstronomicalSystem(
                    new AstronomicalSystem(earth), setupVector(new AstronomicalSystem(moon)))));

    System.out.println(system.toString());
  }

  private static <T> List<T> setupVector(T... args) {
    Vector<T> vector = new Vector<>();

    for (T arg : args) {
      vector.add(arg);
    }

    return vector;
  }
}
