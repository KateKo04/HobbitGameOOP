package gameOOP;

public class GameManager {
    public void fight(Character c1, Character c2){
//        to provide fight between to characters and explain via command
//        line what happens during fight, till both of
//        the characters are alive


        System.out.println(c1 + " VS " + c2);
        System.out.println("Fight is starting in 3.. 2.. 1..");
        System.out.println("Features of rivals: ");
        System.out.println(c1.getHp() + " HP and " + c1.getPower() + " Power VS " + c2.getHp() + " HP and " + c2.getPower() + " Power");
        c1.kick(c2);
        System.out.println("After fight: ");
        System.out.println(c1.getHp() + " HP and " + c1.getPower() + " Power AND " + c2.getHp() + " HP and " + c2.getPower() + " Power");
    }

    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();
        Character character1 = characterFactory.createCharacter();
        Character character2 = characterFactory.createCharacter();
        GameManager gameManager = new GameManager();
        gameManager.fight(character1, character2);
    }
}
