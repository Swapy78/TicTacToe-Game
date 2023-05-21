//Java program to ask an user for another game

package demo;

import java.util.Scanner;

public class TicTacToeGame13 {
    public boolean playAnotherGame() {
        // Creating a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        // Telling the user to play another game
        System.out.print("Do you want to play another game? (yes/no): ");
        
        // Reading the user's input 
        String input = sc.nextLine().toLowerCase();
        
        // Checking if the user wants to play another game
        return input.equals("yes");
    }

    public static void main(String[] args) {
        TicTacToeGame13 game = new TicTacToeGame13();

        // Telling the user to play another game
        boolean playAgain = game.playAnotherGame();

        // Displaying the result
        if (playAgain) {
            System.out.println("Let's play another game!");
        } else {
            System.out.println("Thanks for playing. Goodbye!");
        }
    }
}
