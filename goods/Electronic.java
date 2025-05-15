package goods;

public class Electronic extends PassangerGoods implements Taxable {

    private String type;

    public Electronic(String name, int quantity, double price, String type) {
        super(name, quantity, price);
        this.type = type;
    }

    @Override
    protected double calculatePrice() {
        return quantity * price;
    }

    @Override
    public void displayDetail() {
        System.out.println("---------");
        System.out.println("Nama barang " + name + " dengan tipe " + type + " berjumlah " + quantity + " \ndengan total harga Rp " + (int) (calculatePrice()) + " dan dengan total pajak Rp " + (int) (calculateTax()));
    }

    @Override
    public double calculateTax() {
        return (calculatePrice() - 7500000) * TAX_RATE;
    }

}
