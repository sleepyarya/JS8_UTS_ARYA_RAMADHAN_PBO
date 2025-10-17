public class Main {
    public static void main(String[] args) {
        
        WalkingZombie wz1 = new WalkingZombie(100, 2);
        JumpingZombie jz1 = new JumpingZombie(80, 3);
        Barrier b1 = new Barrier(20);
        
        Plant p1 = new Plant();

        System.out.println("--- Status Awal ---");
        System.out.println(wz1.getDestroyableInfo());
        System.out.println(jz1.getDestroyableInfo());
        System.out.println(b1.getDestroyableInfo());
        
        System.out.println("\n--- Aksi 1: Plant serang Walking Zombie ---");
        p1.doDestroy(wz1); 

        System.out.println("\n--- Aksi 2: Walking Zombie menyembuhkan diri ---");
        wz1.heal(); 
        
        System.out.println("\n--- Aksi 3: Plant serang Barrier (Sisa 11) ---");
        p1.doDestroy(b1);
        
        System.out.println("\n--- Aksi 4: Plant serang Jumping Zombie ---");
        p1.doDestroy(jz1);
        
        System.out.println("\n--- Aksi 5: Plant serang Barrier (Sisa 2) ---");
        p1.doDestroy(b1);
        
        System.out.println("\n--- Aksi 6: Plant serang Barrier (Kalah) ---");
        p1.doDestroy(b1); 
        
        System.out.println("\n--- Aksi 7: Plant serang Barrier yang sudah kalah ---");
        p1.doDestroy(b1);

        System.out.println("\n--- Status Akhir ---");
        System.out.println(wz1.getDestroyableInfo());
        System.out.println(jz1.getDestroyableInfo());
        System.out.println(b1.getDestroyableInfo());
    }
}