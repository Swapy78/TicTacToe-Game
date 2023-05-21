//Java program to check if Opponent can win then play to block it

package demo;

public class TicTacToeGame9 {
    public void blockOpponentWinningMove(char[] board, char playerLetter, char opponentLetter) {
        // Winning combinations
        int[][] winningCombinations = {
            {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, // Rows
            {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, // Columns
            {0, 4, 8}, {2, 4, 6} // Diagonals
        };

        // Iterating over each winning combination
        for (int[] combination : winningCombinations) {
            int a = combination[0];
            int b = combination[1];
            int c = combination[2];

// Checking if the opponent has two adjacent positions in a winning combination
            if (board[a] == ' ' && board[b] == opponentLetter && board[c] == opponentLetter) {
// Blocking opponent's winning move by placing player's letter in the empty position
                board[a] = playerLetter; 
                return;
            } else if (board[b] == ' ' && board[a] == opponentLetter && board[c] == opponentLetter) {
// Blocking opponent's winning move by placing player's letter in the empty position
                board[b] = playerLetter; 
                return;
            } else if (board[c] == ' ' && board[a] == opponentLetter && board[b] == opponentLetter) {
// Blocking opponent's winning move by placing player's letter in the empty position
                board[c] = playerLetter; 
                return;
            }
        }
    }

    public static void main(String[] args) {
        char[] board = {'X', ' ', ' ', 'O', 'O', ' ', 'X', ' ', ' '};
        char playerLetter = 'X';
        char opponentLetter = 'O';

        TicTacToeGame9 game = new TicTacToeGame9();
        game.blockOpponentWinningMove(board, playerLetter, opponentLetter);

        // Printing the updated board
        for (int i = 0; i < board.length; i++) {
            System.out.print(board[i] + " ");
            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
        }
    }
}
