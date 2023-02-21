package Kursovaya;

public class Employee {
    private String firstName;
    private String middleName;
    private String lastName;
    private float salary;
    private int id;
    private int dept;
    private static int countID;

    public Employee(String firstName, String middleName, String lastName, int dept, float salary) {
        //this(firstName, middleName, lastName, salary, 0);
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dept = dept;
        this.salary = salary;
        this.id = countID;
        countID++;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getMiddleName() {
        return middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    public float getSalary() {
        return salary;
    }

    public void setDept(int dept) {
        this.dept = dept;
    }
    public int getDept() {
        return dept;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "Имя " + firstName + " Отчество " + middleName + " фамилия " + lastName + " отдел " + dept + " ЗП " + salary;
    }
}