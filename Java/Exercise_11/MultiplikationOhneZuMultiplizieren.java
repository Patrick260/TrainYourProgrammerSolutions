import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplikationOhneZuMultiplizieren {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Bitte gebe eine Zahl ein: ");

        String input = "";
        try {
            input = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (!isInt(input)) {
            System.out.println("Invalid input!");
            System.out.print("Bitte gebe eine Zahl ein: ");
            try {
                input = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        int a = Integer.parseInt(input);

        System.out.print("Bitte gebe eine Zahl ein: ");

        input = "";
        try {
            input = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (!isInt(input)) {
            System.out.println("Invalid input!");
            System.out.print("Bitte gebe eine Zahl ein: ");
            try {
                input = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        int b = Integer.parseInt(input);

        int ergebnis = 0;
        for (int i = 0; i < b; i++) {
            ergebnis = ergebnis + a;
        }

        System.out.println(a + " * " + b + " = " + ergebnis);

    }

    public static boolean isInt(String s) {

        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException numberFormatException) {
            return false;
        }

    }

}
