import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playAgain = "Y";
        while (playAgain.equalsIgnoreCase("Y")) {
            String moveA = "";
            while (true) {
                System.out.print("Player A enter your move (R, P, S): ");
                moveA = scanner.next().toUpperCase();
                if (moveA.equals("R") || moveA.equals("P") || moveA.equals("S")) {
                    break;
                }
                System.out.println("Invalid input. Please enter R, P, or S.");
            }
            String moveB = "";
            while (true) {
                System.out.print("Player B enter your move (R, P, S): ");
                moveB = scanner.next().toUpperCase();
                if (moveB.equals("R") || moveB.equals("P") || moveB.equals("S")) {
                    break;
                }
                System.out.println("Invalid input. Please enter R, P, or S.");
            }
            if (moveA.equals(moveB)) {
                System.out.println("It's a Tie!");
            } else if (
                    (moveA.equals("R") && moveB.equals("S")) ||
                            (moveA.equals("P") && moveB.equals("R")) ||
                            (moveA.equals("S") && moveB.equals("P"))
            ) {
                String result = moveA.equals("R") ? "Rock breaks Scissors" :
                        moveA.equals("P") ? "Paper covers Rock" : "Scissors cuts Paper";
                System.out.println(result + "Player A wins");
            } else {
                String result = moveB.equals("R") ? "Rock breaks Scissors" :
                        moveB.equals("P") ? "Paper covers Rock" : "Scissors cuts Paper";
                System.out.println(result + "Player B wins");
            }
            System.out.print("Do you want to play again? y/n: ");
            playAgain = scanner.next();
            System.out.println();
        }
    }
}