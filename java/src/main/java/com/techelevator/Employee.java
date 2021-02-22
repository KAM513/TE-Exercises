package com.techelevator;

public class Employee {
    private long employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private double salary;
    private Department department;
    private String hireDate;
    private final static double DEFAULT_SALARY = 60_000;

    public long getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return salary;
    }

    public Department getDepartment() {
        return department;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public Employee(long employeeId, String firstName, String lastName, String email,
                    Department department, String hireDate) {
        setEmployeeId(employeeId);
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setDepartment(department);
        setHireDate(hireDate);
        setSalary(DEFAULT_SALARY);
    }

    public Employee(){
       setSalary(DEFAULT_SALARY);
    }

    public String getFullName() {
        return lastName + ", " + firstName;
    }

    public void raiseSalary(double percent){
        salary *= (1 +(percent / 100));
    }
















}
