import java.util.Scanner;

public class ProgrammierBasicsBestellungsüberprüfung {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Anzahl der Schrauben:");
        int schrauben = scanner.nextInt();

        System.out.println("Anzahl der Muttern:");
        int muttern = scanner.nextInt();

        System.out.println("Anzahl der Unterlegscheiben:");
        int unterlegscheiben = scanner.nextInt();

        if (schrauben > muttern) {
            System.out.println("Kontrollieren sie ihre Bestellung!");
        } else {
            System.out.println("Die Bestellung ist okay.");
        }

        System.out.println("Gesamtbetrag: " + ((muttern * 3) + (schrauben * 5) + unterlegscheiben));
    }

}
