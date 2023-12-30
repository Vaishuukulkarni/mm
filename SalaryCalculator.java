package test;

class User {
    int id;
    String name;


    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Employee extends User {
    double salary;

  
    public Employee(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }


    public double calculateAnnualSalary() {
        return salary * 12; 
    }
}

public class SalaryCalculator {
    public static void main(String[] args) {
      
        Employee employee = new Employee(1, "Arif Mujawar", 5000.0);

     
        double annualSalary = employee.calculateAnnualSalary();
        System.out.println("Employee ID: " + employee.id);
        System.out.println("Employee Name: " + employee.name);
        System.out.println("Monthly Salary: rs " + employee.salary);
        System.out.println("Annual Salary: rs " + annualSalary);
    }
}