import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        // variables
        String playerA = "";
        String playerB = "";
        String playAgain = "Y";

        Scanner in = new Scanner(System.in);

        //game
        while (playAgain.equalsIgnoreCase("Y"))
        {

            // checking for valid move
            Boolean validPlayerA = false;
            Boolean validPlayerB = false;
            while (!(validPlayerA))
            {
                System.out.println("Player A what do you choose? (R/P/S)");
                playerA = in.nextLine();
                if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S"))
                {
                    validPlayerA = true;
                }
                else
                {
                    System.out.println("Please enter a valid move");
                }
            }
            while (!(validPlayerB))
            {
                System.out.println("Player B what do you choose? (R/P/S)");
                playerB = in.nextLine();
                if (playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S"))
                {
                    validPlayerB = true;
                }
                else
                {
                    System.out.println("Please enter a valid move");
                }
            }

            //cross product selector
            if (playerA.equalsIgnoreCase("R"))
            {
                if (playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock can't break Rock, it's a Tie");
                }
                else if (playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("Rock is covered by Paper, Player B Wins");
                }
                else
                {
                    System.out.println("Rock breaks Scissors, Player A wins");
                }
            }
            if (playerA.equalsIgnoreCase("P"))
            {
                if (playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("Paper covers Rock, Player A wins");
                }
                else if (playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper can't cover Paper, it's a Tie");
                }
                else
                {
                    System.out.println("Paper is cut by Scissors, Player B wins");
                }
            }
            if (playerA.equalsIgnoreCase("S"))
            {
                if (playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("Scissors is broken by R, Player B wins");
                }
                else if (playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("Scissors cuts Paper, Player A wins");
                }
                else
                {
                    System.out.println("Scissors can't cut Scissors, it's a Tie");
                }
            }

            //valid play again entry
            Boolean validPlayAgain = false;
            while (!(validPlayAgain))
            {
                System.out.println("Would you like to play again? (Y/N)");
                playAgain = in.nextLine();
                if (playAgain.equalsIgnoreCase("Y") || playAgain.equalsIgnoreCase("N"))
                {
                    validPlayAgain = true;
                }
                else
                {
                    System.out.println("Please enter a valid response");
                }
            }
        }
    }
}