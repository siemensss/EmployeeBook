package coursework;

public class Employee {
    private String name;
    private int salary;
    private int department;
    private int id;
    private static int countId;

    public Employee(String name, int salary, int department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        id = countId++;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "--------------------\nСотрудник с id: " + id + "\nФ.И.О.: " + name + "\nОтдел №: " + department + "\nЗарплата: " + salary +"\n--------------------";

    }
}
