//Java program to play until the game is over

package demo;

public class TicTacToeGame12 {
    public boolean isGameOver(char[] board) {
        // Checking if the board is full
        boolean isBoardFull = checkBoardFull(board);

        // Checking if someone has won the game
        boolean hasWinner = checkWinner(board);

        // The game is over if the board is full or there is a winner
        return isBoardFull || hasWinner;
    }

    private boolean checkBoardFull(char[] board) {
        for (int i = 0; i < board.length; i++) {
            if (board[i] == ' ') {
                // There is an empty space, so the board is not full
                return false;
            }
        }
        // All spaces are filled, so the board is full
        return true;
    }

    private boolean checkWinner(char[] board) {
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

            if (board[a - 1] == board[b - 1] && board[b - 1] == board[c - 1] && board[a - 1] != ' ') {
            // Three cells with the same non-empty value then we have a winner
                return true;
            }
        }

        // No winner found
        return false;
    }

    public static void main(String[] args) {
        char[] board = {'X', 'O', 'X', 'O', 'X', 'O', 'X', 'O', 'X'};

        TicTacToeGame12 game = new TicTacToeGame12();
        boolean isGameOver = game.isGameOver(board);

        if (isGameOver) {
            System.out.println("The game is over.");
        } else {
            System.out.println("The game is not over yet.");
        }
    }
}
