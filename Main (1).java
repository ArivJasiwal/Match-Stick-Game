import java.util.Scanner;
//This code simulates a two-player "pick and draw" game with matches. Players take turns removing 1-m matches (m being a set limit) from a pile. Whoever takes the last match loses! The code visually displays the remaining matches and tracks players' turns.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentPlayer = 1;

        System.out.println("Enter the number of matches:");
        int n = scanner.nextInt();
        System.out.println("Enter the maximum number of matches a player can pick");
        int m = scanner.nextInt();

        while (n > 0) {
            System.out.println("Number of remaining matches: " + n);
            for (int i = 1; i <=  n; i++) {
                System.out.print("* ");
            }
            System.out.println();
             for (int c = 1; c <=  n; c++) {
                 System.out.print("| ");
             }
          System.out.println();
    
            System.out.println("Player " + currentPlayer + ": How many matches do you want to pick? (1,2, ...,)" + m);
            int pick = scanner.nextInt();

            if (pick < 1 || pick > m || pick > n) {
                System.out.println("Invalid move!");
                continue;
            }

            n -= pick;
            currentPlayer = 3 - currentPlayer;
        }

        currentPlayer = 3 - currentPlayer;
        System.out.println("Player " + currentPlayer + " won the game!");
    }
}
