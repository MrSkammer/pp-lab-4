import employees.Employee;
import employees.*;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("Anna Kowalska", 3000, 0);
        employees[1] = new Worker("Marek Daniel", 2000, "Dev");
        employees[2] = new Employee("Alicja Brown", 2500);
        employees[3] = new Employee("Bob Budowniczy", 4000);
        employees[4] = new Worker("Dawid Satyra", 3500, "Builder");

        System.out.println("Data of Emplyee number 3:");
        System.out.println(employees[3]);

        employees[3].setSalary(5000);

        System.out.println("Data of all employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}