package employees;

public class Manager extends Employee {
    
    public Manager(String fullName, double salary, int numberOfSubordinates) {
        super(fullName, salary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int numberOfSubordinates;

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public String toString() {
        return "Manager: " + getName() + ", Salary: " + getSalary() + ", Subordinates: " + numberOfSubordinates;
    }
}
