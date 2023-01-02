package mechanics;
import texts.Display;

import java.util.Scanner;

public class Validate {
    public static int getIntInput() {
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt(1 | 2 | 3)) {
            Display.invalidAction();
            Display.actions();
            scanner.next(); // clears scanner
        }
        return scanner.nextInt();
    }
}