import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playAgain = "Y";

        while (playAgain.equalsIgnoreCase("Y")) {
            String moveA = "";
            while (true) {
                System.out.print("Player A enter your move (R, P, S): ");
                moveA = scanner.next();
                if (moveA.equalsIgnoreCase("R") || moveA.equalsIgnoreCase("P") || moveA.equalsIgnoreCase("S")) {
                    break;
                }
                System.out.println("Invalid input. Please enter R, P, or S.");
            }

            String moveB = "";
            while (true) {
                System.out.print("Player B enter your move (R, P, S): ");
                moveB = scanner.next();
                if (moveB.equalsIgnoreCase("R") || moveB.equalsIgnoreCase("P") || moveB.equalsIgnoreCase("S")) {
                    break;
                }
                System.out.println("Invalid input. Please enter R, P, or S.");
            }

            if (moveA.equalsIgnoreCase(moveB)) {
                System.out.println("It's a Tie");
            } else if (
                    (moveA.equalsIgnoreCase("R") && moveB.equalsIgnoreCase("S")) ||
                            (moveA.equalsIgnoreCase("P") && moveB.equalsIgnoreCase("R")) ||
                            (moveA.equalsIgnoreCase("S") && moveB.equalsIgnoreCase("P"))
            ) {
                String desc = moveA.equalsIgnoreCase("R") ? "Rock breaks Scissors" :
                        moveA.equalsIgnoreCase("P") ? "Paper covers Rock" : "Scissors cuts Paper";
                System.out.println(desc + " — Player A wins");
            } else {
                String desc = moveB.equalsIgnoreCase("R") ? "Rock breaks Scissors" :
                        moveB.equalsIgnoreCase("P") ? "Paper covers Rock" : "Scissors cuts Paper";
                System.out.println(desc + " — Player B wins");
            }

            System.out.print("Do you want to play again? [Y/N]: ");
            playAgain = scanner.next();
            System.out.println();
        }
    }
}
