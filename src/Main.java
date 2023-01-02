import entities.Player;
import entities.Monster;
import mechanics.Battle;
import mechanics.Decide;

public class Main {
    public static void main(String[] args) {

        /* Todo
        * - reduce main file to one line of code
        * - implement scanning for player name upon character creation
        *
        *
        * */

        // The values are health, attack, name
        Player player = new Player(10, 20, "Sir Knight");


//        Decide.fight(knight, goblin);
        Decide.selectMenu(player);
    }
}