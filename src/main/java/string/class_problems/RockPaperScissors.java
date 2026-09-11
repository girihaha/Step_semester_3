package string.class_problems;

import java.util.Random;

public class RockPaperScissors {

    public static String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) {
            return "Draw";
        }

        if (playerMove.equalsIgnoreCase("Rock")) {
            if (computerMove.equalsIgnoreCase("Scissors")) {
                return "Player Wins";
            } else {
                return "Computer Wins";
            }
        } else if (playerMove.equalsIgnoreCase("Paper")) {
            if (computerMove.equalsIgnoreCase("Rock")) {
                return "Player Wins";
            } else {
                return "Computer Wins";
            }
        } else if (playerMove.equalsIgnoreCase("Scissors")) {
            if (computerMove.equalsIgnoreCase("Paper")) {
                return "Player Wins";
            } else {
                return "Computer Wins";
            }
        }
        return "Invalid Move";
    }

    public static void main(String[] args) {
        String[] moves = {"Rock", "Paper", "Scissors"};
        String[] playerChoices = {"Rock", "Paper", "Scissors", "Rock", "Paper"};
        Random random = new Random();

        int wins = 0;
        int losses = 0;
        int draws = 0;
        int rounds = playerChoices.length;

        System.out.printf("%-10s %-15s %-15s %-15s%n", "Round", "Player Move", "Computer Move", "Result");
        System.out.println("---------------------------------------------------------");

        for (int i = 0; i < rounds; i++) {
            String player = playerChoices[i];
            String computer = moves[random.nextInt(3)];
            String result = playRound(player, computer);

            if (result.equals("Player Wins")) {
                wins++;
            } else if (result.equals("Computer Wins")) {
                losses++;
            } else if (result.equals("Draw")) {
                draws++;
            }

            System.out.printf("%-10d %-15s %-15s %-15s%n", (i + 1), player, computer, result);
        }

        double winPercentage = ((double) wins / rounds) * 100;
        System.out.println("---------------------------------------------------------");
        System.out.printf("Wins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%%n", wins, losses, draws, winPercentage);
    }
}
