public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Anna Kowalska", 3000);
        employees[1] = new Employee("Marek Daniel", 2000);
        employees[2] = new Employee("Alicja Brown", 2500);
        employees[3] = new Employee("Bob Budowniczy", 4000);
        employees[4] = new Employee("Dawid Satyra", 3500);

        System.out.println("Data of Emplyee number 3:");
        System.out.println(employees[3]);

        employees[3].setSalary(5000);

        System.out.println("Data of all employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}