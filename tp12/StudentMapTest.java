
package tp12;

import java.util.HashMap;
import java.util.Map;

public class StudentMapTest {
    public static void main(String[] args) {
        Map<String, Student> studentMap = new HashMap<>();

        studentMap.put("STU001", new Student("Darla", 80, 90, 95));
        studentMap.put("STU002", new Student("Rafi", 95, 89, 92));
        studentMap.put("STU003", new Student("Ahmad", 88, 97, 94));

        for (String key : studentMap.keySet()) {
            System.out.println(key + " - " + studentMap.get(key));
        }
    }
}
