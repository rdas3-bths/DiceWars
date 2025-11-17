public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Dice Wars");

        int goal = DiceWars.getGoal();

        System.out.println("Goal is: " + goal);

        boolean playerCheck = false;

        while (!playerCheck) {
            playerCheck = DiceWars.playerRoll(goal);
            if (playerCheck) {
                System.out.println("Player roll wins!");
            }
            else {
                System.out.println("Player roll loses!");
            }
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