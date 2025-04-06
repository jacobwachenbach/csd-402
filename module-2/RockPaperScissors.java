// Jacob Achenbach 3/30/2025
// A simple rock paper scissors game using 1,2,3

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    
    // Function to get the result of the game
    public static String getGameResult(int userChoice, int computerChoice) {
        if (userChoice == computerChoice) {
            return "It's a tie!";
        } else if ((userChoice == 1 && computerChoice == 3) || 
                   (userChoice == 2 && computerChoice == 1) || 
                   (userChoice == 3 && computerChoice == 2)) {
            return "You win!";
        } else {
            return "You lose!";
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Create a Random object for generating the computer's choice
        Random random = new Random();

        // Mapping choices to numbers: 1 - Rock, 2 - Paper, 3 - Scissors
        String[] choices = {"Rock", "Paper", "Scissors"};
        
        // Generate computer's choice (1, 2, or 3)
        int computerChoice = random.nextInt(3) + 1;

        // Get the user's choice
        System.out.print("Enter your choice (1 for Rock, 2 for Paper, 3 for Scissors): ");
        int userChoice = scanner.nextInt();

        // User input
        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid input! Please enter 1, 2, or 3.");
            return;
        }

        // Display choices
        System.out.println("\nComputer's choice: " + choices[computerChoice - 1]);
        System.out.println("Your choice: " + choices[userChoice - 1]);

        // Get and display the game result
        String result = getGameResult(userChoice, computerChoice);
        System.out.println("Result: " + result);

        // Close the scanner
        scanner.close();
    }
}
