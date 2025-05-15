package Customer;

import java.util.HashMap;
import java.util.ArrayList;

public class CustomerBiz implements ICustomerBiz {

    private ArrayList<Customer> customers = new ArrayList<>();

    public void initializeCustomer() {
        HashMap<String, String> phone1 = new HashMap<>();
        phone1.put("HP", "010-5678-1234");
        phone1.put("OFFICE", "010-2132-9876");
        customers.add(new Customer("Lee", 28, phone1));

        HashMap<String, String> phone2 = new HashMap<>();
        phone2.put("HP", "010-4567-9876");
        phone2.put("OFFICE", "010-1234-5678");
        customers.add(new Customer("Park", 31, phone2));

        HashMap<String, String> phone3 = new HashMap<>();
        phone3.put("HP", "010-8888-9999");
        phone3.put("OFFICE", "010-1111-2222");
        customers.add(new Customer("Choi", 25, phone3));
        
        HashMap<String, String> phone4 = new HashMap<>();
        phone4.put("HP", "010-4679-8520");
        phone4.put("OFFICE", "010-4679-8522");
        customers.add(new Customer("Hong", 27, phone4));
    }

    public void printAllCustomer() {
        System.out.println("---------------- informasi pelanggan ----------------------");
        for (int i = 0; i < customers.size(); i++) {
            Customer c = customers.get(i);
            System.out.print((i + 1) + ". nama : " + c.getName());
            System.out.print("\tusia : " + c.getAge());
            System.out.print("\tNo telepon : ");
            for (String key : c.getPhone().keySet()) {
                System.out.print("[" + key + "] " + c.getPhone().get(key));
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------");
    }

    public void insertCustomer(String name, int age, HashMap<String, String> phone) {
        customers.add(new Customer(name, age, phone));
    }

    public void changeAge(int number, int age) {
        customers.get(number - 1).setAge(age);
    }

    public void changePhone(int number, HashMap<String, String> phone) {
        customers.get(number - 1).setPhone(phone);
    }

    public void deleteCustomer(int number) {
        customers.remove(number - 1);
    }

    public int getCustomerNumber() {
        return customers.size();
    }
}
