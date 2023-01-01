package texts;

public class Display {
    public static void hitMessage(String entityName, int healthPreHit, int hitPoints) {
        System.out.println(" got hit for: " + (healthPreHit - hitPoints) + " DMG!");
    }

    public static String missedMessage() {
        return " missed!";
    }

    public static void selectAction() {
        System.out.println("Select action: 1 - fight, 2 - potion, 3 - run'\n'");
    }
}
