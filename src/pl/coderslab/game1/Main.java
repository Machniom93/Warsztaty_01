package pl.coderslab.game1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random r = new Random();
        int maxRandom = 100;
        int randomNumber = r.nextInt(maxRandom);

        System.out.println(randomNumber);

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Zgadnij liczbę: ");
            while (!scan.hasNextInt()) {
                scan.nextLine();
                System.out.println("To nie jest liczba, spróbuj ponownie: ");
            }
            int number = scan.nextInt();
            if (number > 100 || number < 1) {
                System.out.println("Wartość musi być między 1-100.");
                continue;
            }

            if (number < randomNumber) {
                scan.nextLine();
                System.out.println("Za mało!");
            }
            else if (number > randomNumber) {
                scan.nextLine();
                System.out.println("Za dużo!");
            }
            else {
                System.out.println("Zagadłeś!");
                break;
            }
        }
    }
}
