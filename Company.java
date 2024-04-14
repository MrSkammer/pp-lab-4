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

        int countOfEmployees = 0;
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                countOfEmployees++;
            }
        }
        
        System.out.println(countOfEmployees);

        Manager manager = (Manager) employees [0];
        manager.setNumberOfSubordinates((countOfEmployees));

        System.out.println("Data of Employee number 3:");
        System.out.println(employees[3]);

        employees[3].setSalary(5000);
        employees[0].setSalary(7500);

        System.out.println("Data of all employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}