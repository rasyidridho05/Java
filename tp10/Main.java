package tp10;

public class Main {

    public static void main(String[] args) {
        Semut s = new Semut("hitam", 60, 80);
        System.out.println("Warna Semut : " + s.getWarna());
        s.info();
        s.gerak(new int[]{70, 90});
        s.info();

        Lebah l = new Lebah("kuning", 20, 30, 40);
        System.out.println("Warna Lebah : " + l.getWarna());
        l.info();
        l.terbang(new int[]{55, 65, 75});
        l.info();
        l.gerak(new int[]{25, 35, 45});
        l.info();
    }
}
