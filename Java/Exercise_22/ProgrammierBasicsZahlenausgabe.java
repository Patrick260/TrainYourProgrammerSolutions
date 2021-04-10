import java.util.Scanner;

public class ProgrammierBasicsZahlenausgabe {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("#Startwert:");
        int start = scanner.nextInt();

        System.out.println("#Endwert:");
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            System.out.println("#" + i);
        }

    }

}
