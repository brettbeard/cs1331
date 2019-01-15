import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Guessing Game!");

        // Select a random number between 1 and 10
        Random rand = new Random();
        int number = rand.nextInt(10) + 1;

        // Print out the number
        System.out.printf("Number=%d\n", number);

        Scanner keyboard = new Scanner(System.in);

        // Loop until the user guesses the number or quits
        boolean done = false;
        while(!done) {

            // Get input from the user
            System.out.println("Guess a number between 1-10:");
            String userGuessText = keyboard.nextLine();

            // Did the user enter "quit"
            if(userGuessText.equalsIgnoreCase("quit"))
            {
                done = true;

                System.out.printf("Lame.  The number was %d.", number);
            }
            else {
                // TBD
            }
        }
    }
}
