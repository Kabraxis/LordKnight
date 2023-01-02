package texts;

public class Display {
    public static void hit(String entityName, int entityHealthPreHit, int entityHealth) {
        System.out.printf("%s got hit for: %d DMG!\"",
                entityName, entityHealthPreHit - entityHealth);
    }

    public static void miss(String entityName) {
        System.out.printf("%s missed!",
                entityName);
    }

    public static void selection() {
        System.out.println("Select action: 1 - attack, 2 - potion, 3 - run'\n'");
    }

    public static void encountering(String playerName, String monsterName,
                                    int playerHealth, int monsterHealth) {
        System.out.printf("%s encounters %s!%n%1$s's HP is: %d, %2$s's HP is: %d%nCHARGE !!%n%n",
                playerName, monsterName, playerHealth, monsterHealth);
    }

    public static void deathnote(String entityDead) {
        System.out.printf("%s is dead",
                entityDead);
    }

    public static void invalidAction() {
        System.out.println("Please only enter a valid action.");
    }
}
