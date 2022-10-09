package gameOOP.characters;

import gameOOP.Noble;
import gameOOP.kickMethod.NobleKick;

public class King extends Noble {

    public King(){
    super(5, 15, new NobleKick());
    }

}
