package HW3;

public class Employee {
    private final int birthDay, birthMonth, birthYear;
    private int salary;

    public int compare(Employee employee) {
        return 100 * (
                100 * (birthYear - employee.getBirthYear()) + birthMonth - employee.getBirthMonth()
        ) + birthDay - employee.getBirthDay();
    }

    public Employee(int birthDay, int birthMonth, int birthYear, int salary) {
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.salary = salary;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "birthday:" + birthYear + "-" + birthMonth + "-" + birthDay +
                ", salary=" + salary +
                '}';
    }
}
