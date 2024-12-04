import java.util.Random;

public class SnakeAndLadderProblem {
    public static void main(String[] args) {
        System.out.println("This problem simulates a Snake and Ladder Game.");
        //UC1
        int playerPosition = 0; // Starting position
        System.out.println("Game Started: Player at position " + playerPosition);
        Random random = new Random();

        // UC2: Player rolls the die to get a number between 1 to 6
        int diceRoll = random.nextInt(6) + 1; // Random number between 1 and 6
        System.out.println("Rolled the die: " + diceRoll);
    }
}