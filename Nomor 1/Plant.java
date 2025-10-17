public class Plant {
    
    public void doDestroy(Destroyable d) {
        System.out.println("\n--- Plant melakukan penghancuran ---");
        
        if (d instanceof Barrier) {
            Barrier barrier = (Barrier) d;
            if (barrier.getStrength() > 0) {
                d.destroyed();
            } else {
                System.out.println("Barrier sudah kalah.");
            }
        } else if (d instanceof Zombie) {
            Zombie zombie = (Zombie) d;
            if (zombie.getHealth() > 0) {
                d.destroyed();
            } else {
                System.out.println(zombie.getClass().getSimpleName() + " sudah kalah.");
            }
        } else {
            System.out.println("Target tidak dikenal.");
        }
    }
}