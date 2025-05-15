package goods;

public abstract class PassangerGoods {

    protected String name;
    protected double price;
    protected int quantity;

    public PassangerGoods(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName(String name) {
        return name;
    }

    public double getPrice(double price) {
        return price;
    }

    public int getQuantity(int quantity) {
        return quantity;
    }

    protected abstract double calculatePrice();

    public abstract void displayDetail();

}
