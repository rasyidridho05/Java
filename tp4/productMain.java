package tp4;

public class productMain {

    public static void main(String[] args) {
        product Laptop = new product("Laptop", 50, 15000000.0);
        product Mouse = new product("Mouse", 20, 100000.0);
        product Keyboard = new product("Keyboard", 100, 200000.0);

        manager pm = new manager();

        System.out.println("=====Information Product 1======");
        pm.printInfoProduct(Laptop);
        System.out.println("=====Information Product 2======");
        pm.printInfoProduct(Mouse);
        System.out.println("=====Information Product 3======");
        pm.printInfoProduct(Keyboard);
    }
}
