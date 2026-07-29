package Oops;


class Employee {

    String name = "Sahana";
    int salary = 200000;

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

public class Main {

    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.display();

    }
}