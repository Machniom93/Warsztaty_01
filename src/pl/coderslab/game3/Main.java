package pl.coderslab.game3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Pomyśl liczbę od 0 do 1000, a ja ją zgadnę w max. 10 próbach");

        while (true) {
            int min = 0;
            int max = 1000;
            int counter = 0;
            int guess = ((max-min)/2) + min;
            System.out.println("Zgaduję: " + guess);
            System.out.println("Twoja odpowiedź? (za mało/za dużo/zgadłeś): ");
            String answer = scan.nextLine();
            if (answer == "zgadłeś") {
                System.out.println("Wygrałem!");
                break;
            } else if (answer == "za dużo") {

            }

        }
    }
}
