// Main.java
public class Main {
    public static void main(String[] args) {
        // Inisialisasi Objek
        WalkingZombie wz1 = new WalkingZombie(100, 2);
        JumpingZombie jz1 = new JumpingZombie(80, 3);
        Barrier b1 = new Barrier(20);
        
        Plant p1 = new Plant();

        System.out.println("--- Status Awal ---");
        System.out.println(wz1.getDestroyableInfo());
        System.out.println(jz1.getDestroyableInfo());
        System.out.println(b1.getDestroyableInfo());
        
        System.out.println("\n--- Aksi Plant ---");
        
        p1.doDestroy(wz1); 

        wz1.heal(); 
        
        p1.doDestroy(b1);
        
        p1.doDestroy(jz1);
        
        p1.doDestroy(b1);
        
        p1.doDestroy(b1); 
        
        p1.doDestroy(b1); 

        System.out.println("\n--- Status Akhir ---");
        System.out.println(wz1.getDestroyableInfo());
        System.out.println(jz1.getDestroyableInfo());
        System.out.println(b1.getDestroyableInfo());
    }
}