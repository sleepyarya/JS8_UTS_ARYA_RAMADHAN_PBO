public class WalkingZombie extends Zombie {

    public WalkingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        double increase = 0;
        if (level == 1) {
            increase = 0.20; 
        } else if (level == 2) {
            increase = 0.30; 
        } else if (level == 3) {
            increase = 0.40; 
        }
        
        this.health += (int)(this.health * increase);
        System.out.println(this.getClass().getSimpleName() + " level " + this.level + " menyembuhkan diri. Health bertambah " + (increase * 100) + "%. Health saat ini: " + this.health);
    }

    @Override
    public void destroyed() {
        this.health -= (int)(this.health * 0.20);
        System.out.println(this.getClass().getSimpleName() + " diserang. Health berkurang 20%. Health saat ini: " + this.health);
        
        if (this.health <= 0) {
            System.out.println(">>> " + this.getClass().getSimpleName() + " kalah (Health = 0)!");
            this.health = 0; 
        }
    }
}