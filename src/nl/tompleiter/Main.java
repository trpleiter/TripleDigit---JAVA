package nl.tompleiter;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
// Variablen toevoegen;
        int firstDigit;
        int secondDigit;
        int thirdDigit;

// Bepalen TOT welke waarde maximaal kan worden gegaan;
        int maximum = 9;

// Aanroepen methodes;
        Random randomizer = new Random();
        Scanner input = new Scanner(System.in);
        Scanner inputContinuePlay = new Scanner(System.in);


// zorgen dat er onbeperkt kan worden gespeeld;
        while (true) {

// Opzetten willekeur tussen welke waarde maximaal kan worden gegaan;
            firstDigit = randomizer.nextInt(maximum) + 1;
            secondDigit = randomizer.nextInt(maximum) + 1;
            thirdDigit = randomizer.nextInt(maximum) + 1;

// Controle willekeurig gegenereerde nummers;
            System.out.println("Het eerste getal is: " + firstDigit);
            System.out.println("Het tweede getal is: " + secondDigit);
            System.out.println("Het derde getal is: " + thirdDigit);

// Som en product bepalen en vastzetten in variabelen;
            int sumOfDigits = firstDigit + secondDigit + thirdDigit;
            int productOfDigits = firstDigit * secondDigit * thirdDigit;
            System.out.println("Welkom bij TripleDigits, kraak de kluis door drie cijfers in te vullen met behulp van de onderstaande hints.");
            System.out.println("De som van de getallen is: " + sumOfDigits);
            System.out.println("Het product van de getallen is: " + productOfDigits);

            boolean hasPlayerWon = false;
            while (hasPlayerWon == false) {

// Ophalen gebruikers input van nummers;
                System.out.println("Vul drie getallen achter elkaar in");
                int firstGuess = input.nextInt();
                int secondGuess = input.nextInt();
                int thirdGuess = input.nextInt();

                System.out.println("Je hebt de volgende getallen gekozen:");
                System.out.println("Getal 1: " + firstGuess);
                System.out.println("Getal 2: " + secondGuess);
                System.out.println("Getal 3: " + thirdGuess);

// Conditie toevoegen om te winnen en dat de volgorde van de nummers niet uitmaakt;
                int sumOfGuessedDigits = firstGuess + secondGuess + thirdGuess;
                int productOfGuessedDigits = firstGuess * secondGuess * thirdGuess;

                hasPlayerWon = sumOfDigits == sumOfGuessedDigits && productOfDigits == productOfGuessedDigits;

// Resultaat winst of verlies;
                if (hasPlayerWon) {
                    System.out.println("Klink! Je hebt de cijfercombinatie goed, de kluis is gekraakt!");
                } else {
                    System.out.println("De cijfercombinatie is niet juist, de kluis zit nog dicht!");
                }
            }
// Doorgaan voor een volgende ronde;
                boolean continuePlaying = true;
                System.out.println("Wil je het spel nogmaals spelen? Toets [y/n]");

// Ophalen gebruikers input om door te gaan;
                String chooseContinuePlaying = inputContinuePlay.nextLine();

// Switch statement om te bepalen hoe de code zich gedraagd na de keuze van de gebruiker om door te spelen;
                switch (chooseContinuePlaying) {
                    case "y": {
                        System.out.println("Je hebt ervoor gekozen om nogmaal te spelen");
                        continuePlaying = true;
                        break;
                    }
                    case "n": {
                        System.out.println("Je hebt ervoor gekozen om te stoppen met spelen");
                        continuePlaying = false;
                        break;
                    }
                    default: {
                        System.out.println("Je hebt geen keuze gemaakt of je door wil spelen spelen");
                        break;
                    }
                }

                if (!continuePlaying == false) {
                    break;
                }

            }
            System.out.println("Het spel is afgelopen");
        }
    }
