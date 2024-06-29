
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        while (playAgain) {
            int numberGues = random.nextInt(100) + 1;
            int noOfattempts = 0;
            int maxAttempt = 3;
            boolean hasWon = false;
            System.out.println("**welcome user**");
            System.out.println("We Have selected a number between 1 to 100. can you guess??");
            System.out.println("you have " + maxAttempt +  " attempts.");

            while (noOfattempts < maxAttempt) {
                System.out.println(" enter your guess number : ");
                int userGuess = sc.nextInt(); // taking input from user
                noOfattempts++;

                if (userGuess == numberGues) {
                    hasWon = true;
                    break;
                } else if (userGuess < numberGues) {
                    System.out.println(" number is too low !");
                } else {
                    System.out.println(" number is too high !");
                }

                System.out.println(" Remaining Attempts  : " + (maxAttempt - noOfattempts));
            }
            if (hasWon) {
                System.out.println("congratulations! you guessed the number in " + noOfattempts + "attepmts.");
            } else {
                System.out.println(" sorry , you have used all your attempts .  the number was : " + numberGues);
            }

            System.out.println("Do you want to play again ? (yes/no) : ");
            playAgain = sc.next().equalsIgnoreCase("yes");
        }
        System.out.println(" ** Thank you for playing **  ");
        sc.close();
    }
}
