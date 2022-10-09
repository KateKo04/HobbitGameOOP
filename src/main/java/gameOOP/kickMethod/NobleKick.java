package gameOOP.kickMethod;

import gameOOP.Character;

public class NobleKick implements BasicKick {

    @Override
    public void kick(Character whoKick, Character whoKicked) {
        int defeatHP = (int)(Math.random() * whoKicked.getHp());
        whoKicked.setHp(whoKicked.getHp()-defeatHP);
    }

}
