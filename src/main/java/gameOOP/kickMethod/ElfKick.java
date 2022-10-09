package gameOOP.kickMethod;

import gameOOP.Character;

public class ElfKick implements BasicKick {

    @Override
    public void kick(Character whoKick, Character whoKicked) {
        if (whoKick.getPower() > whoKicked.getPower())
            whoKicked.setHp(0);
        else
            whoKick.setPower(whoKick.getPower()-1);
    }
}
