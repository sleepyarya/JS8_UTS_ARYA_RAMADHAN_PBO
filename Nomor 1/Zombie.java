public abstract class Zombie extends Destroyable {
    protected int health;
    protected int level;

    public Zombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public abstract void heal();

    public abstract void destroyed(); 

    public String getZombieInfo() {
        return "Jenis: " + this.getClass().getSimpleName() + 
               "\n  Health: " + this.health +
               "\n  Level: " + this.level;
    }

    public int getHealth() {
        return health;
    }
    
    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public String getDestroyableInfo() {
        return getZombieInfo();
    }
}