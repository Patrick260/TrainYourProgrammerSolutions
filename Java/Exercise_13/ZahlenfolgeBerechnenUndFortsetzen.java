package de.patrick260.trainYourProgrammer.exercise_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ZahlenfolgeBerechnenUndFortsetzen {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Bitte gebe eine Zahlenfolge ein: ");

        String input = "";
        try {
            input = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (!isNumber(input)) {
            System.out.println("Invalid input!");
            System.out.print("Bitte gebe eine Zahlenfolge ein: ");
            try {
                input = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < 15; i++) {
            input = getNext(input);
            System.out.println((i + 1) + ". Folge: " + input);
        }

    }

    public static String getNext(String s) {

        String ss = "";
        char last = s.charAt(0);
        int count = 1;

        for (int i = 1; i < s.length(); i++) {

            if (last == s.charAt(i)) {
                count++;
            } else {
                ss = ss + count + last;
                count = 1;
                last = s.charAt(i);
            }

        }

        ss = ss + count + last;
        return ss;
    }

    public static boolean isNumber(String s) {

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '1' && s.charAt(i) != '2' && s.charAt(i) != '3' && s.charAt(i) != '4' && s.charAt(i) != '5' && s.charAt(i) != '6' && s.charAt(i) != '7' && s.charAt(i) != '8' && s.charAt(i) != '9' && s.charAt(i) != '0') {
                return false;
            }
        }
        return true;
    }

}
