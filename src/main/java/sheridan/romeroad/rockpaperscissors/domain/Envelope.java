package sheridan.romeroad.rockpaperscissors.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;


public class Envelope implements Serializable {

    private int option = 0;

    public Envelope(){

    }

    public int getOption(){
        return option;
    }
    public void setOption(int option){ this.option=option; }




}
