package mechanics;

import java.util.Random;

import entities.Mob;

public class RandomMob {
    private static final String[] MOB_NAMES = {"Guys with a Pig", "Copper Wretches", "Wild Fellas", "Wizard Blokes", "Exploiting Kittens"};

    // This method creates and returns a new mob, using randomized values for Health, Attack and
    // a random name from RandomMob.MOB_NAMES.
    public static Mob create() {
        String[] mobNames = new String[RandomMob.MOB_NAMES.length];
        System.arraycopy(RandomMob.MOB_NAMES, 0, mobNames, 0, mobNames.length);

        return new Mob(new Random().nextInt(10, 150),
                new Random().nextInt(10, 20),
                mobNames[new Random().nextInt(0, 4)]);
    }
}
