package pl.coderslab.game2;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] userNumbers = new int[6];
        int userNumberIndex = 0;
        while (true) {
            System.out.println("Zgadnij 6 liczb: ");
            while (!scan.hasNextInt()) {
                scan.nextLine();
                System.out.println("To nie jest liczba, spróbuj ponownie: ");
            }

            int number = scan.nextInt();
            if (number > 49 || number < 1) {
                System.out.println("Podaj liczbę z zakresu 1-49");
                continue;
            }
            else if (ArrayUtils.contains(userNumbers,number)) {
                System.out.println("Wprowadzone liczby nie mogą się powtarzać! Spróbuj ponownie: ");
                continue;
            } else{
                userNumbers[userNumberIndex] = number;
                userNumberIndex++;
            }
            if (userNumberIndex == 6) {
                break;
            }
            //TODO :: Check if number not exist in userNumbers array - try with ArrayUtils.contains...
        }
        Arrays.sort(userNumbers);
        System.out.println(Arrays.toString(userNumbers));

        Random r = new Random();
        int maxRandom = 49;
        int[] randomNumbers = new int[6];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = r.nextInt(maxRandom)+1;
            if (ArrayUtils.contains(randomNumbers, randomNumbers[i])) {
                continue;
            }
        }
        Arrays.sort(randomNumbers);
        System.out.println(Arrays.toString(randomNumbers));

        int counter = 0;
        for (int i = 0; i < userNumbers.length; i++) {
            if (ArrayUtils.contains(randomNumbers,userNumbers[i])) {
                counter++;
            }
        }
        if (counter >= 3) {
            System.out.println("Gratulacje trafiłeś przynajmniej 3!! Odbierz nagrodę;)");
        }else {
            System.out.println("Próbuj dalej, niestety nic nie wygrałeś. Nie popadnij w nałóg!!");
        }
    }
}
