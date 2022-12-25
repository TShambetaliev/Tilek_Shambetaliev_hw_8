package kg.geektech.game.playes;

import kg.geektech.game.general.RPG_Game;

public class Hacker extends Hero {
    public Hacker(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BONUS_HEALTH);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() < 100 && heroes[i].getHealth() != 0) {
                heroes[i].setHealth(heroes[i].getHealth() + this.getDamage());
            break;
            }
        }
    }
}