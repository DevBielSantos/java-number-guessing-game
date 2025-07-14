import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = (int)(Math.random() * 100) + 1;
        int attempts = 0;
        int guesses;

        System.out.println(" Welcome to the Guessing Game!");
        System.out.println(" Try to guess the number between 1 and 100.");
        do {
            System.out.println("Enter your guess: ");
            guesses = scanner.nextInt();
            attempts++;

            if (guesses < secretNumber) {
                    System.out.println("The number is greater. ");
             } else if (guesses > secretNumber) {
                        System.out.println("The number is smaller. ");
                 } else {
                        System.out.println(" Congratulations! You got it right in " + attempts + " attempts");
                    }
                 } while (guesses != secretNumber); 
                 
                 scanner.close();
            }
                }