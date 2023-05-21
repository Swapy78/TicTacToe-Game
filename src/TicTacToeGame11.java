//Java program for ability if the corners are not available then take centre or if any of the available sides

package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TicTacToeGame11 {
    public void makeSubsequentMove(char[] board) {
        // Listing of available indices for subsequent moves
        List<Integer> subsequentMoves = new ArrayList<>();
        subsequentMoves.add(4); // Center

        // Adding available side indices
        for (int i = 0; i < 9; i += 2) {
            if (board[i] == ' ') {
                subsequentMoves.add(i);
            }
        }

        // Randomly selecting an index for subsequent move
        Random random = new Random();
        int index = random.nextInt(subsequentMoves.size());

        // Checking if the selected index is available
        int moveIndex = subsequentMoves.get(index);
        if (board[moveIndex] == ' ') {
            // Making the subsequent move at the selected index
            board[moveIndex] = 'X'; // Assuming player's move is always 'X'
            System.out.println("Move successfully made at index " + moveIndex);
        } else {
            System.out.println("No available subsequent move.");
        }
    }

    public static void main(String[] args) {
        char[] board = {' ', 'O', ' ', 'X', 'O', ' ', 'X', ' ', ' '};

        TicTacToeGame11 game = new TicTacToeGame11();
        game.makeSubsequentMove(board);

        // Printing the updated board
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2] + " ");
        System.out.println("-----------");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5] + " ");
        System.out.println("-----------");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8] + " ");
    }
}
