package mechanics;

/*
Todo
- selection must scan for player selection
- input must be validated, decimal 1-3 only
*/

import texts.Display;

public class Decide {
    public static void selectMenu() {
        //  Actions and therefore cases are: 1 - attack, 2 - potion, 3 - run
        Display.actions();
        switch (Validate.getIntInput()) {
            case 1:
                Battle.fight();
                break;

            case 2:
                Item.potion();
                break;

            case 3:
                Initiative.whoseCharge();
                break;

            default:
                System.out.println("Ehhhhhhhhhhh!");

        }

    }
}
