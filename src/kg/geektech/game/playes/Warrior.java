package kg.geektech.game.playes;

import kg.geektech.game.general.RPG_Game;
import kg.geektech.game.playes.Boss;
import kg.geektech.game.playes.Hero;
import kg.geektech.game.playes.SuperAbility;

public class Warrior extends Hero {
    public Warrior(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int coefficient = RPG_Game.random.nextInt(3) + 1;
        boss.setHealth(boss.getHealth() - this.getDamage() * coefficient);
        System.out.println("Warrior hits critically: " + this.getDamage() * coefficient);
    }
}