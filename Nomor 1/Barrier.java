public class Barrier implements Destroyable {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public void destroyed() {
        this.strength -= 9;
        System.out.println("Barrier diserang. Strength berkurang 9. Strength saat ini: " + this.strength);
        
        if (this.strength <= 0) {
            System.out.println(">>> Barrier kalah (Strength = 0)!");
            this.strength = 0;
        }
    }

    public String getBarrierInfo() {
        return "Jenis: Barrier\n  Strength: " + this.strength;
    }
    
    @Override
    public String getDestroyableInfo() {
        return getBarrierInfo();
    }
}