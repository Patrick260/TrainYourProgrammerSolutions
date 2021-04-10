import java.util.Scanner;

public class ProgrammierBasicsCentrechner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben sie die Cent ein:");

        int cent = scanner.nextInt();

        System.out.println("Das ergibt " + cent / 100 + " Dollar und " + cent % 100 + " Cent.");
    }

}
