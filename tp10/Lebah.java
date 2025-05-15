
package tp10;

public class Lebah extends Serangga implements BisaTerbang {
    private Koordinat3D posisi;

    public Lebah(String warna, int x, int y, int z) {
        super(warna, x, y);
        this.posisi = new Koordinat3D(x, y, z);
    }

    @Override
    public void gerak(int[] sumbu) {
        this.posisi.setX(sumbu[0]);
        this.posisi.setY(sumbu[1]);
        this.posisi.setZ(sumbu[2]);
    }

    @Override
    public void info() {
        System.out.println("Posisi Lebah: X = " + posisi.getX() + ", Y = " + posisi.getY() + ", Z = " + posisi.getZ());
    }

    @Override
    public void terbang(int[] posisiBaru) {
        this.posisi.setX(posisiBaru[0]);
        this.posisi.setY(posisiBaru[1]);
        this.posisi.setZ(posisiBaru[2]);
    }
}

