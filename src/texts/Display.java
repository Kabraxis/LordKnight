package texts;

public class Display {
    public static String hitMessage(int healthPreHit, int hitPoints) {
        return " got hit for: " + (healthPreHit - hitPoints) + " DMG!";
    }

    public static String missedMessage() {
        return " missed!";
    }

    public static void selectAction() {
        System.out.println("Select action: 1 - fight, 2 - potion, 3 - run'\n'");
    }
}
