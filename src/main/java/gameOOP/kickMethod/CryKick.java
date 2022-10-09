package gameOOP.kickMethod;

import gameOOP.Character;

public class CryKick implements BasicKick {

    @Override
    public void kick(Character whoKick, Character whoKicked) {
        System.out.println("Hobbit cries...");
        whoKicked.setHp(0);
    }
}
