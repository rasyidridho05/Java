package Polimorpisme;

public class CEO extends Pegawai{
    private static final int gajiCEO = 10000000;
    private static final int tunjanganCEO = 50000000;


    
    public int gaji() {
        return gajiCEO;
    }

    public int Tunjangan() {
        return tunjanganCEO;
    }
    
    CEO(String nm){
        this.nama = nm;
        System.out.println("Nama CEO\t:"+nm);
    }
    
}
