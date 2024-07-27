import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        String inpStr = "yes";
        int score = 50;     //inintial score
        Scanner scanner = new Scanner(System.in);

        int round = 1;

        while (inpStr.equalsIgnoreCase("yes")) {
            System.out.println("-------------------Round " + round + "-------------------");
            Random rand = new Random();
            int randInt = rand.nextInt(100);

            int guess = -1;
            int roundScore = 0;

            while (guess != randInt) {
        
                System.out.print("Guess the number between 0 to 100: ");
                guess = scanner.nextInt();

                if (guess > randInt) {
                    System.out.println("Your Guess is too high.");
                    roundScore += -5;
                }
                else if (guess < randInt) {
                    System.out.println("Your Guess is too low.");
                    roundScore += -5;
                }
                else {
                    System.out.println("Horray!, you guess correct.\n");
                    roundScore += 10;
                }
            }
            System.out.println("Score in this round: " + roundScore);
            score += roundScore;
            System.out.println("Do You want to play again: ");
            inpStr = scanner.next();
            round++;
        }

        System.out.println("--------------------Game End------------------");
        System.out.println("Final score after " + (round - 1) + " round: " + score);
        scanner.close();
    }
}