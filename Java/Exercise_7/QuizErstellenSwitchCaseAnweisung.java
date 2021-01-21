package de.patrick260.trainYourProgrammer.exercise_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuizErstellenSwitchCaseAnweisung {

    public static void main(String[] args) {

        System.out.println("Quiz");
        System.out.println("Beantworten sie die 5 Fragen, um zu gewinnen!");
        System.out.println("Geben sie die Antwort als großen Buchstaben (Bsp.: D) ");

        int i = 0;
        while (i < 5) {
            if (!question(i)) {
                System.out.println("Falsch!");
                System.exit(0);
            }
            System.out.println("Richtig! \n");
            i++;
        }

        System.out.println("Herzlichen Glückwunsch, Sie haben Gewonnen!");

    }

    private static boolean question(int i) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        switch (i) {
            case 0:
                System.out.println("Wie heißt der 1. schwarze Präsident der USA?");
                System.out.println("A) Arnold Schwarzenegger    B) Condoleezza Rice C) Barack Obama     D) Malcolm X");
                try { if ("C".equals(reader.readLine())) return true; } catch (IOException e) { }
                return false;
            case 1:
                System.out.println("Was ist Java ebenfalls?");
                System.out.println("A) Eine Insel   B) Ein Fluss    C) Ein Königreich   D) Ein Betriebssystem");
                try { if ("A".equals(reader.readLine())) return true; } catch (IOException e) { }
                return false;
            case 2:
                System.out.println("Was ist die Quersumme von 123(ohne Zuhilfenahme von Programmen ;))?");
                System.out.println("A) 24   B) 6    C) 321  D) 15");
                try { if ("B".equals(reader.readLine())) return true; } catch (IOException e) { }
                return false;
            case 3:
                System.out.println("Welches Betriebssystem basiert grob auf Java?");
                System.out.println("A) Android  B) BIOS C) OS   D) Win7");
                try { if ("A".equals(reader.readLine())) return true; } catch (IOException e) { }
                return false;
            case 4:
                System.out.println("Was ist die Antwort auf den Sinn des Leben, das Universum und den ganzen Rest?");
                System.out.println("A) Fortschritt  B) 21   C) Carpe Diem   D) 42");
                try { if ("D".equals(reader.readLine())) return true; } catch (IOException e) { }
                return false;
        }

        return true;
    }

}
