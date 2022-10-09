package gameOOP.characters;

import gameOOP.Character;
import gameOOP.kickMethod.CryKick;

public class Hobbit extends Character {
    public Hobbit() {
        super(3, 0, new CryKick());
    }

    public static void main(String[] args) {
       Hobbit hobbit = new Hobbit();
       hobbit.kick(new Hobbit());
    }


}
