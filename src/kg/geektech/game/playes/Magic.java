package kg.geektech.game.playes;

import kg.geektech.game.general.RPG_Game;
import kg.geektech.game.playes.Boss;
import kg.geektech.game.playes.Hero;
import kg.geektech.game.playes.SuperAbility;

public class Magic extends Hero {
    public Magic(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int magicBonus = RPG_Game.random.nextInt(3);
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && heroes[2].getHealth() > 0) {
                heroes[i].setDamage(heroes[i].getDamage() + magicBonus);
            }
        }
    }
}
