package pl.coderslab.game4;

public class Main {

    public static void main(String[] args) {
        String symulator = "555Dy+z";
        String newText = "";
        for (int i = 0; i < symulator.length(); i++) {
            char currentChar = symulator.charAt(i);
            while (Character.isDigit(symulator.charAt(0)) && Character.isDigit(symulator.charAt(i))) {
                    newText += currentChar;
                    i++;
            }

        }
        System.out.println(newText);

    }
}
