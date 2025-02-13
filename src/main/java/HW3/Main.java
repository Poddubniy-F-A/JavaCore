package HW3;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new Employee(5, 8, 1980, 10000),
                new Employee(6, 8, 1980, 10000),
                new Manager(21, 12, 2000, 25000)
        };

        Manager.increaseSalary(employees, 5000);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
