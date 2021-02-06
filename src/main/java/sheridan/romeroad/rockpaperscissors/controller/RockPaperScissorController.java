package sheridan.romeroad.rockpaperscissors.controller;

import org.springframework.stereotype.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
//import sheridan.romeroad.rockpaperscissors.domain.Envelope;
import sheridan.romeroad.rockpaperscissors.domain.Game;

@Controller
public class RockPaperScissorController {

    private final Logger logger = LoggerFactory.getLogger(RockPaperScissorController.class);

    /*@GetMapping(value = {"/", "Input"})
    public String input() {
        logger.trace("input() is called");

        return "Input";

    }*/
    @GetMapping(value={"/Output"})
    public ModelAndView game (@RequestParam(defaultValue = "0")int option){
        logger.trace("game() is called");
        Game game = new Game(option);
        game.decideWinner();
        return new ModelAndView("Output", "game", game);
    }


    /*@GetMapping("/Process")
    public ModelAndView process(@ModelAttribute Envelope envelope) {
        logger.trace("process() is called");
        logger.debug("envelope = " + envelope);
        return new ModelAndView("Output", "envelope", envelope);
    }*/


}



