package sheridan.romeroad.rockpaperscissors.controller;

import org.springframework.stereotype.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sheridan.romeroad.rockpaperscissors.domain.Game;

@Controller
public class RockPaperScissorController {
    private final Logger logger = LoggerFactory.getLogger(RockPaperScissorController.class);

    @GetMapping(value={"/","Input"})
    public String Input(){
        logger.trace("Input is called");
        //Game game = new Game();
        return "Input";
    }

    public void game(@RequestParam(defaultValue = "0")char choice){
        logger.trace("Game() is called");
        Game game = new Game(choice);
        game.decideWinnner();
    }
    /*@GetMapping("/process")
    public ModelAndView process(@ModelAttribute Envelope envelope){
        logger.trace("process() is called");
        logger.debug("envelope = "+ envelope);
        return new ModelAndView("Output", "envelope", envelope);
    }*/


}
