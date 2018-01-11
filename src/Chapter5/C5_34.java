package Chapter5;

import java.util.Scanner;
import java.util.Random;

/**
 * Program plays ROCK PAPER SMASH
 *
 * @author Chad Marshall
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args - outputs stuff to console
     */
    public static void main(String[] args) {
        /**
         * username - userinput for username computername - name for computer
         * compwins, userwins - records how many wins each person has
         * boringchoice, choice - random generator for each seperate game
         * mystring, myboreingstring - choice for each game gameString -
         * displays intro if user selects the SMASH setting
         */
        System.out.println("If you grading this as an assignment, please choose (1) at the begining of the game");
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name...");
        String username = input.next();
        System.out.println("Enter your opponent's name... ");
        String computername = input.next();
        int compWins, userWins;
        compWins = 0;
        userWins = 0;

        {
            System.out.println("Choose game mode: Boreing(1) or Smash(2)");
            String gameString = input.next();
            if ("2".equals(gameString)) {
                System.out.println("Welcome to rock, paper, and SMASH!!!!");
            }
            Integer boreing = Integer.parseInt(gameString);/// regular rock,paper,scissors game
            //int smash = int.Parse(gameString);/// awsome rock,paper,scissors game
            do {
                switch (boreing) {

                    case 1: {
                        System.out.println("____________________________________________");
                        int boreingchoice = (int) (Math.random() * 3);
                        ///Random boreingrnd = new Random();
                        ///int boreingchoice = boreingrnd.nextInt((3) + 1) + 1;
                        System.out.println("Enter 2 for paper, 1 for rock, and 0 for scissors....  ");
                        String myboreingString = input.next();///string for user input
                        int switch1 = Integer.parseInt(myboreingString);
                        int switch2 = Integer.parseInt(myboreingString);
                        int switch3 = Integer.parseInt(myboreingString);
                        ///int userBore = Integer.parseInt(myboreingString);
                        switch (switch1)///PAPER
                        {
                            case 2:/// user chooses paper
                                switch (boreingchoice) {
                                    case 2:/// computer chooses paper
                                        System.out.println("you choose paper.");///user results
                                        System.out.println("computer chooses paper.");///computer results
                                        System.out.println("draw ");/// results in a draw
                                        break;
                                    case 1:/// computer chooses rock
                                        System.out.println("you choose paper.");///user results
                                        System.out.println("computer chooses rock.");///computer results
                                        System.out.println("you get a point");/// you win
                                        userWins = userWins + 1;
                                        break;
                                    case 0:/// computer chooses scissors
                                        System.out.println("you choose paper.");///user results
                                        System.out.println("computer chooses scissors.");///computer results
                                        System.out.println("computer gets a point");/// computer wins
                                        compWins = compWins + 1;
                                        break;
                                }
                                break;
                        }
                        switch (switch2)///ROCK
                        {
                            case 1:/// user chooses rock
                                switch (boreingchoice) {
                                    case 1:/// computer chooses rock
                                        System.out.println("you choose rock.");///user results
                                        System.out.println("computer chooses rock");///computer results
                                        System.out.println("draw ");/// results in a draw
                                        break;
                                    case 2:/// computer chooses paper
                                        System.out.println("you choose rock.");///user results
                                        System.out.println("computer chooses paper.");///computer results
                                        System.out.println("computer gets a point");/// computer win
                                        compWins = compWins + 1;
                                        break;
                                    case 0:/// computer chooses scissors
                                        System.out.println("you choose rock.");///user results
                                        System.out.println("computer chooses scissors.");///computer results
                                        System.out.println("you get a point");/// user wins
                                        userWins = userWins + 1;
                                        break;
                                }
                                break;
                        }
                        switch (switch3)///SCISSORS
                        {
                            case 0:/// user chooses scissors
                                switch (boreingchoice) {
                                    case 0:/// computer chooses scissors 
                                        System.out.println("you choose scissors");///user results
                                        System.out.println("computer chooses scissors");///computer results
                                        System.out.println("draw ");/// results in a draw
                                        break;
                                    case 1:/// computer chooses rock
                                        System.out.println("you choose rock.");///user results
                                        System.out.println("computer chooses rock");///computer results
                                        System.out.println("computer gets a point.");/// you win
                                        compWins = compWins + 1;
                                        break;
                                    case 2:/// computer chooses paper
                                        System.out.println("you choose scissors");///user results
                                        System.out.println("computer chooses paper.");///computer results);
                                        System.out.println("you get a point");/// user wins
                                        userWins = userWins + 1;
                                        break;
                                }
                                break;
                        }
                        break;
                    }
                    case 2:/// game mode for smash
                    {
                        System.out.println("____________________________________________");
                        Random rnd = new Random();
                        int choice = rnd.nextInt((4 - 1) + 1) + 1;
                        System.out.println("Enter 'p' for paper, 'r' for rock, and 's' for scissors....  ");
                        String myString = input.next();///string for user input
                        Character switch4 = myString.charAt(0);
                        Character switch5 = myString.charAt(0);
                        Character switch6 = myString.charAt(0);
                        ///int userSmash = Integer.parseInt(myString);

                        switch (switch4)///PAPER
                        {
                            case 'p':/// persone chooses the money
                                switch (choice) {
                                    case 1:/// computer chooses the money as well
                                        System.out.println(username + " has chosen the money.");///user results
                                        System.out.println(computername + " chose the money too.");///computer results
                                        System.out.println(" No Contest....");/// results in a draw
                                        break;
                                    case 2:/// computer chooses The Rock
                                        System.out.println(username + " chose the money.");///user results
                                        System.out.println(computername + " chose The Rock.");///computer results
                                        System.out.println(" The money creates a rope out of itself and strangles Dwayne Johnson.");
                                        System.out.println(username + " gets a point");/// you win
                                        userWins = userWins + 1;
                                        break;
                                    case 3:/// computer chooses Ryuko Matoi's Rending Scissors
                                        System.out.println(username + " chose the money.");///user results
                                        System.out.println(computername + " chose a scissor blade.");///computer results
                                        System.out.println(computername + "uses the scissor blade to slice through the rope made by the money.");
                                        System.out.println(computername + " gets a point");/// computer wins
                                        compWins = compWins + 1;
                                        break;
                                }
                                break;
                        }
                        switch (switch5)///ROCK
                        {
                            case 'r':/// persone chooses Dwayne Johnson
                                switch (choice) {
                                    case 1:/// computer chooses The Rock as well
                                        System.out.println(username + " has chosen Dwayne Johnson.");///user results
                                        System.out.println(computername + " has also chosen Dwayne Johnson but, there can only be one 'Rock' so " + computername + " chooses John Cena.");///computer results
                                        System.out.println(" No Contest....");/// results in a draw
                                        break;
                                    case 2:/// computer chooses the money
                                        System.out.println(username + " chose the The Rock.");///user results
                                        System.out.println(computername + " chose the money.");///computer results
                                        System.out.println(" The money creates a rope out of itself and strangles Dwayne Johnson.");
                                        System.out.println(computername + " gets a point");/// computer win
                                        compWins = compWins + 1;
                                        break;
                                    case 3:/// computer chooses Ryuko Matoi's Rending Scissors
                                        System.out.println(username + " chose Dwayne Johnson.");///user results
                                        System.out.println(computername + " chose a scissor blade.");///computer results
                                        System.out.println(" The Rock rips the blade in half.");
                                        System.out.println(username + " gets a point");/// user wins
                                        userWins = userWins + 1;
                                        break;

                                }
                                break;
                        }
                        switch (switch6)///SCISSORS
                        {
                            case 's':/// persone chooses Rending Scissors
                                switch (choice) {
                                    case 1:/// computer chooses the scissors as well
                                        System.out.println(username + " has chosen the scissor blade.");///user results
                                        System.out.println(computername + " chose a keyblade?");///computer results
                                        System.out.println(" No Contest....");/// results in a draw
                                        break;
                                    case 2:/// computer chooses The Rock
                                        System.out.println(username + " uses The Rending Scissors.");///user results
                                        System.out.println(computername + " chose The Rock but, Dwayne Johnson is too tired to participate so Chuck Norris takes his plac.");///computer results
                                        System.out.println(" Chuck Norris destroys the blade with his beard fist, then finishes it with a roundhouse kick TO THE FACE... I mean blade.");
                                        System.out.println(computername + " gets a point");/// computer win
                                        compWins = compWins + 1;
                                        break;
                                    case 3:/// computer chooses money
                                        System.out.println(username + " stole Ryuko Matoi's scissor blade.");///user results
                                        System.out.println(computername + " ran out of money so " + computername + " started using YuGiOh cards.");///computer results
                                        System.out.println(username + " used a scissor blade dipped in a elixer of bad-Azzness to slice through Exodia The Forbidden One.");
                                        System.out.println(username + " gets a point");/// user wins   
                                        userWins = userWins + 1;
                                        break;
                                }
                                break;
                        }
                    }
                    break;
                }
            } while (compWins < 2 && userWins < 2);
            if (compWins == 2) {
                //compWins = 10;
                System.out.println("YOU LOSE");
            } else if (userWins == 2) {
                //userWins = 10;
                System.out.println("YOU WIN");
            }
        }
    }

}
