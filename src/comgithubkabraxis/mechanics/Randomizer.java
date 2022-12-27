package comgithubkabraxis.mechanics;

import java.util.Random;

public class Randomizer {
    public static int rndRange(int min, int max) {
        return new Random().nextInt(min, max);
    }

    public static int rndDMG(int attack) {
        return new Random().nextInt(1, attack);
    }
}
