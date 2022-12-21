package comgithubkabraxis.mechanics;

import java.util.Random;

public class Randomizer {

    public static int randomRange(int min, int max) {
        return new Random().nextInt(min, max);
    }
}
