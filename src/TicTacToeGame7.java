//Java program to determine after every move the winner or the tie or change the turn

package demo;

public class TicTacToeGame7 {
    public static char checkWinner(char[] board) {
        // Winning combinations
        int[][] winningCombinations = {
            {1, 2, 3}, {4, 5, 6}, {7, 8, 9}, // Rows
            {1, 4, 7}, {2, 5, 8}, {3, 6, 9}, // Columns
            {1, 5, 9}, {3, 5, 7} // Diagonals
        };

        for (int[] combination : winningCombinations) {
            int a = combination[0];
            int b = combination[1];
            int c = combination[2];

            if (board[a] != ' ' && board[a] == board[b] && board[b] == board[c]) {
                return board[a]; // Returning the winning letter
            }
        }

        return ' '; // No winner, returning space
    }

    public static boolean checkTie(char[] board) {
        for (int i = 1; i < board.length; i++) {
            if (board[i] == ' ') {
                return false; // Empty space found, game is not a tie
            }
        }

        return true; // No empty spaces, game is a tie
    }

    public static void main(String[] args) {
        char[] board = {' ', 'X', 'O', ' ', 'X', ' ', 'O', ' ', 'X', ' '};
        char winner = checkWinner(board);
        
        if (winner != ' ') {
        	// If there is a winner, printing the winner
            System.out.println("Player " + winner + " wins!"); 
        } else if (checkTie(board)) {
        	// If it's a tie, printing a tie message
            System.out.println("It's a tie!"); 
        } else {
        	// If no winner and no tie, printing a turn change
            System.out.println("Change turn."); 
        }
    }
}
