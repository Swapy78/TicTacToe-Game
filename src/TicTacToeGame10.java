//Java program for if neither of both are winning then player's first choice would be to take one of the available corners

package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TicTacToeGame10 {
    public void takeCornerMove(char[] board) {
        // Listing of available corner indices
        List<Integer> corners = new ArrayList<>();
        corners.add(1);
        corners.add(3);
        corners.add(7);
        corners.add(9);

        // Randomly selecting a corner index
        Random random = new Random();
        int index = random.nextInt(corners.size());

        // Checking if the selected corner is available
        int cornerIndex = corners.get(index);
        if (board[cornerIndex] == ' ') {
            // Making the move on the selected corner
            board[cornerIndex] = 'X'; // Assuming player's move is always 'X'
            System.out.println("Move successfully made on corner " + cornerIndex);
        } else {
            System.out.println("No available corner move.");
        }
    }

    public static void main(String[] args) {
        char[] board = {'X', ' ', 'O', ' ', 'O', ' ', ' ', ' ', ' '};

        TicTacToeGame10 game = new TicTacToeGame10();
        game.takeCornerMove(board);

        // Printing the updated board
        for (int i = 0; i < board.length; i++) {
            System.out.print(board[i] + " ");
            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
        }
    }
}
