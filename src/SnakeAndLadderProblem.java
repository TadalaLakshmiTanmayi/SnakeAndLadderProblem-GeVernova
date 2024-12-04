import java.util.Random;

public class SnakeAndLadderProblem {
    public static final int WINNING_POSITION = 100;
    public static final int NOPLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    public static void main(String[] args) {
        System.out.println("This problem simulates a Snake and Ladder Game.");
        int player1Position = 0, player2Position = 0;
        int player1Rolls = 0, player2Rolls = 0;
        Random random = new Random();

        // UC7: Play with 2 players
        while (player1Position < WINNING_POSITION && player2Position < WINNING_POSITION) {
            // Player 1's turn
            player1Rolls++;
            int diceRoll1 = random.nextInt(6) + 1;
            System.out.println("Player 1 rolls: " + diceRoll1);

            int option1 = random.nextInt(3);
            System.out.println("Option for Player 1: " + option1);

            switch (option1) {
                case NOPLAY:
                    System.out.println("Player 1: No Play. Stay at the same position.");
                    break;
                case LADDER:
                    player1Position += diceRoll1;
                    System.out.println("Player 1: Ladder! Move forward by " + diceRoll1 + " positions.");
                    break;
                case SNAKE:
                    player1Position -= diceRoll1;
                    System.out.println("Player 1: Snake! Move backward by " + diceRoll1 + " positions.");
                    break;
            }

            // Ensure Player 1 gets the exact position
            if (player1Position > WINNING_POSITION) {
                System.out.println("Player 1's position exceeds 100. Stay at the same position.");
                player1Position -= diceRoll1;
            }

            if (player1Position < 0) {
                System.out.println("Player 1's position is below 0. Restart from position 0.");
                player1Position = 0;
            }

            System.out.println("Player 1's position: " + player1Position);

            // If Player 1 reaches 100, they win
            if (player1Position == WINNING_POSITION) {
                System.out.println("Player 1 wins!");
                break;
            }

            // Player 2's turn
            player2Rolls++;
            int diceRoll2 = random.nextInt(6) + 1;
            System.out.println("Player 2 rolls: " + diceRoll2);

            int option2 = random.nextInt(3);
            System.out.println("Option for Player 2: " + option2);

            switch (option2) {
                case NOPLAY:
                    System.out.println("Player 2: No Play. Stay at the same position.");
                    break;
                case LADDER:
                    player2Position += diceRoll2;
                    System.out.println("Player 2: Ladder! Move forward by " + diceRoll2 + " positions.");
                    break;
                case SNAKE:
                    player2Position -= diceRoll2;
                    System.out.println("Player 2: Snake! Move backward by " + diceRoll2 + " positions.");
                    break;
            }

            // Ensure Player 2 gets the exact position
            if (player2Position > WINNING_POSITION) {
                System.out.println("Player 2's position exceeds 100. Stay at the same position.");
                player2Position -= diceRoll2;
            }

            if (player2Position < 0) {
                System.out.println("Player 2's position is below 0. Restart from position 0.");
                player2Position = 0;
            }

            System.out.println("Player 2's position: " + player2Position);

            // If Player 2 reaches 100, they win
            if (player2Position == WINNING_POSITION) {
                System.out.println("Player 2 wins!");
                break;
            }
        }
    }
}