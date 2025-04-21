import java.util.Random;
import java.util.Scanner;
import java.nio.file.*;
import java.io.IOException;
import java.util.List;

public class Game {
    private List<String> words;
    private String chosenWord;
    private char[] guessedWord;
    private int attempts;
    private int score;

    public Game(String filePath) throws IOException {
        this.words = Files.readAllLines(Paths.get(filePath));
        Random random = new Random();
        this.chosenWord = words.get(random.nextInt(words.size())).toLowerCase();
        this.guessedWord = new char[chosenWord.length()];
        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '_';
        }
        this.attempts = chosenWord.length() + 3;
        this.score = 0;
    }

    public void play(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n🎮 " + player.getName() + "'s Turn:");

        while (attempts > 0) {
            System.out.println("Word: " + String.valueOf(guessedWord));
            System.out.println("Score: " + score);
            System.out.print("Enter a letter: ");
            String input = scanner.next().toLowerCase();

            if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                System.out.println("Invalid input! Please enter a single letter.");
                continue;
            }

            char guess = input.charAt(0);
            boolean correct = false;

            for (int i = 0; i < chosenWord.length(); i++) {
                if (chosenWord.charAt(i) == guess && guessedWord[i] != guess) {
                    guessedWord[i] = guess;
                    score += 10; // Award points for correct guess
                    correct = true;
                }
            }

            if (!correct) {
                attempts--;
                score -= 5; // Penalize incorrect guesses
                System.out.println("Incorrect guess! Attempts left: " + attempts);
            }

            if (String.valueOf(guessedWord).equals(chosenWord)) {
                score += attempts * 5; // Bonus points based on remaining attempts
                System.out.println("🎉 Congratulations! You guessed the word: " + chosenWord);
                System.out.println("Final Score: " + score);
                player.setScore(score);
                return;
            }
        }
        System.out.println("Game Over! The word was: " + chosenWord);
        System.out.println("Final Score: " + score);
        player.setScore(score);
    }
}
