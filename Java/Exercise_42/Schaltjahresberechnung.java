import java.util.Scanner;

public class Schaltjahresberechnung {

    public static void main(String[] args) {

        System.out.println("Gebe ein Jahr ein:");
        System.out.println(isSchaltjahr(new Scanner(System.in).nextInt()));

    }

    public static boolean isSchaltjahr(int year) {

        if (year%4 == 0) {

            if (year%100 == 0 && year%400 != 0) {
                return false;
            }

            return true;

        }

        return false;

    }

}
