import java.util.Scanner;

public class ProgrammierBasicsRabattaktion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben sie den Gesamtbetrag ein:");

        int betrag = scanner.nextInt();

        if (betrag > 10000) {
            betrag = betrag - (betrag / 100 * 10);
        }

        System.out.println("Discountpreis: " + betrag);

    }

}
