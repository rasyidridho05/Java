package tp12;

public class Student {

    private String name;
    private int bahasa;
    private int english;
    private int math;

    public Student(String name, int bahasa, int english, int math) {
        this.name = name;
        this.bahasa = bahasa;
        this.english = english;
        this.math = math;
    }

    public String toString() {
        return name + " (Bahasa Indonesia: " + bahasa
                + ", Bahasa Inggris: " + english
                + ", Matematika: " + math + " )";
    }
}
