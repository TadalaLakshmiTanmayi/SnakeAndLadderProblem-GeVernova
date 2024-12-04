import java.util.Random;

public class SnakeAndLadderProblem {
    public static final int WINNING_POSITION = 100;
    public static final int NOPLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    public static void main(String[] args) {
        System.out.println("This problem simulates a Snake and Ladder Game.");
        //UC1
        int playerPosition = 0; // Starting position
        System.out.println("Game Started: Player at position " + playerPosition);
        Random random = new Random();
        // UC5: Repeat until player reaches position 100
        while (playerPosition < WINNING_POSITION) {
            int diceRoll = random.nextInt(6) + 1; // Random number between 1 and 6
            System.out.println("Rolled the die: " + diceRoll);

            int option = random.nextInt(3); // Random value between 0, 1, 2 (No Play, Ladder, Snake)
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

            // Ensure the player gets the exact winning position
            if (playerPosition > WINNING_POSITION) {
                System.out.println("Position exceeds 100. Stay at the same position.");
                playerPosition -= diceRoll; // Revert the movement
            }

            // If the player moves below 0, reset to position 0
            if (playerPosition < 0) {
                System.out.println("Position below 0. Restart from position 0.");
                playerPosition = 0;
            }

            System.out.println("Player's current position: " + playerPosition);
        }
        System.out.println("Player has won! Reached position " + WINNING_POSITION);
    }
}