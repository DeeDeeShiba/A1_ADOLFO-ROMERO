package sheridan.romeroad.rockpaperscissors.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;


public class Envelope implements Serializable {

    private int option = 1;

    public Envelope(){

    }

    public int getOption(){
        return option;
    }
    public void setOption(int option){ this.option=option; }

    @Override
    public String toString(){
        return "Envelope{" +
        "option=" + option +
                '}';

    }


}
