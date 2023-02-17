package Kursovaya;

public class Employee {
    private String firstName;
    private String middleName;
    private String lastName;
    private float salary;
    private int id;

    public Employee(String firstName, String middleName, String lastName, float salary) {
        //this(firstName, middleName, lastName, salary, 0);
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.salary = salary;
        this.id = 0;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public float getSalary() {
        return this.salary;
    }

    public int getID() {
        return this.id;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String toString() {
        return "Имя " + firstName + " Отчество " + middleName + " фамилия " + lastName;
    }

}