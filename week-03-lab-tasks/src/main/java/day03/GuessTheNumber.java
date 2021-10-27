package day03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = 1 + random.nextInt(99);

        System.out.println("Gondoltam egy számra 1 és 100 között. ");
        System.out.println("Hatszor tippelhetsz.");
        System.out.println();

        int tips = 6;
        int numberOfGuesses = 0;
        boolean win = false;

        for(int i = 0; i < tips; i++) {
            System.out.println("Melyik számra gondolok?");
            int guess = scanner.nextInt();
            scanner.nextLine();
            numberOfGuesses++;
            if(guess == randomNumber) {
                win = true;
                System.out.println("Nyertél!");
                System.out.println("Kitaláltad " + numberOfGuesses + " tippből.");
                return;
            } else
            if(guess > randomNumber) {
                System.out.println("Kisebb számra gondoltam.");
                System.out.println("Már csak " + (tips - numberOfGuesses) + " lehetőséged van.");
                System.out.println();
            } else
            if(guess < randomNumber) {
                System.out.println("Nagyobb számra gondoltam.");
                System.out.println("Már csak " + (tips - numberOfGuesses) + " lehetőséged van.");
                System.out.println();
            }
        }

        if(!win) {
            System.out.println("Sajnos nem találtad el.");
            System.out.println("A szám " + randomNumber + " volt.");
        }
    }
}