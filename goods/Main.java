package goods;

public class Main {

    public static void main(String[] args) {
        PassangerGoods electro = new Electronic("Smartphone", 2, 18000000.0, "iPhone 20");
        PassangerGoods food = new Food("Lamington", 4, 750.0, 350.0);
        PassangerGoods cigarette = new Cigarette("Dunhill Blue", 30, 60000.0, 20);
        
        electro.displayDetail();
        food.displayDetail();
        cigarette.displayDetail();
    }
}
