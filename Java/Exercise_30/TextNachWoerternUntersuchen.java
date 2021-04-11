import java.util.Scanner;

public class TextNachWoerternUntersuchen {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Eingabe Text: ");
        String text = scanner.nextLine();

        System.out.print("Welches Wort soll gesucht werden: ");
        String wort = scanner.nextLine();

        System.out.println("");

        String[] textlist = text.split(" ");

        int count = 0;

        for (int i = 0; i < textlist.length; i++) {

            if (textlist[i].equalsIgnoreCase(wort)) {
                count++;
            }

        }

        System.out.println("Das Wort \"" + wort + "\" wurde " + count + " mal gefunden.");

    }

}
