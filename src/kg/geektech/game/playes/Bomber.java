package kg.geektech.game.playes;

import kg.geektech.game.general.RPG_Game;

public class Bomber extends Hero {
    public Bomber(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BOMBA);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (heroes[7].getHealth() <= 0) {
         boss.setHealth(boss.getHealth()-100);
    }
    }
}