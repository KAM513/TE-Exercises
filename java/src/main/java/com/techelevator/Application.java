package com.techelevator;


import javax.print.attribute.standard.MediaSize;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {

    private List <Department> departments = new ArrayList <> ();
    private List <Employee> employees = new ArrayList <> ();
    private Map <String, Project> projects = new HashMap <> ();

    /**
     * The main entry point in the application
     *
     * @param args
     */
    public static void main(String[] args) {
        Application app = new Application ();
        app.run ();
    }

    private void run() {
        // create some departments
        createDepartments ();


        // print each department by name
        printDepartments ();

        // create employees
        createEmployees ();

        // give Angie a 10% raise, she is doing a great job!
        employees.get (1).raiseSalary (10);

        // print all employees
        printEmployees ();

        // create the TEams project
        createTeamsProject ();
        // create the Marketing Landing Page Project
        createLandingPageProject ();

        // print each project name and the total number of employees on the project
        printProjectsReport ();
    }

    /**
     * Create departments and add them to the collection of departments
     */
    private void createDepartments() {
        Department dept = new Department (1, "Marketing");
        departments.add (dept);
        dept = new Department (2, "Sales");
        departments.add (dept);
        dept = new Department (3, "Engineering");
        departments.add (dept);
    }

    /**
     * Print out each department in the collection.
     */
    private void printDepartments() {
        System.out.println ("------------- DEPARTMENTS ------------------------------");
        for (Department department : departments) {
            System.out.println (department.getName ());
        }

    }

    /**
     * Create employees and add them to the collection of employees
     */
    private void createEmployees() {
        Employee thisEmployee = new Employee (1, "Dean", "Johnson",
                "djohnson@teams.com", departments.get (2), "08/21/2020"
        );
        employees.add (thisEmployee);
        thisEmployee = new Employee (2, "Angie", "Smith",
                "asmith@teams.com", departments.get (2), "08/21/2020"
        );
        employees.add (thisEmployee);
        thisEmployee = new Employee (3, "Margaret", "Thompson",
                "mthompson@teams.com", departments.get (0), "08/21/2020"
        );
        employees.add (thisEmployee);

    }

    /**
     * Print out each employee in the collection.
     */
    private void printEmployees() {
        System.out.println ("\n------------- EMPLOYEES ------------------------------");
        for (Employee employee : employees) {
            NumberFormat currency = NumberFormat.getCurrencyInstance ();
            double thisSalary = employee.getSalary ();
            String departmentName = employee.getDepartment().getName();
            System.out.println (employee.getFullName () + " (" + currency.format(thisSalary) + ") " + departmentName);
        }
    }

    /**
     * Create the 'TEams' project.
     */
    private void createTeamsProject() {
        Project thisProject = new Project ("TEams", "Project Management Software", "10/10/2020", "11/10/2020");
        for (Employee employee : employees) {
            if (employee.getDepartment ().equals (departments.get (2))) {
                thisProject.setTeamMembers (employee);
            }
        }
        projects.put (thisProject.getName (), thisProject);
    }


    /**
     * Create the 'Marketing Landing Page' project.
     */
    private void createLandingPageProject() {
        Project project2 = new Project ("Marketing Landing Page", "Lead Capture Landing Page for Marketing", "10/10/2020", "10/17/2020");
        for (Employee employee : employees) {
            if (employee.getDepartment ().equals (departments.get (0))) {
                project2.setTeamMembers (employee);
            }
        }
        projects.put (project2.getName (), project2);

    }

    /**
     * Print out each project in the collection.
     */
    private void printProjectsReport() {
        System.out.println ("\n------------- PROJECTS ------------------------------");
        for (Map.Entry<String, Project> project : projects.entrySet ()) {
            int numberOfTeamMembers = project.getValue().getTeamMembers().size ();
            String nameOfProject = project.getKey();
            System.out.println (nameOfProject + ": " + numberOfTeamMembers);
        }
    }

}
