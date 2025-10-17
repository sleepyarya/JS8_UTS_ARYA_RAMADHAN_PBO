public abstract class Zombie implements Destroyable {
    protected int health;
    protected int level;

    public Zombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public abstract void heal();

    @Override
    public abstract void destroyed();

    public String getZombieInfo() {
        return "Jenis: " + this.getClass().getSimpleName() + 
               "\n  Health: " + this.health +
               "\n  Level: " + this.level;
    }

    @Override
    public String getDestroyableInfo() {
        return getZombieInfo();
    }

    // Getter for health so other classes (like Tester) can access it
    public int getHealth() {
        return this.health;
    }
}