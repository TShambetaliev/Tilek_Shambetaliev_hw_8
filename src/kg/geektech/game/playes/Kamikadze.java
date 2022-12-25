package kg.geektech.game.playes;

import kg.geektech.game.general.RPG_Game;

public class Kamikadze extends Hero {
    public Kamikadze(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BOMBA);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
     int hitTheMark = RPG_Game.random.nextInt(5);
     if (hitTheMark == 5) {
         boss.setHealth(boss.getHealth()-this.getHealth());
         Kamikadze.this.setHealth(this.getHealth()-this.getHealth());
     }
     else boss.setHealth(boss.getHealth() - (this.getHealth()/2));
        Kamikadze.this.setHealth(this.getHealth()-this.getHealth()/2);
    }
}