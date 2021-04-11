import java.util.List;
import java.util.Scanner;

public class ZahlenInRoemischerSchreibweise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben sie eine Zahl ein: ");
        String input = scanner.nextLine();

        if (isArabicNumber(input)) {
            System.out.println("entspricht: " + arabicToRoman(Integer.parseInt(input)));
        } else {
            System.out.println("entspricht: " + romanToArabic(input));
        }
    }

    private static int romanToArabic(String input) {
        String romanNumeral = input.toUpperCase();
        int result = 0;

        List romanNumerals = RomanNumeral.getReverseSortedValues();

        int i = 0;

        while ((romanNumeral.length() > 0) && (i < romanNumerals.size())) {
            RomanNumeral symbol = (RomanNumeral) romanNumerals.get(i);
            if (romanNumeral.startsWith(symbol.name())) {
                result += symbol.getValue();
                romanNumeral = romanNumeral.substring(symbol.name().length());
            } else {
                i++;
            }
        }

        if (romanNumeral.length() > 0) {
            throw new IllegalArgumentException(input + " cannot be converted to a Roman Numeral");
        }

        return result;
    }

    private static String arabicToRoman(int number) {
        if ((number <= 0) || (number > 4000)) {
            throw new IllegalArgumentException(number + " is not in range (0,4000]");
        }

        List romanNumerals = RomanNumeral.getReverseSortedValues();

        int i = 0;
        StringBuilder sb = new StringBuilder();

        while ((number > 0) && (i < romanNumerals.size())) {
            RomanNumeral currentSymbol = (RomanNumeral) romanNumerals.get(i);
            if (currentSymbol.getValue() <= number) {
                sb.append(currentSymbol.name());
                number -= currentSymbol.getValue();
            } else {
                i++;
            }
        }

        return sb.toString();
    }

    private static boolean isArabicNumber(String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
