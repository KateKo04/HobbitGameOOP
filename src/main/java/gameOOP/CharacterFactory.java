package gameOOP;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.util.Random;
import java.util.Set;

import static org.reflections.scanners.Scanners.SubTypes;

public class CharacterFactory {

    @SneakyThrows
    public Character createCharacter(){

//        Class[] characters = new Class[]{Hobbit.class, King.class, Knight.class};
//
//        return (Character) characters[new Random().nextInt(characters.length)].getDeclaredConstructor().newInstance();


        Reflections reflections = new Reflections("org.example.characters");

        Set<Class<?>> subTypes = reflections.get(SubTypes.of(Character.class).asClass());

        Class cls = (Class) subTypes.toArray()[new Random().nextInt(subTypes.size())];
        return (Character) cls.getDeclaredConstructor().newInstance();

    }

    public static void main(String[] args) {
        System.out.println(new CharacterFactory().createCharacter());
    }
}
