// Author: Daniel Flesch
// Date 3/20/24
// Class is used to make an employee and their salary, it can also raise their salary.

public class Employee {
    private String name;
    private double salary;

    /** Constructs a new Employee with the given name and salary.
     *
     * @param employeeName the name of the employee
     * @param currentSalary the current salary of the employee
     */
    public Employee(String employeeName, double currentSalary) {
        this.name = employeeName;
        this.salary = currentSalary;
    }

    /** Raises the salary of this employee by the specified percent.
     *
     * @param byPercent the percentage by which to raise the salary
     */    
    public void raiseSalary(double byPercent) {
        salary = salary + (salary * byPercent / 100);
    }

    /** Returns the name of this employee.
     *
     * @return the name of this employee
     */   
    public String getName() {
        return name;
    }

    /** Returns the salary of this employee.
     *
     * @return the salary of this employee
     */
    public double getSalary() {
        return salary;
    }
}