package pl.coderslab.game1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random r = new Random();
        int maxRandom = 100;
        int randomNumber = r.nextInt(maxRandom);

//        System.out.println(randomNumber);

        Scanner scan = new Scanner(System.in);
        System.out.println("Zgadnij liczbę: ");
        while (!scan.hasNextInt()) {
            scan.nextLine();
            System.out.println("To nie jest liczba, spróbuj ponownie: ");
        }
        int number = scan.nextInt();
//        System.out.println(number);
    }
}
