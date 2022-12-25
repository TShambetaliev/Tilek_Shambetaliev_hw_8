package kg.geektech.game.playes;

import kg.geektech.game.general.RPG_Game;
import kg.geektech.game.playes.Boss;

public class Berserk extends Hero {
    private int savedDamage;
    public Berserk(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        setSavedDamage(boss.getDamage()/8);
        boss.setHealth(boss.getHealth() - savedDamage);
        System.out.println("Berserk save damage: " + savedDamage);
    }
    public int getSavedDamage() {
        return savedDamage;
    }

    public void setSavedDamage(int savedDamage) {
        this.savedDamage = savedDamage;
    }
}

