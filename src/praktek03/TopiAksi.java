package Praktek03;
public class TopiAksi {
    public static void main(String[] args) {
        Topi t = new Topi();
        t.setMerk="Okley";
        t.setWarna="Hijau";
        t.setHarga=15000;
        
        t.cetakInfo();
        
        System.out.print("Merknya \t: ");
        System.out.println(t.getMerk());
        System.out.print("warnanya \t: ");
        System.out.println(t.getWarna());
        System.out.print("Harganya \t: ");
        System.out.println(t.getHarga());
    }
    
}
