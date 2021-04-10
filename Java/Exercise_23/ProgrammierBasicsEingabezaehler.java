import java.util.Scanner;

public class ProgrammierBasicsEingabezaehler {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben sie ein Wort ein:");

        String wort = scanner.nextLine();

        System.out.println(" ");

        for (int i = 0; i < wort.length(); i++) {
            System.out.println(wort);
        }

    }

}
