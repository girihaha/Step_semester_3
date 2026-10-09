package oop.class_problems;

public class GameCharacter {
    private int health;
    private final int maxHealth;

    public GameCharacter(int maxHealth) {
        this.maxHealth = maxHealth;
        this.health = maxHealth;
    }

    public void takeDamage(int amount) {
        if (amount > 0) {
            health -= amount;
            if (health < 0) {
                health = 0;
            }
        }
    }

    public void heal(int amount) {
        if (amount > 0) {
            health += amount;
            if (health > maxHealth) {
                health = maxHealth;
            }
        }
    }

    public int getHealth() {
        return health;
    }

    public static void main(String[] args) {
        GameCharacter c = new GameCharacter(100);
        c.takeDamage(30);
        System.out.println("Health after 30 damage: " + c.getHealth());
        c.heal(50);
        System.out.println("Health after 50 heal (capped): " + c.getHealth());
        c.takeDamage(150);
        System.out.println("Health after 150 damage (floored): " + c.getHealth());
    }
}
