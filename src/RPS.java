import java.util.Scanner;
public class RPS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playAgain = String.valueOf('Y');

        while (playAgain.equals("Y") || playAgain.equals("y")) {
            String moveA = "";
            String moveB = "";

            while (true) {
                System.out.print("Player A enter your move (R, P, S): ");
                moveA = scanner.next();
                if (moveA.equals("R") || moveA.equals("r") ||
                        moveA.equals("P") || moveA.equals("p") ||
                        moveA.equals("S") || moveA.equals("s")) {
                    break;
                }
                System.out.println("Invalid input Please enter R, P, or S.");
            }


            while (true) {
                System.out.print("Player B enter your move (R, P, S): ");
                moveB = scanner.next();
                if (moveB.equals("R") || moveB.equals("r") ||
                        moveB.equals("P") || moveB.equals("p") ||
                        moveB.equals("S") || moveB.equals("s")) {
                    break;
                }
                System.out.println("Invalid input Please enter R, P, or S.");
            }

            if (moveA.equals(moveB) || moveA.equalsIgnoreCase(moveB)) {
                String name = (moveA.equals("R") || moveA.equals("r")) ? "Rock" :
                        (moveA.equals("P") || moveA.equals("p")) ? "Paper" : "Scissors";
                System.out.println(name + " vs " + name + " — It's a Tie!");
            }

            else if ((moveA.equals("R") || moveA.equals("r")) && (moveB.equals("S") || moveB.equals("s"))) {
                System.out.println("Rock breaks Scissors — Player A wins!");
            } else if ((moveA.equals("S") || moveA.equals("s")) && (moveB.equals("R") || moveB.equals("r"))) {
                System.out.println("Rock breaks Scissors — Player B wins!");
            }

            else if ((moveA.equals("P") || moveA.equals("p")) && (moveB.equals("R") || moveB.equals("r"))) {
                System.out.println("Paper covers Rock — Player A wins!");
            } else if ((moveA.equals("R") || moveA.equals("r")) && (moveB.equals("P") || moveB.equals("p"))) {
                System.out.println("Paper covers Rock — Player B wins!");
            }

            else if ((moveA.equals("S") || moveA.equals("s")) && (moveB.equals("P") || moveB.equals("p"))) {
                System.out.println("Scissors cuts Paper — Player A wins!");
            } else if ((moveA.equals("P") || moveA.equals("p")) && (moveB.equals("S") || moveB.equals("s"))) {
                System.out.println("Scissors cuts Paper — Player B wins!");
            }

            System.out.print("Do you want to play again? [Y/N]: ");
            String response = scanner.next();

            System.out.println();
        }
    }
}
