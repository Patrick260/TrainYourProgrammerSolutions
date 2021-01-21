package de.patrick260.trainYourProgrammer.exercise_6;

import java.util.Random;

public class WuerfelspielMitRandom {

    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(6);
        int b = r.nextInt(6);
        while (a < 1 || b < 1) {
            a = r.nextInt(6);
            b = r.nextInt(6);
        }
        int rounds = 1;
        System.out.println("Du hast eine " + a + " gewürfelt!");
        System.out.println("Dein Gegner hat eine " + b + " gewürfelt!");

        while (a <= b) {

            if (a != b) {
                System.out.println("Dein Gegner hat gewonnen!");
            } else {
                System.out.println("Unentschieden!");
            }

            rounds++;
            a = r.nextInt(6);
            b = r.nextInt(6);
            while (a < 1 || b < 1) {
                a = r.nextInt(6);
                b = r.nextInt(6);
            }
            System.out.println("Du hast eine " + a + " gewürfelt!");
            System.out.println("Dein Gegner hat eine " + b + " gewürfelt!");
        }
        System.out.println("Du hast nach " + rounds + " Runden gewonnen!");
    }

}
