import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        // variables
        String playerA;
        String playerB;
        String playAgain = "Y";

        Scanner in = new Scanner(System.in);

        //game
        while (playAgain.equalsIgnoreCase("Y"))
        {

            // reset player moves
            playerA = "";
            playerB = "";
            // checking for valid
            while (!(playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")))
            {
                System.out.println("Player A what do you choose? (R/P/S)");
                playerA = in.nextLine();
                if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S"))
                {
                    break;
                }
                else
                {
                    System.out.println("Please enter a valid move");
                }
            }
            while (!(playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S")))
            {
                System.out.println("Player B what do you choose? (R/P/S)");
                playerB = in.nextLine();
                if (playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S"))
                {
                    break;
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
            playAgain = "";
            while (!(playAgain.equalsIgnoreCase("Y") || playAgain.equalsIgnoreCase("N")))
            {
                System.out.println("Would you like to play again? (Y/N)");
                playAgain = in.nextLine();
                if (playAgain.equalsIgnoreCase("Y") || playAgain.equalsIgnoreCase("N"))
                {
                    break;
                }
                else
                {
                    System.out.println("Please enter a valid response");
                }
            }
        }
    }
}