
package tp10;

public class Semut extends Serangga {
    private Koordinat posisi;

    public Semut(String warna, int x, int y) {
        super(warna, x, y);
        this.posisi = new Koordinat(x, y) {};
    }

    @Override
    public void gerak(int[] sumbu) {
        this.posisi.setX(sumbu[0]);
        this.posisi.setY(sumbu[1]);
    }

    @Override
    public void info() {
        
        System.out.println("Posisi Semut: X = " + posisi.getX() + ", Y = " + posisi.getY());
    }
}

