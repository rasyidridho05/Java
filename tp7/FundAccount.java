
package tp7;
public class FundAccount extends Account {
    private double earningRate;

    public FundAccount(String number, String name, int balance, double earningRate) {
        super(number, name, balance);
        this.earningRate = earningRate;
    }

    public double getEarningRate() {
        return earningRate;
    }

    public void earnMoney() {
        System.out.println("Keuntungan telah diperoleh.");
    }

    @Override
    public void openAccount() {
        System.out.println("Buka Akun.");
        System.out.println("Nomor rekening: " + getNumber());
        System.out.println("Pemilik akun: " + getName());
        System.out.println("Saldo: Rp. " + String.format("%,d", getBalance()));
        System.out.println("Tingkat pengembalian: " + earningRate + "%");
        earnMoney();
    }
}
