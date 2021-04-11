import java.util.Scanner;

public class VokaleZaehlenInEinemBeliebigenSatz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben sie einen Satz ein:");
        String satz = scanner.nextLine();

        int vokale = 0;
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        for (int ii = 0; ii < satz.length(); ii++) {

            if (satz.charAt(ii) == 'a' || satz.charAt(ii) == 'A') {
                a++;
                vokale++;
            } else if (satz.charAt(ii) == 'e' || satz.charAt(ii) == 'E') {
                e++;
                vokale++;
            } else if (satz.charAt(ii) == 'i' || satz.charAt(ii) == 'I') {
                i++;
                vokale++;
            } else if (satz.charAt(ii) == 'o' || satz.charAt(ii) == 'O') {
                o++;
                vokale++;
            } else if (satz.charAt(ii) == 'u' || satz.charAt(ii) == 'U') {
                u++;
                vokale++;
            }

        }

        System.out.println("Anzahl der Vokale: " + vokale);
        System.out.println("A: " + a);
        System.out.println("E: " + e);
        System.out.println("I: " + i);
        System.out.println("O: " + o);
        System.out.println("U: " + u);

    }

}
