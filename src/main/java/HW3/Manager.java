package HW3;

public class Manager extends Employee {
    public Manager(int birthDay, int birthMonth, int birthYear, int salary) {
        super(birthDay, birthMonth, birthYear, salary);
    }
    
    public static void increaseSalary(Employee[] employees, int increment) {
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                employee.setSalary(employee.getSalary() + increment);
            }
        }
    }
}
