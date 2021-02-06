package sheridan.romeroad.rockpaperscissors.domain;

import java.io.Serializable;

public class Game implements Serializable {

    private int computerRandChoice;
    private char userChoice;
    private String outcome;

    public Game(char choice) {
        int randChoice = (int) (4 * Math.random());
        computerRandChoice = randChoice;
        userChoice = choice;

    }

    public void decideWinnner() {
        //draw event
        if (userChoice == computerRandChoice) {
            outcome = "DRAW";
        }
        //rock v paper - user lost
        else if (userChoice == '0' && computerRandChoice == '1') {
            outcome = "YOU LOOSE";
        }
        //rock v paper - user won
        else if (userChoice == '1' && computerRandChoice == '0') {
            outcome = "YOU WIN";
        }
        //rock v scissor - user lost
        else if (userChoice == '2' && computerRandChoice == '0') {
            outcome = "YOU LOOSE";
        }
        //rock v scissor - user wins
        else if (userChoice == '0' && computerRandChoice == '2') {
            outcome = "YOU WIN";
        }
        //scissor v paper - user lost
        else if (userChoice == '1' && computerRandChoice == '2') {
            outcome = "YOU LOOSE";
        }
        //scissor v paper - user win
        else if (userChoice == '2' && computerRandChoice == '1') {
            outcome = "YOU WIN";
        }

    }
}
