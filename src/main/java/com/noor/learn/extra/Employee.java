package com.noor.learn.extra;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author noor.shaik
 * @since 02-11-2026
 */
public class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("John","IT",80000);
        Employee emp2 = new Employee("David","HR",60000);
        Employee emp3 = new Employee("Mike","IT",95000);
        Employee emp4 = new Employee("Sarah","HR",75000);
        Employee emp5 = new Employee("Alex","Finance",90000);

        List<Employee> employees = List.of(emp1, emp2,emp3,emp4,emp5);

        Map<String, Double> result = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(
                                Employee::getSalary
                        )
                ));

        result.forEach((department, salaryAvarage) ->
                        System.out.println(
                                department + " -> " +
                                        " (" + salaryAvarage + ")"
                        )
        );
    }

}
