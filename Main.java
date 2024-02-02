
/*
 * This is a simple guessing program.
 * The program is meant to be a reference for beginners
 * Written by Vance Perry, the owner of the KillAllChickens
 */
import java.util.Random;
import java.util.Scanner;
import java.lang.NumberFormatException;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int Answer = random.nextInt(100) + 1;
        boolean outOfGuesses = false;
        int maxGuesses = 10;
        int guessNum = 1;
        int guess;
        Scanner guessObj = new Scanner(System.in);
        System.out.println("[*] You have 10 tries to guess a random number between 1 and 100, good luck");
        while (!outOfGuesses && guessNum <= maxGuesses) {
            System.out.print("[?] Guess[" + guessNum + "]: ");
            try {
                guess = Integer.parseInt(guessObj.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("[!] Invalid Guess.");
                continue;
            }
            if (guess == Answer) {
                System.out.println("[*] YOU WIN!!!!");
                guessObj.close();
                return;
            } else if (guess < Answer) {
                System.out.println("[*] Higher");
            } else if (guess > Answer) {
                System.out.println("[*] Lower");
            }
            guessNum += 1;
        }
        System.out.println("[!] You Lose, the answer was " + Answer + ".");
        guessObj.close();
    }
}
