import java.util.Scanner;

public class DiceWars {

    public static int getGoal() {
        int rollOne = (int)(Math.random()*6)+1;
        int rollTwo = (int)(Math.random()*6)+1;

        System.out.println("Dice rolled: " + rollOne + " " + rollTwo);

        if (rollOne + rollTwo > 8) {
            return Math.min(rollOne, rollTwo);
        }
        else {
            return rollOne + rollTwo;
        }
    }

    public static int doPlayerRound(int goal) {
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

        return tries;

    }

    public static boolean playerRoll(int goal) {
        int rollOne = (int)(Math.random()*6)+1;
        int rollTwo = (int)(Math.random()*6)+1;

        System.out.println("Player Dice rolled: " + rollOne + " " + rollTwo);

        if (rollOne + rollTwo == goal) {
            return true;
        }

        if (rollOne == goal || rollTwo == goal) {
            return true;
        }

        return false;
    }
}
