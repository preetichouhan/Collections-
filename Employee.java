package com.arrayOfObjects;

	 public class Employee {
		    private int id;
		    private String name;
		    private double salary;

		    public Employee(int id, String name, double salary) {
		        this.id = id;
		        this.name = name;
		        this.salary = salary;
		    }

		    public int getId() {
		        return id;
		    }

		    public String getName() {
		        return name;
		    }

		    public double getSalary() {
		        return salary;
		    }
		}

		public class Main {
		    public static void main(String[] args) {
		        Employee[] employees = new Employee[3];

		        employees[0] = new Employee(1, "John Doe", 50000);
		        employees[1] = new Employee(2, "Jane Doe", 60000);
		        employees[2] = new Employee(3, "Richard Roe", 70000);

		        for (Employee employee : employees) {
		            System.out.println("Employee ID: " + employee.getId());
		            System.out.println("Employee Name: " + employee.getName());
		            System.out.println("Employee Salary: " + employee.getSalary());
		            System.out.println();
		        }
		    }
		}
