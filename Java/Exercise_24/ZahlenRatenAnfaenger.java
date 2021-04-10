import java.util.Random;
import java.util.Scanner;

public class ZahlenRatenAnfaenger {

    private static int zahl;
    private static int versuch;

    public static void main(String[] args) {

        Random random = new Random();

        zahl = random.nextInt(100)+1;
        versuch = 1;

        System.out.println("Bitte erraten sie die gesuchte Zahl, sie befindet sich zwischen 1 und 100.");

        while (!startVersuch()) {
            startVersuch();
        }

        System.out.println("Glückwunsch die von Ihnen eingegebene Zahl (" + zahl + ") stimmt mit der gesuchten Zahl überein.");

    }

    private static boolean startVersuch() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ihr " + versuch + ". Versuch: ");

        int versuchZahl = scanner.nextInt();

        if (versuchZahl == zahl) {
            return true;
        } else if (versuchZahl > zahl) {
            System.out.println("Die gesuchte Zahl ist kleiner!");
        } else if (versuchZahl < zahl) {
            System.out.println("Die gesuchte Zahl ist größer!");
        }

        versuch++;

        return false;
    }

}
