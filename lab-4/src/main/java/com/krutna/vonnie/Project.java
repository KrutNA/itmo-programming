package com.krutna.vonnie;

import com.krutna.vonnie.entities.Character;
import com.krutna.vonnie.entities.Location;
import com.krutna.vonnie.entities.SimpleEntity;
import com.krutna.vonnie.entities.abilities.Performer;
import java.util.List;
import java.util.Vector;

class Project {
  public static void main(final String[] args) {
    class Story {
      List<String> parts;

      public Story() {
        parts = new Vector<>();
      }

      public void add(final String part) {
        parts.add(part);
      }

      public void waitMinutes(final int minutes) {
        if (minutes <= 0) {
          throw new IllegalArgumentException(
              String.format("Only positive values expected, got: %d", minutes));
        }
        this.parts.add(String.format("%d (years) minutes later", minutes));
      }

      public List<String> getStory() {
        return parts;
      }
    }

    final Story story = new Story();
    final CharacterFactory characters = new CharacterFactory();
    final Character rubet = characters.getRubet();
    final Character vonnie = characters.getVonnie();
    final Character potachok = characters.getPotachok();
    final Character kingo = characters.getKingo();
    final Character toger = characters.getToger();
    final Character bobiRu = characters.getBobiRu();
    final Character rober = characters.getRober();
    final Character they = characters.getThem();
    story.add(rubet.startOff());
    try {
      story.add(vonnie.lookAtPartWithName("right paw"));
      story.add(vonnie.lookAtPartWithName("other paw"));
    } catch (final Exception e) {
      System.err.println(e.getMessage());
    }
    story.add(vonnie.remember(false));
    story.add(they.go());
    story.waitMinutes(10);
    story.add(they.stop());
    story.add(vonnie.say("He founds"));
    story.add(potachok.lagALittle());
    story.add(potachok.creepUp());
    story.add(toger.stopWaiting());
    story.add(
        toger.think(
            "There is no one nearby to whom he could say: 'Hey, come on, or something!'. Go home."));
    story.add(toger.runBack());
    story.add(kingo.say("Hey, it's our Toger! It's time for eating cod-liver oil!"));
    story.add(kingo.pour(new SimpleEntity("cod-liver oil"), new SimpleEntity("cup")));
    story.add(bobiRu.say("I'm throwed in already"));
    story.add(toger.eat(new SimpleEntity("cod-liver oil")));
    story.add(toger.say("And me too"));
    story.add(toger.push(bobiRu, Performer.Type.FRIENDLY));
    story.add(toger.push(new SimpleEntity("chair"), Performer.Type.OCCASIONALLY));
    story.add(toger.push(new SimpleEntity("chair"), Performer.Type.PURPOSELY));
    story.add(toger.goTo(new Location("Sex Pines")));
    story.add(they.throwIn(new SimpleEntity("hashish")));
    story.add(they.forgot("basket under the tree"));
    story.add(they.goTo(new Location("home")));
    story.add(rober.goTo(new Location("home")));
    // Here i'm tired off
    story.add(bobiRu.doSmth("say about his bisquit cough"));
    story.add(kingo.doSmth("sayed not to say about that"));
    story.add("After some time");
    story.add(
        rober.doSmth(
            String.format(
                "understand what %s, %s and %s goes somethere in the fog, lost in the %s",
                vonnie.getName(),
                rubet.getName(),
                potachok.getName(),
                new Location("Thicket").getName())));
    story.add(they.doSmth("rested in small sand pit"));
    story.add(vonnie.doSmth("got tired of this sand pit"));
    story.add(
        vonnie.doSmth(
            "seriously suspected that she was just following them on the heels, because wherever they went, they always came across her."));
    story.add(
        "When met it: triumphantly "
            + rubet.say("Now I know, there we're" + " and tiredly " + vonnie.say("Me too")));
    story.getStory().forEach(System.out::println);
  }
}
