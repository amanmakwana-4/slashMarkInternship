package InterMediate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private String department;
    private String position;

    public Employee(int id, String name, String department, String position) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public void setName(String name2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setName'");
    }

    public void setDepartment(String department2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDepartment'");
    }

    public void setPosition(String position2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPosition'");
    }
}

public class employeeManagementApp {
    private List<Employee> employees;
    private Scanner scanner;

    public employeeManagementApp() {
        this.employees = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void addEmployee() {
        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter employee name: ");
        String name = scanner.next();
        System.out.print("Enter employee department: ");
        String department = scanner.next();
        System.out.print("Enter employee position: ");
        String position = scanner.next();

        Employee employee = new Employee(id, name, department, position);
        employees.add(employee);
        System.out.println("Employee added successfully!");
    }

    public void viewEmployees() {
        System.out.println("Employee List:");
        for (Employee employee : employees) {
            System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName() + ", Department: " + employee.getDepartment() + ", Position: " + employee.getPosition());
        }
    }

    public void updateEmployee() {
        System.out.print("Enter employee ID to update: ");
        int id = scanner.nextInt();
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                System.out.print("Enter new name: ");
                String name = scanner.next();
                System.out.print("Enter new department: ");
                String department = scanner.next();
                System.out.print("Enter new position: ");
                String position = scanner.next();

                employee.setName(name);
                employee.setDepartment(department);
                employee.setPosition(position);
                System.out.println("Employee updated successfully!");
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    public void deleteEmployee() {
        System.out.print("Enter employee ID to delete: ");
        int id = scanner.nextInt();
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employees.remove(employee);
                System.out.println("Employee deleted successfully!");
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    public static void main(String[] args) {
        employeeManagementApp app = new employeeManagementApp();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Employee Management Application");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    app.addEmployee();
                    break;
                case 2:
                    app.viewEmployees();
                    break;
                case 3:
                    app.updateEmployee();
                    break;
                case 4:
                    app.deleteEmployee();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
