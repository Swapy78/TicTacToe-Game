//Java program to do a toss to check who plays first

package demo;

import java.util.Random;

public class TicTacToeGame6 {
    public void doToss() {
    	// Creating a new instance of Random for coin toss
        Random random = new Random(); 
     // Generating a random boolean value representing heads or tails
        boolean heads = random.nextBoolean(); 
        if (heads) {
        	// If heads is true, printing that the player starts first
            System.out.println("Heads! Player starts first."); 
        } else {
        	// If heads is false, printing that the computer starts first
            System.out.println("Tails! Computer starts first."); 
        }
    }

    public static void main(String[] args) {
    	// Creating a new instance of TicTacToeGame6
        TicTacToeGame6 game = new TicTacToeGame6(); 
     // Performing the coin toss
        game.doToss(); 
    }
}
