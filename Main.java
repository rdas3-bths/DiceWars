import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Dice Wars");
        int goal = DiceWars.getGoal();
        System.out.println("Goal is: " + goal);
        boolean playerCheck = false;

        Scanner s = new Scanner(System.in);

        int tries = 0;
        while (!playerCheck) {
            tries++;
            System.out.println("---------------------");
            System.out.print("Press Enter to roll!");
            s.nextLine();
            playerCheck = DiceWars.playerRoll(goal);
            if (playerCheck) {
                System.out.println("Got it!");
            }
            else {
                System.out.println("Did not get the goal number! ("+goal+")");
            }
        }

        if (tries == 1) {
            System.out.println("It took you " + tries + " try to win!");
        }
        else {
            System.out.println("It took you " + tries + " tries to win!");
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