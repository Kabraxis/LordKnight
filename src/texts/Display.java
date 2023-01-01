package texts;

public class Display {
    public static void hit(String entityName, int healthPreHit, int hitPoints) {
        System.out.printf("%s got hit for: %d DMG!\"",
                entityName, healthPreHit - hitPoints);
    }

    public static void miss(String entityName) {
        System.out.printf("%s missed!",
                entityName);
    }

    public static void selection() {
        System.out.println("Select action: 1 - fight, 2 - potion, 3 - run'\n'");
    }

    public static void encountering(String entityNameAttacker, String entityNameDefender,
                                    int healthAttacker, int healthDefender) {
        System.out.printf("%s encounters %s!%n%1$s's HP is: %d, %2$s's HP is: %d%nCHARGE !!%n%n",
                entityNameAttacker, entityNameDefender, healthAttacker, healthDefender);
    }

    public static void deathnote(String entityNamenDefender) {
        System.out.printf("%s is dead",
                entityNamenDefender);
    }
}
