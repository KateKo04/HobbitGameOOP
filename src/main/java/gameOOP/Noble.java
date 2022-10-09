package gameOOP;

import gameOOP.kickMethod.BasicKick;

import java.util.Random;

public class Noble extends Character{

    private static final Random randomGenerator = new Random();
    public Noble(int max, int min, BasicKick kick) {
        super(min + (int)(Math.random() * ((max - min) + 1)), min + (int)(Math.random() * ((max - min) + 1)), kick);
    }

}
