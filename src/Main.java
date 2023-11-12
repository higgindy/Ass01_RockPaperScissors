import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        boolean gameContinue = true;

        do
        {
            String playerA = "";
            String playerB = "";

            boolean done = false;

            do
            {
                System.out.print("\nPlayer A: Enter a move [R, P, S]: ");
                playerA = scanner.nextLine().toUpperCase();

                if (!(playerA.equals("R") || playerA.equals("P") || playerA.equals("S")))
                {
                    System.out.println("\nInvalid move. Please choose [R, P, S].");
                }
                else
                {
                    done = true;
                }
            }
            while (!done);

            done = false;

            do
            {
                System.out.print("Player B: Enter a move [R, P, S]: ");
                playerB = scanner.nextLine().toUpperCase();

                if (!(playerB.equals("R") || playerB.equals("P") || playerB.equals("S")))
                {
                    System.out.println("\nInvalid move. Please choose [R, P, S].\n");
                }
                else
                {
                    done = true;
                }
            }
            while (!done);

            System.out.println();

            if (playerA.equals(playerB))
            {
                System.out.println(playerA + " vs " + playerB + ", it's a Tie!");
            }
            else if ((playerA.equals("R") && playerB.equals("S")) ||
                    (playerA.equals("P") && playerB.equals("R")) ||
                    (playerA.equals("S") && playerB.equals("P")))
            {
                System.out.println(playerA + " beats " + playerB + ", Player A wins!");
            }
            else
            {
                System.out.println(playerB + " beats " + playerA + ", Player B wins!");
            }

            done = false;

            String continueYN = "";

            do
            {
                System.out.print("\nDo you want to play again? (Y/N): ");
                continueYN = scanner.nextLine().toUpperCase();

                if (!(continueYN.equals("Y") || continueYN.equals("N")))
                {
                    System.out.println("\nInvalid choice. Please enter Y or N.");
                } else
                {
                    done = true;
                }
            }
            while (!done);

            gameContinue = continueYN.equals("Y");

        }
        while (gameContinue);

        scanner.close();
    }
}


