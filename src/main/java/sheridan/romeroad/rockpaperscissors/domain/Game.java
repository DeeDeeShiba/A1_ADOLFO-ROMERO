package sheridan.romeroad.rockpaperscissors.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sheridan.romeroad.rockpaperscissors.controller.RockPaperScissorController;

import java.io.Serializable;

public class Game implements Serializable {

    private final Logger logger = LoggerFactory.getLogger(RockPaperScissorController.class);

    public int computerRandChoice;
    public int userChoice;
    public String outcome;

    public Game(int choice) {
        logger.trace("Game() is called");
        computerRandChoice = (int) (4 * Math.random());
        userChoice = choice;
    }
    public String getOutcome(){return outcome;}

    public void decideWinner() {
        logger.trace("decideWinner() is called");
        //draw event
        if (userChoice == computerRandChoice) {
            this.outcome = "DRAW";
        }
        //rock v paper - user lost
        else if (userChoice == '0' && computerRandChoice == '1') {
            this.outcome = "YOU LOOSE";
        }
        //rock v paper - user won
        else if (userChoice == '1' && computerRandChoice == '0') {
            this.outcome = "YOU WIN";
        }
        //rock v scissor - user lost
        else if (userChoice == '2' && computerRandChoice == '0') {
            this.outcome = "YOU LOOSE";
        }
        //rock v scissor - user wins
        else if (userChoice == '0' && computerRandChoice == '2') {
            this.outcome = "YOU WIN";
        }
        //scissor v paper - user lost
        else if (userChoice == '1' && computerRandChoice == '2') {
            this.outcome = "YOU LOOSE";
        }
        //scissor v paper - user win
        else if (userChoice == '2' && computerRandChoice == '1') {
            this.outcome = "YOU WIN";
        }
        else{
            this.outcome = "ERROR";
        }

    }
}
