package HW4;

import HW4.Employee.Gender;

public class Main {
    private enum DateType {
        NONE, NEW_YEAR, MARCH_8, FEBRUARY_23
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new Employee(Gender.FEMALE, "Anna", "Berezkina"),
                new Employee(Gender.FEMALE, "Olga", "Lapochkina"),
                new Employee(Gender.MALE, "Anatoliy", "Radin"),
                new Employee(Gender.MALE, "Sergey", "Raskolnikov"),
                new Employee(Gender.FEMALE, "Irina", "Volkova")
        };

        for (DateType today : DateType.values()) {
            congratulate(employees, today);
        }
    }

    private static void congratulate(Employee[] employees, DateType today) {
        switch (today) {
            case DateType.NEW_YEAR -> {
                for (Employee employee : employees) {
                    System.out.println("Happy New Year, " + employee);
                }
            }
            case DateType.MARCH_8 -> {
                for (Employee employee : employees) {
                    if (employee.getGender().equals(Gender.FEMALE)) {
                        System.out.println("Happy Women's Day, " + employee);
                    }
                }
            }
            case DateType.FEBRUARY_23 -> {
                for (Employee employee : employees) {
                    if (employee.getGender().equals(Gender.MALE)) {
                        System.out.println("Happy Defender of the Fatherland Day, " + employee);
                    }
                }
            }
        }
    }
}
