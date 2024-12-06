package Polimorpisme;

 class PembayaranGaji {

    public int hitungGaji(Pegawai peg) {
        int uang = peg.gaji();
        if (peg instanceof Direktur) {
            uang += ((Direktur) peg).tunjangan();
        }

        if (peg instanceof Staff) {
            uang += ((Staff) peg).Bonus();
        }

        if (peg instanceof CEO) {
            uang += ((CEO) peg).Tunjangan();
        }
        return uang;

    }

    public static void main(String[] args) {
        PembayaranGaji pg = new PembayaranGaji();
        Staff ali = new Staff("ali");
        Direktur Tony = new Direktur("Tony");
        CEO Rasyid = new CEO("Rasyid");
        
        System.out.println("gaji staf\t= " + pg.hitungGaji(ali));
        System.out.println("gaji direktur\t= " + pg.hitungGaji(Tony));
        System.out.println("gaji direktur\t= " + pg.hitungGaji(Rasyid));
    }
}
