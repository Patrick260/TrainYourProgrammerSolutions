import java.util.Random;
import java.util.Scanner;

public class ZahlenErratenLassen {

    private static int versuche;
    private static int versuch;

    private static int obergrenze;
    private static int untergrenze;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte Untergrenze angeben: ");
        untergrenze = scanner.nextInt();

        System.out.print("Bitte Obergrenze angeben: ");
        obergrenze = scanner.nextInt();

        System.out.println(" ");

        System.out.println("Bitte geben sie nach jedem Versuch R, G oder K an. Je nachdem ob R die Zahl richtig ist, G die gesuchte Zahl größer ist, K die gesuchte Zahl kleiner ist.");
        System.out.println(" ");
        System.out.println(" ");

        versuche = 0;

        while (!programmVersuch()) {}

        System.out.println("Die gesuchte Zahl war also die " + versuch + "!");

    }

    private static boolean programmVersuch() {

        Random random = new Random();

        versuch = random.nextInt(obergrenze-untergrenze) + untergrenze;

        Scanner scanner = new Scanner(System.in);

        System.out.println(versuche + ". Versuch: " + versuch);

        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("r")) {
            return true;
        }

        if (input.equalsIgnoreCase("k")) {
            obergrenze = versuch-1;
        } else if (input.equalsIgnoreCase("g")) {
            untergrenze = versuch+1;
        }

        return false;
    }

}
