package gameOOP.characters;

import gameOOP.Noble;
import gameOOP.kickMethod.NobleKick;

import java.util.Random;

public class Knight extends Noble {

    private static final Random randomGenerator = new Random();

    public Knight(){
        super(2 + (int)(Math.random() * ((12 - 2) + 1)), 2 + (int)(Math.random() * ((12 - 2) + 1)), new NobleKick());
    }

}
