package entities;

import java.util.Random;

public class Mob extends Entity {

    private int initiative;

    public Mob() {
        super();
    }

    public Mob(int health) {
        super(health);
    }

    public Mob(int health, int attack) {
        super(health, attack);
    }

    public Mob(int health, int attack, String name) {
        super(health, attack, name);
    }

    public int getHealth() {
        return super.getHealth();
    }

    public void setHealth(int health) {
        super.setHealth(health);
    }

    public int getAttack() {
        return super.getAttack();
    }

    public void setAttack(int attack) {
        super.setAttack(attack);
    }

    public String getName() {
        return super.getName();
    }

    public void setName(String name) {
        super.setName(name);
    }

    public void damage(int damage) {
        super.setHealth(super.getHealth() - damage);
    }

    public void setInitiative() {
        this.initiative = new Random().nextInt(0, Integer.MAX_VALUE);
    }

    public int getInitiative() {
        return initiative;
    }
}
