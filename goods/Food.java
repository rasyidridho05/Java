package goods;

public class Food extends PassangerGoods {

    private double weight;

    public Food(String name, int quantity, double price, double weight) {
        super(name, quantity, price);
        this.weight = weight;
    }

    @Override
    protected double calculatePrice() {
        return quantity * weight * price;
    }

    @Override
    public void displayDetail() {
        System.out.println("---------");
        System.out.println("Makanan " + name + " berat " + weight + "-gram, berjumlah " + quantity + ", \ntotal harga Rp " + (int) (calculatePrice()));
    }

}
