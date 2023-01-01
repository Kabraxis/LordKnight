import entities.Player;
import entities.Monster;
import mechanics.Battle;
import mechanics.Action;

public class Main {
    public static void main(String[] args) {

        /* Todo
        * - reduce main file to one line of code
        * - implement scanning for player name upon character creation
        *
        *
        * */

        // The values are health, attack, name
        Player knight = new Player(10, 20, "Sir Knight");
        Monster goblin = new Monster(5, 15, "Goblin");

//        Action.fight(knight, goblin);
        Battle.fight(knight, goblin);
    }
}