import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Dice Wars");

        Scanner s = new Scanner(System.in);
        System.out.print("How many rounds would you like to play? ");
        int rounds = Integer.parseInt(s.nextLine());

        int currentRound = 1;
        int playerOneWins = 0;
        int playerTwoWins = 0;
        while (currentRound <= rounds) {
            System.out.println("Current Round: " + currentRound);
            System.out.println("Scoreboard:");
            System.out.println("+-----------------------------+");
            System.out.println("|   Player one: " + playerOneWins + "             |");
            System.out.println("|   Player two: " + playerTwoWins + "             |");
            System.out.println("+-----------------------------+");
            int goal = DiceWars.getGoal();
            System.out.println("Goal is: " + goal);



            System.out.println("Player 1 goes first!");
            int playerOneTries = DiceWars.doPlayerRound(goal);

            System.out.println("Player 1 round ends");

            System.out.println("Player 2 next!");
            int playerTwoTries = DiceWars.doPlayerRound(goal);

            if (playerOneTries > playerTwoTries) {
                System.out.println("Player two wins!");
                playerTwoWins++;
            }
            else if (playerTwoTries > playerOneTries) {
                System.out.println("Player one wins!");
                playerOneWins++;
            }
            else {
                System.out.println("It's a tie!");
            }
            currentRound++;
        }

        System.out.println("FINAL SCORE: " + currentRound);
        System.out.println("Scoreboard:");
        System.out.println("+-----------------------------+");
        System.out.println("|   Player one: " + playerOneWins + "             |");
        System.out.println("|   Player two: " + playerTwoWins + "             |");
        System.out.println("+-----------------------------+");


        // two player game
        // when the round starts, two dice are rolled
        // if the number is higher than 8, the lower die rolled becomes the "goal"
        // otherwise, the total number is the goal

        // player 1 rolls until they get the "goal"
        // player 2 rolls until they get the "goal"

        // the player that gets the goal in the least number of tries wins
    }

}