import entities.Player;
import mechanics.DecisionMenu;

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


//        DecisionMenu.fight(knight, goblin);
        DecisionMenu.select(player);
    }
}