import java.util.Scanner;

public class ArrayEmplyee {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        Employee employee1 = createEmployee();
        Employee employee2 = createEmployee();

        employees[0] = employee1;
        employees[1] = employee2;

        System.out.println(employees[0].toString());
        System.out.println(employees[1].toString());

        double allPayment = employees[0].payment + employees[1].payment;
        System.out.println("Suma wypłat: " + allPayment + "zł");

    }

    private static Employee createEmployee() {
        Scanner scan = new Scanner(System.in);
        System.out.println("podaj imię pracownika: ");
        String name = scan.nextLine();

        System.out.println("Nazwisko: ");
        String lastName = scan.nextLine();

        System.out.println("Wypłata: ");
        double payment = scan.nextDouble();
        return new Employee(name, lastName, payment);
    }
}
