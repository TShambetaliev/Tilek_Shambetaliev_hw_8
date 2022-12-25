package kg.geektech.game.playes;

import kg.geektech.game.general.RPG_Game;

public class Witcher extends Hero {
    public Witcher(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.HEALTH_BONUS);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() <= 0) {
                heroes[i].setHealth(heroes[i].getHealth()+this.getHealth());
                Witcher.this.setHealth(this.getHealth()-this.getHealth());
            }

        }
    }
}