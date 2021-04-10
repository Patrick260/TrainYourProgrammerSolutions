import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;

public class ZinseszinsberechnungUndAusgabe {

    public static void main(String[] args) {

        double geld = 0;
        double zins = 0;
        int laufzeit = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Geldbetrag in Euro: ");

        try {
            String input = reader.readLine();

            while (!isDouble(input)) {
                System.out.println("Invalid Input!");
                System.out.print("Geldbetrag in Euro: ");
                input = reader.readLine();
            }

            geld = Double.parseDouble(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print("Jahreszins: ");

        try {
            String input = reader.readLine();

            while (!isDouble(input)) {
                System.out.println("Invalid Input!");
                System.out.print("Jahreszins: ");
                input = reader.readLine();
            }

            zins = Double.parseDouble(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print("Laufzeit in Jahren: ");

        try {
            String input = reader.readLine();

            while (!isInteger(input)) {
                System.out.println("Invalid Input!");
                System.out.print("Laufzeit in Jahren: ");
                input = reader.readLine();
            }

            laufzeit = Integer.parseInt(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < laufzeit; i++) {
            geld += geld * (zins / 100);
            NumberFormat n = NumberFormat.getInstance();
            n.setMaximumFractionDigits(2);
            System.out.println(String.format("Wert nach " + (i + 1) + " Jahren: " + n.format(geld)));
        }

    }

    private static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private static boolean isDouble(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
