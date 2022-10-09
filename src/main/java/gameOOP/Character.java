package gameOOP;

import lombok.AllArgsConstructor;
import lombok.Getter;
import gameOOP.kickMethod.BasicKick;

@Getter @AllArgsConstructor
public abstract class Character {
    private int hp;
    private int power;

    private BasicKick kickChar;

    public void kick(Character c){
        BasicKick kickChar1 = this.kickChar;
        kickChar1.kick(this, c);
    }


    public boolean isAlive() {
        return getHp() > 0;
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }

    public void setPower(int power) {
        this.power = Math.max(power, 0);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }

}