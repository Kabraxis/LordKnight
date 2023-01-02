package entities;

public class Monster extends Entity {

    public Monster() {
        super();
    }

    public Monster(int health) {
        super(health);
    }

    public Monster(int health, int attack) {
        super(health, attack);
    }

    public Monster(int health, int attack, String name) {
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

}
