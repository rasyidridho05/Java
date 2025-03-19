package case_based_1;

public class Employee {

    private String id;
    private String name;
    private Department department;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        if (this.department != null) {
            this.department.deleteEmployee(this);
        }
        if (department.canAddEmployee()) {
            this.department = department;
            department.addEmployee(this);
            
        }
    }

    public String toString() {
        return id + " " + name + " " + (department != null ? department.getName() : "No Department");
    }
}
