import java.util.ArrayList;
import java.util.Scanner;

public class AusgabeDerFibonacciFolge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wie viele Werte sollen ausgegeben werde?");
        int anzahlWerte = scanner.nextInt();

        ArrayList<Integer> werte = new ArrayList<Integer>();
        werte.add(1);
        werte.add(1);

        while (werte.size() != anzahlWerte) {
            werte.add(werte.get(werte.size()-1)+werte.get(werte.size()-2));
        }

        System.out.println("Ausgabe der Fibonacci Folge mit " + anzahlWerte + " Werten:");

        for (int i = 0; i < werte.size(); i++) {
            System.out.println(werte.get(i));
        }

    }

}
