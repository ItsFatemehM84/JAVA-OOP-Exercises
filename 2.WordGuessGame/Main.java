import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<Player> players = new ArrayList<>();

        System.out.print("Enter number of players: ");
        int numPlayers = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 1; i <= numPlayers; i++) {
            System.out.print("Enter Player " + i + " name: ");
            players.add(new Player(scanner.nextLine()));
        }

        Game game = new Game("words.txt");

        for (Player player : players) {
            game.play(player);
        }

        System.out.println("\n🏆 Game Over! Final Scores:");
        Player winner = players.get(0);

        for (Player player : players) {
            System.out.println(player.getName() + ": " + player.getScore());
            if (player.getScore() > winner.getScore()) {
                winner = player;
            }
        }

        System.out.println("\n🎖️ Winner: " + winner.getName() + " with score: " + winner.getScore());
    }
}
