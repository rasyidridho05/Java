package Polimorpisme;

public class Staff extends Pegawai {

    private static final int gajiStaf = 50000;
    private static final int bonusStaf = 10000;

    @Override
    public int gaji() {
        return gajiStaf;
    }

    public int Bonus() {
        return bonusStaf;
    }
    Staff(String nm){
        this.nama = nm;
        System.out.println("Nama Staff\t:"+nm);
        
    }
}


