package comgithubkabraxis;
import comgithubkabraxis.entities.Player;
import comgithubkabraxis.entities.Monster;
import comgithubkabraxis.mechanics.Battle;

public class Main {
    public static void main(String[] args) {
        Player knight = new Player(100, 20, "Sir Knight");
        Monster goblin = new Monster(5, 15, "goblin");

        Battle.fight(knight, goblin);

    }
}