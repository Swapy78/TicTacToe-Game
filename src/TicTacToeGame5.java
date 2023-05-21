//Java program to check for the free space before making the desired move

package demo;

public class TicTacToeGame5 {
    public boolean checkFreeSpace(char[] board, int index) {
    	// Checking if the board position at the given index is empty (' ')
        return board[index] == ' '; 
    }

    public static void main(String[] args) {
    	// Creating a new instance of TicTacToeGame5
        TicTacToeGame5 game = new TicTacToeGame5(); 
     // Creating the TicTacToe board
        char[] board = {' ', 'X', ' ', 'O', ' ', ' ', ' ', ' ', ' ', ' '}; 
     // Defining the index to check for free space
        int indexToCheck = 3; 
     // Checking if the board position at the index is free
        boolean isFree = game.checkFreeSpace(board, indexToCheck); 
     // Printing the result
        System.out.println("Is index " + indexToCheck + " free? " + isFree); 
    }
}
