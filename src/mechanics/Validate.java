package mechanics;
import texts.Display;

import java.util.Scanner;

public class Validate {
    public static int getAction() {
        Scanner scanner = new Scanner(System.in);
        Display.selection(); // 1 - attack, 2 - potion, 3 - run

        while (!scanner.hasNextInt(1 | 2 | 3)) {
            Display.invalidAction();
            Display.selection();
            scanner.next(); // clears scanner
        }
        return scanner.nextInt();
    }
}
