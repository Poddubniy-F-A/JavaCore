package HW4;

public class Employee {
    public enum Gender {
        MALE, FEMALE
    }

    private final Gender gender;
    private final String firstName, lastName;

    public Employee(Gender gender, String firstName, String lastName) {
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
