public class Employee {
    String firstName;
    String lastName;
    double payment;

    public Employee(String firstName, String lastName, double payment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", payment=" + payment +
                '}';
    }
}
