package case_based_1;

public class Main {

    public static void main(String[] args) {
        String[] nameList = {"Skye Heredia", "Lucille Waltz", "Nichol Sutphin", "Vernia Caraway", "Rita Rangel",
            "Waldo Ontiveros", "Milton Grantham", "Loura Swilley", "Lola Duropan", "Kandis Mcnary",
            "Milford Kirts", "Denita Taniguchi", "Talia Fenderson", "Truman Daoust", "Alfonso Chaloux",
            "Fernanda Overby", "Cristy Yearby", "Daniell Pabst", "Bradley Newson", "Renda Maffei"};

        Department teknis = new Department("D1", "Tim Teknis", 100);
        Department keamanan = new Department("D2", "Tim Keamanan", 5);
        Department sdm = new Department("D3", "Tim SDM", 5);

        Employee[] employees = new Employee[nameList.length];

        for (int i = 0; i < nameList.length; i++) {
            employees[i] = new Employee("EMP" + (i + 1), nameList[i]);
            employees[i].setDepartment(teknis);
        }
        
        System.out.println("\nStatus Penetapan Awal");
        teknis.printEmployeeList();
        keamanan.printEmployeeList();
        sdm.printEmployeeList();

        for (Employee e : employees) {
            int id = Integer.parseInt(e.getId().substring(3));
            boolean move = false;
            if (id % 5 == 0 && keamanan.canAddEmployee()) {
                e.setDepartment(keamanan);
                move = true;
            } else if (id % 2 == 0 && sdm.canAddEmployee()) {
                e.setDepartment(sdm);
                move = true;
            }
            if(!move) {
                e.setDepartment(teknis);
            }
        }
        
        System.out.println("\nStatus Setelah Transfer");
        teknis.printEmployeeList();
        keamanan.printEmployeeList();
        sdm.printEmployeeList();
    }
}
