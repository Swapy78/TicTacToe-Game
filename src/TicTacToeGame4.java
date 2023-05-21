//Java program to make a move to a desired location in the board

package demo;

import java.util.Scanner;

public class TicTacToeGame4 {
    public void makeMove(char[] board) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index (1-9) to make your move: ");
     // Reading the index input from the player
        int index = sc.nextInt(); 

// Validating the index and check if the corresponding board position is empty
        if (index >= 1 && index <= 9 && board[index] == ' ') {
        	// Assuming player's move is always 'X'
            board[index] = 'X'; 
            System.out.println("Move successfully made at index " + index);
        } else {
        	// Informing the player of an invalid move
            System.out.println("Invalid move!"); 
        }
    }

    public static void main(String[] args) {
    	// Creating a new instance of TicTacToeGame4
        TicTacToeGame4 game = new TicTacToeGame4(); 
     // Creating the initial TicTacToe board
        char[] board = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}; 
     // Telling the player to make a move
        game.makeMove(board); 
    }
}
