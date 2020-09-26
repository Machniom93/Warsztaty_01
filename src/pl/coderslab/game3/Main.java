package pl.coderslab.game3;

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
            System.out.println("Zgaduję: " + guess);
            System.out.println("Twoja odpowiedź? (za mało/za dużo/zgadłeś): ");
            String answer = scan.nextLine();
            String answerToLowerCase = answer.toLowerCase();
            if (answerToLowerCase.contains("zgadłeś")) {
                System.out.println("Wygrałem!");
                break;
            } else if (counter == 11) {
                System.out.println("Przepraszam nie zgadłem, nie dałem rady;(");
                break;
            } else if (answerToLowerCase.contains("za dużo")) {
                max = guess;
                counter++;
            } else if (answerToLowerCase.contains("za mało")) {
                min = guess;
                counter++;
            } else {
                System.out.println("nie oszukuj!");
            }
        }
    }
}
