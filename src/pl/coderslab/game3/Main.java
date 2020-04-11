package pl.coderslab.game3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Pomyśl liczbę od 0 do 1000, a ja ją zgadnę w max. 10 próbach");

        int min = 0;
        int max = 1000;
        int counter = 1;
        while (true) {
            int guess = ((max-min)/2) + min;
            String one = "zgadłeś";
            System.out.println("Zgaduję: " + guess);
            System.out.println("Twoja odpowiedź? (za mało/za dużo/zgadłeś): ");
            String answer = scan.nextLine();
            String answer1 = answer.toLowerCase();
            if (answer1.contains("zgadłeś")) {
                System.out.println("Wygrałem!");
                break;
            } else if (counter == 10) {
                System.out.println("Przepraszam nie zgadłem, nie dałem rady;(");
                break;
            } else if (answer1.contains("za dużo")) {
                max = guess;
                counter++;
                continue;
            } else if (answer1.contains("za mało")) {
                min = guess;
                counter++;
                continue;
            } else {
                System.out.println("nie oszukuj!");
                continue;
            }
        }
    }
}
