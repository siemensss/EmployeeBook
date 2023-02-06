package coursework;

public class Main {
    private Employee[] employees = new Employee[10];

    public static void getAListOfAllEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
    }

    public static int countTheAmountOfSalaries(Employee[] employees) {
        int sumOfSalaries = 0;
        for (int i = 0; i < employees.length; i++) {
            sumOfSalaries = sumOfSalaries + employees[i].getSalary();
        }
        return sumOfSalaries;
    }

    public static Employee FindAnEmployeeWithAMinSalary(Employee[] employees) {
        int minSalary = employees[0].getSalary();
        int i = 0;
        for (; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
            }
        }
        i = 0;
        while (i<employees.length){
            if (minSalary == employees[i].getSalary()){
                break;
            }
            i++;
        }
            return employees[i];
    }
    public static void main (String [] args){

    }

}
