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
