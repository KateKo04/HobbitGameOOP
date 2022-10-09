package gameOOP.characters;

import gameOOP.Character;
import gameOOP.kickMethod.ElfKick;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Elf extends Character {
    public Elf(){
        super(10, 10, new ElfKick());
    }

}
