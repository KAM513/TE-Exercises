package com.techelevator;

public class Department {

//    attributes
    private int departmentId;
    private String name;

//    getters
    public int getDepartmentId() {
        return departmentId;
    }

    public String getName() {
        return name;
    }

//    setters
    public void setDepartmentId(int departmentId){
        this.departmentId = departmentId;
    }

    public void setName(String name) {
        this.name = name;
    }

//    constructors
    public Department(int departmentId, String name) {
        setDepartmentId(departmentId);
        setName(name);
    }
}
