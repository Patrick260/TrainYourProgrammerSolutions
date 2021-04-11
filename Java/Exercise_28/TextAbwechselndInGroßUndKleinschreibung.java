import java.util.Scanner;

public class TextAbwechselndInGroßUndKleinschreibung {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Texteingabe: ");
        String text = scanner.nextLine().toLowerCase();

        char[] chars = new char[]{};
        chars = text.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            if ((i % 2) == 0) {
                chars[i] = Character.toUpperCase(chars[i]);
            } else {
                chars[i] = Character.toLowerCase(chars[i]);
            }

        }

        text = String.copyValueOf(chars);

        System.out.println("Textausgabe: " + text);

    }

}
