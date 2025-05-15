package tp10;

public class Serangga {

    private int jumlahKaki;
    private String warna;
    private Koordinat posisi;

    public Serangga(String warna, int x, int y) {
        this.warna = warna;
        this.posisi = new Koordinat(x, y) {
        };
    }

    public void gerak(int[] sumbu) {
        this.posisi.setX(sumbu[0]);
        this.posisi.setY(sumbu[1]);
    }

    public int getJumlahKaki() {
        return jumlahKaki;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void info() {
        
    }
}
