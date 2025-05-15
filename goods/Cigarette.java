package goods;

public class Cigarette extends PassangerGoods implements Taxable {

    private int piecesPerPax;

    public Cigarette(String name, int quantity, double price, int piecesPerPax) {
        super(name, quantity, price);
        this.piecesPerPax = piecesPerPax;
    }

    @Override
    protected double calculatePrice() {
        if (piecesPerPax < 12) {
            return quantity * price;
        } else if (piecesPerPax <= 24) {
            return quantity * price * 1.5;
        } else {
            return quantity * price * (piecesPerPax / 10);
        }
    }

    @Override
    public void displayDetail() {
        System.out.println("---------");
        System.out.println("Rokok " + name + " berjumlah " + quantity + " bungkus @" + piecesPerPax + " batang, \nharga Rp " + price + " pajak " + (int) (calculateTax()));
    }

    @Override
    public double calculateTax() {
        return calculatePrice() * TAX_RATE;
    }

}
