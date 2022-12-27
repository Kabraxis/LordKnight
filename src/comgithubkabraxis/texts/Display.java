package comgithubkabraxis.texts;

public class Display {
    public static String hitMessage(int healthPreHit, int hitPoints) {
        return " got hit for: " + (healthPreHit - hitPoints) + " DMG!";
    }
}
