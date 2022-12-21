package comgithubkabraxis;
import comgithubkabraxis.entities.Player;
import comgithubkabraxis.entities.Monster;
import comgithubkabraxis.mechanics.Battle;

public class Main {
    public static void main(String[] args) {
        Player kabraxis = new Player(100, 20, "Sir Kabraxis");
        Monster poring = new Monster(50, 15, "Poring");

        Battle.fight(kabraxis, poring);

    }
}