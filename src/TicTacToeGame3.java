//Java program to display the current board for making move

package demo;

public class TicTacToeGame3 {
    public void showBoard(char[] board) {
        // Displaying the TicTacToe board
        System.out.println(" " + board[1] + " | " + board[2] + " | " + board[3] + " ");
        System.out.println("-----------");
        System.out.println(" " + board[4] + " | " + board[5] + " | " + board[6] + " ");
        System.out.println("-----------");
        System.out.println(" " + board[7] + " | " + board[8] + " | " + board[9] + " ");
    }

    public static void main(String[] args) {
    	// Creating a new instance of TicTacToeGame3
        TicTacToeGame3 game = new TicTacToeGame3(); 
     // Creating the TicTacToe board array
        char[] board = {' ', 'X', 'O', ' ', 'X', ' ', 'O', ' ', ' ', ' '}; 
     // Displaying the current state of the board
        game.showBoard(board); 
    }
}
