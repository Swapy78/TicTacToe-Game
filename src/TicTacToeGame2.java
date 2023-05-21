//Java program to allow the player to choose letter X or O

package demo;

import java.util.Scanner;

public class TicTacToeGame2 {
    private char playerLetter; // Letter assigned to the player
    private char computerLetter; // Letter assigned to the computer

    public void chooseLetter() {
    	// Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in); 
     // Telling the user to choose a letter
        System.out.print("Choose X or O: "); 
     // Reading the user's input and converting it to uppercase
        String input = sc.nextLine().toUpperCase(); 
        if (input.equals("X")) { // If the user chooses X
            playerLetter = 'X'; // Assigning X to the player
            computerLetter = 'O'; // Assigning O to the computer
        } else if (input.equals("O")) { // If the user chooses O
            playerLetter = 'O'; // Assigning O to the player
            computerLetter = 'X'; // Assigning X to the computer
        } else { // If the user enters an invalid input
            System.out.println("Invalid input. Defaulting to X."); // Displaying an error message
            playerLetter = 'X'; // Assigning X to the player (default)
            computerLetter = 'O'; // Assigning O to the computer (default)
        }
     // Displaying the player's chosen letter
        System.out.println("Player's letter: " + playerLetter); 
     // Displaying the computer's assigned letter
        System.out.println("Computer's letter: " + computerLetter); 
    }

    public static void main(String[] args) {
    	// Creating a new instance of TicTacToeGame2
        TicTacToeGame2 game = new TicTacToeGame2(); 
     // Allowing the player to choose a letter
        game.chooseLetter(); 
    }
}
