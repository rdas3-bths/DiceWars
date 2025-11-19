import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Dice Wars");
        int goal = DiceWars.getGoal();
        System.out.println("Goal is: " + goal);

        System.out.println("Player 1 goes first!");
        int playerOneTries = DiceWars.doPlayerRound(goal);

        System.out.println("Player 1 round ends");

        System.out.println("Player 2 next!");
        int playerTwoTries = DiceWars.doPlayerRound(goal);

        if (playerOneTries > playerTwoTries) {
            System.out.println("Player two wins!");
        }
        else if (playerTwoTries > playerOneTries) {
            System.out.println("Player one wins!");
        }
        else {
            System.out.println("It's a tie!");
        }

        // two player game
        // when the round starts, two dice are rolled
        // if the number is higher than 8, the lower die rolled becomes the "goal"
        // otherwise, the total number is the goal

        // player 1 rolls until they get the "goal"
        // player 2 rolls until they get the "goal"

        // the player that gets the goal in the least number of tries wins
    }

}