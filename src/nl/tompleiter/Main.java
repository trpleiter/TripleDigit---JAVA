package nl.tompleiter;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Variabele toevoegen
        int firstDigit;
        int secondDigit;
        int thirdDigit;

        int maximum = 9;

       Random randomizer = new Random();
       Scanner input = new Scanner(System.in);

       firstDigit = randomizer.nextInt(maximum) + 1;
       secondDigit = randomizer.nextInt (maximum) + 1;
       thirdDigit = randomizer.nextInt(maximum) + 1;

        System.out.println("Het eerste getal is: " + firstDigit);
        System.out.println("Het tweede getal is: " + secondDigit);
        System.out.println("Het derde getal is: " + thirdDigit);

        int sumOfDigits = firstDigit + secondDigit + thirdDigit;
        int productOfDigits = firstDigit * secondDigit * thirdDigit;

        System.out.println("De som van de getallen is: " + sumOfDigits);
        System.out.println("Het product van de getallen is: " + productOfDigits);

        int maxTimesToPlay = 5;

        for (int i = 0; i < maxTimesToPlay; i++) {
            System.out.println("Vul drie getallen achter elkaar in");
            int firstGuess = input.nextInt();
            int secondGuess = input.nextInt();
            int thirdGuess = input.nextInt();

            System.out.println("Je hebt de volgende getallen gekozen:");
            System.out.println("Getal 1: " + firstGuess);
            System.out.println("Getal 2: " + secondGuess);
            System.out.println("Getal 3: " + thirdGuess);

            boolean firstRightDigit = firstGuess == firstDigit || firstGuess == secondDigit || firstGuess == thirdDigit;
            boolean secondRightDigit = secondGuess == firstDigit || secondGuess == secondDigit || secondGuess == thirdDigit;
            boolean thirdRightDigit = thirdGuess == firstDigit || thirdGuess == secondDigit || thirdGuess == thirdDigit;

            boolean hasPlayerWon = firstRightDigit == true && secondRightDigit == true && thirdRightDigit == true;

            if (hasPlayerWon)
            {
                System.out.println("Klink! Je hebt de cijfercombinatie goed, de kluis is gekraakt!");
            }
            else {
                System.out.println("De cijfercombinatie is niet juist, de kluis zit nog dicht!");
            }
        }
    }
}
