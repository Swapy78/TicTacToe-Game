//Java program for computer getting its turn and playing like a player, so first thing player do is checking if he can win and then play that move

package demo;

public class TicTacToeGame8 {
    public static void makeWinningMove(char[] board, char playerLetter) {
        // Winning combinations
        int[][] winningCombinations = {
            {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, // Rows
            {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, // Columns
            {0, 4, 8}, {2, 4, 6} // Diagonals
        };

        for (int[] combination : winningCombinations) {
            int a = combination[0];
            int b = combination[1];
            int c = combination[2];

            if (board[a] == ' ' && board[b] == playerLetter && board[c] == playerLetter) {
                board[a] = playerLetter; // Making the winning move
                return;
            } else if (board[b] == ' ' && board[a] == playerLetter && board[c] == playerLetter) {
                board[b] = playerLetter; // Making the winning move
                return;
            } else if (board[c] == ' ' && board[a] == playerLetter && board[b] == playerLetter) {
                board[c] = playerLetter; // Making the winning move
                return;
            }
        }
    }

    public static void main(String[] args) {
        char[] board = {' ', 'X', 'O', 'X', 'O', ' ', ' ', ' ', ' '};
        char playerLetter = 'X';

        makeWinningMove(board, playerLetter);

        // Printing the updated board
        for (int i = 0; i < board.length; i++) {
        	// Printing the value at current index
            System.out.print(board[i] + " "); 
            if ((i + 1) % 3 == 0) {
            	// Printing a newline after every 3 elements
                System.out.println(); 
            }
        }
    }
}
