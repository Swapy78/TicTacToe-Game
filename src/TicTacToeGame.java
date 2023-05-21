//Java program to create a TicTacToe board

package demo;

public class TicTacToeGame {
    private char[] board; // Array to store the board state
    public String playerLetter; // Letter assigned to the player
    public String computerLetter; // Letter assigned to the computer

    public TicTacToeGame() {
    	// Creating a new array to represent the board
        board = new char[10]; 
        for (int i = 1; i < board.length; i++) {
        	// Initializing each element of the board array to empty space
            board[i] = ' '; 
        }
    }

    public void displayBoard() {
        // Displaying the current state of the board
        System.out.println(" " + board[1] + " | " + board[2] + " | " + board[3] + " ");
        System.out.println("-----------");
        System.out.println(" " + board[4] + " | " + board[5] + " | " + board[6] + " ");
        System.out.println("-----------");
        System.out.println(" " + board[7] + " | " + board[8] + " | " + board[9] + " ");
    }

    public static void main(String[] args) {
    	// Creating a new instance of TicTacToeGame
        TicTacToeGame game = new TicTacToeGame(); 
     // Displaying the initial state of the board
        game.displayBoard(); 
    }
}
