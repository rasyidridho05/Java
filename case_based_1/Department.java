package case_based_1;

import java.util.ArrayList;

public class Department {

    private String id;
    private String name;
    private int maxNum;
    private ArrayList<Employee> employeeList;

    public Department(String id, String name, int maxNum) {
        this.id = id;
        this.name = name;
        this.maxNum = maxNum;
        this.employeeList = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxNum() {
        return maxNum;
    }

    public int getEmployeeCount() {
        return employeeList.size();
    }

    public void addEmployee(Employee employee) {
        if (canAddEmployee()) {
            employeeList.add(employee);
        }
    }

    public boolean canAddEmployee() {
        return employeeList.size() < maxNum;
    }

    public void deleteEmployee(Employee employee) {
        employeeList.remove(employee);
    }

    public void printEmployeeList() {
        System.out.println("Anggota " + name + " (Total " + getEmployeeCount() + " Orang)");
        System.out.printf("%-10s | %-20s | %-15s\n", "ID", "Nama", "Departemen");
        System.out.println("--------------------------------------------------");
        for (Employee e : employeeList) {
            System.out.printf("%-10s | %-20s | %-15s\n", e.getId(), e.getName(), name);
        }
        System.out.println();
    }
}
