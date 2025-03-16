/*Employee Management System
//Employee:
//Members:
//Employee name,sal,address,ph:15
//insert() ,print()*/

import java.util.Scanner;

class Employee {
    private String name;
    private double salary;
    private String address;
    private String phone;

    // Constructor
    public Employee(String name, double salary, String address, String phone) {
        this.name = name;
        this.salary = salary;
        this.address = address;
        this.phone = phone;
    }

    // Method to print employee details
    public void print() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("---------------------------");
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array to store Employee objects
        Employee[] employees = new Employee[3]; // Change size as needed

        // Insert Employee details
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine(); // Consume newline

            System.out.print("Enter Address: ");
            String address = sc.nextLine();

            System.out.print("Enter Phone: ");
            String phone = sc.nextLine();

            // Create Employee object and store in array
            employees[i] = new Employee(name, salary, address, phone);
        }

        // Print Employee details
        System.out.println("\nEmployee Details:");
        for (Employee emp : employees) {
            emp.print();
        }

        
    }
}
