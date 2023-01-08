import entities.Player;
import mechanics.DecisionMenu;

public class Main {
    public static void main(String[] args) {

        /* Todo
         * - reduce main file to one line of code
         *
         *
         *
         * */
        /* A fight is quite a special matter.
        At first, you walk a long a road, suddenly you spot a Mob and have to decide whether you want to fight it or
        to turn tail and run. To run, it takes a higher initiative than that of the encountered mob, ergo a
        initiative comparison must be made. One loses it there will be a fit. The Mob will be initiative.
        If one wants to fight, there is also a comparison of the initiative needed to determine, whether attacks first.
        One choses Potion, an initiative comparison is also required, since per round only one action can be performed,
        either fight, run or potion.
 */


//        DecisionMenu.fight(knight, goblin);
        DecisionMenu.select(player);
    }
}