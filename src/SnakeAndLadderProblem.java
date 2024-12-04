import java.util.Random;

public class SnakeAndLadderProblem {
    public static final int NOPLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    public static void main(String[] args) {
        System.out.println("This problem simulates a Snake and Ladder Game.");
        //UC1
        int playerPosition = 0; // Starting position
        System.out.println("Game Started: Player at position " + playerPosition);
        Random random = new Random();

        // UC2: Player rolls the die to get a number between 1 to 6
        int diceRoll = random.nextInt(6) + 1; // Random number between 1 and 6
        System.out.println("Rolled the die: " + diceRoll);


        // UC3: Check for option - No Play, Ladder, or Snake
        int option = random.nextInt(3); // Random value between 0, 1, 2
        System.out.println("Option: " + option);

        switch (option) {
            case NOPLAY:
                System.out.println("No Play. Stay at the same position.");
                break;
            case LADDER:
                playerPosition += diceRoll;
                System.out.println("Ladder! Move forward by " + diceRoll + " positions.");
                break;
            case SNAKE:
                playerPosition -= diceRoll;
                System.out.println("Snake! Move backward by " + diceRoll + " positions.");
                break;
        }
        System.out.println("Player's current position: " + playerPosition);
    }
}