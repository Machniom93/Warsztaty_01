package pl.coderslab.game4;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String symulator = "2D10-10";
        String newText = "";

        if (Character.isDigit(symulator.charAt(0))) {
        for (int i = 0; i < symulator.length(); i++) {
            char currentChar = symulator.charAt(i);
            if (Character.isDigit(symulator.charAt(0)) && Character.isDigit(symulator.charAt(i))) {
                newText += currentChar;
            } else {
                break;
            }
        }
        }
        String newText2 = "";
        char d = 'D';
        int counter = 1;
        int indexOfD = symulator.indexOf(d) + 1;
        String symulator2 = symulator.substring(indexOfD);
        for (int i = 0; i < symulator2.length(); i++) {
            char currentChar = symulator2.charAt(i);
            if (Character.isDigit(symulator2.charAt(0)) && Character.isDigit(symulator2.charAt(i))) {
                newText2 += currentChar;
                counter++;
            } else {
                break;
            }
        }

        Random r = new Random();
        int maxRandom = Integer.parseInt(newText2);

        int lenghtOfTable = 1;

        if (Character.isDigit(symulator.charAt(0))) {
            lenghtOfTable = Integer.parseInt(newText);
        }
        int sum = 0;
        int[] randomNumbers = new int[lenghtOfTable];
        CharSequence minus = "-";
        CharSequence plus = "+";
        if (symulator.contains(minus) || symulator.contains(plus)) {
            String newText3 = "";
            String symulator3 = symulator2.substring(counter);
            for (int i = 0; i < symulator3.length(); i++) {
                char currentChar = symulator3.charAt(i);
                if (Character.isDigit(symulator3.charAt(0)) && Character.isDigit(symulator3.charAt(i))) {
                    newText3 += currentChar;
                } else {
                    break;
                }
            }

            char sign = symulator2.charAt(counter - 1);
            int newText3ToInt = Integer.parseInt(newText3);
            for (int i = 0; i < randomNumbers.length; i++) {
                if (sign == '-') {
                    randomNumbers[i] = (r.nextInt(maxRandom) + 1) - newText3ToInt;
                } else {
                    randomNumbers[i] = (r.nextInt(maxRandom) + 1) + newText3ToInt;
                }
                sum += randomNumbers[i];

            }
        } else {
            for (int i = 0; i < randomNumbers.length; i++) {
                randomNumbers[i] = (r.nextInt(maxRandom) + 1);
                sum += randomNumbers[i];
            }
        }
        Arrays.sort(randomNumbers);
        System.out.println(Arrays.toString(randomNumbers));
        System.out.println("Suma rzutów: " + sum);
    }
}
