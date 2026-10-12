import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playAgain = "Y";
        while (playAgain.equalsIgnoreCase("Y")) {
            String moveA = "";
            boolean MoveA = false;
            while (!MoveA) {
                System.out.print("Player A enter your move (R, P, S): ");
                moveA = scanner.next();
                if (moveA.equalsIgnoreCase("R") || moveA.equalsIgnoreCase("P") || moveA.equalsIgnoreCase("S")) {
                    MoveA = true;
                } else {
                    System.out.println("Invalid input. Please enter R, P, or S.");
                }
            }
            String moveB = "";
            boolean MoveB = false;
            while (!MoveB) {
                System.out.print("Player B enter your move (R, P, S): ");
                moveB = scanner.next();
                if (moveB.equalsIgnoreCase("R") || moveB.equalsIgnoreCase("P") || moveB.equalsIgnoreCase("S")) {
                    MoveB = true;
                } else {
                    System.out.println("Invalid input Please enter R, P, or S.");
                }
            }
            if (moveA.equalsIgnoreCase(moveB)) {
                System.out.println("It's a Tie");
            } else if (
                    (moveA.equalsIgnoreCase("R") && moveB.equalsIgnoreCase("S")) ||
                            (moveA.equalsIgnoreCase("P") && moveB.equalsIgnoreCase("R")) ||
                            (moveA.equalsIgnoreCase("S") && moveB.equalsIgnoreCase("P")))
            {
                String result = "";
                if (moveA.equalsIgnoreCase("R")) {
                    result = "Rock breaks Scissors";
                } else if (moveA.equalsIgnoreCase("P")) {
                    result = "Paper covers Rock";
                } else {
                    result = "Scissors cuts Paper";
                }
                System.out.println(result + "Player A wins");
            } else {
                String result = "";
                if (moveB.equalsIgnoreCase("R")) {
                    result = "Rock breaks Scissors";
                } else if (moveB.equalsIgnoreCase("P")) {
                    result = "Paper covers Rock";
                } else {
                    result = "Scissors cuts Paper";
                }
                System.out.println(result + "Player B wins");
            }
            System.out.print("Do you want to play again? [Y/N]: ");
            playAgain = scanner.next();
            System.out.println();
        }
    }
}