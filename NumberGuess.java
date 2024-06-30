import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempt = 0;

        System.out.println("Guess the Number Game!");
        System.out.println("You have to guess a number between 1 and 100");

            int targetNumber = (int) (Math.random() * (100 + 1));
            while (true) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempt++;

                if (guess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempt + " attempts.");
                    break;
                } else if (guess < targetNumber) {
                    System.out.println("Your guess is lower than the target number.");
                } else {
                    System.out.println("Your guess is higher than the target number.");
                }
            }
        }
    }