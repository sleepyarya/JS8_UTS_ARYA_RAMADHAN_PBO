public class JumpingZombie extends Zombie {

    public JumpingZombie(int health, int level) {
        super(health, level);
    }

    public void heal() {
        double increase = 0;
        if (level == 1) {
            increase = 0.30;
        } else if (level == 2) {
            increase = 0.40;
        } else if (level == 3) {
            increase = 0.50;
        }
        
        int healthSebelum = this.health;
        this.health += (int)(this.health * increase);
        System.out.println("JumpingZombie level " + this.level + " menyembuhkan diri. Health bertambah " + (this.health - healthSebelum) + ". Health saat ini: " + this.health);
    }

    public void destroyed() {
        this.health -= (int)(this.health * 0.10);
        System.out.println("JumpingZombie diserang. Health berkurang 10%. Health saat ini: " + this.health);
        
        if (this.health <= 0) {
            System.out.println(">>> JumpingZombie kalah (Health = 0)!");
            this.health = 0;
        }
    }
}