public class EmployeeTester {
    public static void main(String[] args) {
        // Create an instance of Employee
        Employee employee = new Employee("Bill Smith", 50000);

        // Test the getName() method
        String name = employee.getName();
        System.out.println("Name: " + name);

        // Test the getSalary() method
        double salary = employee.getSalary();
        System.out.println("Salary: " + salary);

        // Test the raiseSalary() method
        employee.raiseSalary(10);
        System.out.println("New Salary: " + employee.getSalary());
    }
}