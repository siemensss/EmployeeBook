package coursework;

public class EmployeeBook {
    private Employee[] employees;

    public EmployeeBook(Employee[] employees) {
        this.employees = employees;
    }

    public void getListOfAllEmployees() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
    }

    public double countSumOfSalaries() {
        double sumOfSalaries = 0;
        for (int i = 0; i < employees.length; i++) {
            sumOfSalaries = sumOfSalaries + employees[i].getSalary();
        }
        return sumOfSalaries;
    }

    public Employee findEmployeeWithMinSalary() {
        double minSalary = employees[0].getSalary();
        int i = 0;
        for (; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
            }
        }
        i = 0;
        while (i < employees.length) {
            if (minSalary == employees[i].getSalary()) {
                break;
            }
            i++;
        }
        return employees[i];
    }

    public Employee findEmployeeWithMaxSalary() {
        double maxSalary = employees[0].getSalary();
        int i = 0;
        for (; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
            }
        }
        i = 0;
        while (i < employees.length) {
            if (maxSalary == employees[i].getSalary()) {
                break;
            }
            i++;
        }
        return employees[i];
    }

    public double countAverageSalary() {
        double sumOfSalaries = 0;
        for (int i = 0; i < employees.length; i++) {
            sumOfSalaries = sumOfSalaries + employees[i].getSalary();
        }
        return sumOfSalaries / employees.length;
    }

    public void getNameOfAllEmployees() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Сотрудник " + (i + 1) + ": " + employees[i].getName());
        }
    }

    public void printSeparator() {
        System.out.println("=======================");
    }

    public void increaseSalary(double percent) {
        percent = percent / 100;
        double totalSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            totalSalary = employees[i].getSalary() + (employees[i].getSalary() * percent);
            employees[i].setSalary(totalSalary);
        }
    }

    public Employee getEmployeeWithMinSalaryInSpecificDepartment(int department) {
        int j = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                j++;
            }
        }
        Employee[] employeesSameDepartment = new Employee[j];
        j = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                employeesSameDepartment[j] = employees[i];
                j++;
            }
        }
        j = 0;
        double minSalary = employeesSameDepartment[j].getSalary();
        while (j < employeesSameDepartment.length) {
            if (employeesSameDepartment[j].getSalary() < minSalary) {
                minSalary = employeesSameDepartment[j].getSalary();
            }
            j++;
        }
        j = 0;
        while (j < employeesSameDepartment.length) {
            if (minSalary == employeesSameDepartment[j].getSalary()) {
                break;
            }
            j++;
        }

        return employeesSameDepartment[j];
    }

    public Employee getEmployeeWithMaxSalaryInSpecificDepartment(int department) {
        int j = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                j++;
            }
        }
        Employee[] employeesSameDepartment = new Employee[j];
        j = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                employeesSameDepartment[j] = employees[i];
                j++;
            }
        }
        j = 0;
        double maxSalary = employeesSameDepartment[j].getSalary();
        while (j < employeesSameDepartment.length) {
            if (employeesSameDepartment[j].getSalary() > maxSalary) {
                maxSalary = employeesSameDepartment[j].getSalary();
            }
            j++;
        }
        j = 0;
        while (j < employeesSameDepartment.length) {
            if (maxSalary == employeesSameDepartment[j].getSalary()) {
                break;
            }
            j++;
        }

        return employeesSameDepartment[j];
    }

    public double countSumOfSalariesInSpecificDepartment(int department) {
        double sumOfSalaries = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                sumOfSalaries = sumOfSalaries + employees[i].getSalary();
            }
        }
        return sumOfSalaries;
    }

    public double countAverageSalaryInSpecificDepartment(int department) {
        double sumOfSalaries = 0;
        int j = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                sumOfSalaries = sumOfSalaries + employees[i].getSalary();
                j++;
            }
        }
        return sumOfSalaries / j;
    }

    public void increaseSalaryInSpecificDepartment(int department, double percent) {
        percent = percent / 100;
        double totalSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                totalSalary = employees[i].getSalary() + (employees[i].getSalary() * percent);
                employees[i].setSalary(totalSalary);
            }
        }
    }

    public void getInformationAboutAllEmployeesInSpecificDepartment(int department) {
        int j = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                System.out.println("--------------------\n" + (j + 1) + ". Сотрудник с id: " + employees[i].getId() + "\nФ.И.О.: " + employees[i].getName() + "\nЗарплата: " + employees[i].getSalary() + "\n--------------------");
                j++;
            }
        }
    }

    public void getAllEmployeesWithSalaryLessThenLimit(double salaryLimit) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < salaryLimit) {
                System.out.println("--------------------\n" + "Сотрудник с id: " + employees[i].getId() + "\nФ.И.О.: " + employees[i].getName() + "\nЗарплата: " + employees[i].getSalary() + "\n--------------------");
            }
        }
    }

    public void getAllEmployeesWithSalaryGreaterThenLimit(double salaryLimit) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() >= salaryLimit) {
                System.out.println("--------------------\n" + "Сотрудник с id: " + employees[i].getId() + "\nФ.И.О.: " + employees[i].getName() + "\nЗарплата: " + employees[i].getSalary() + "\n--------------------");
            }
        }
    }

    public void addEmployee (Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
            }
        }
    }
    public void deleteEmployee (String name, int id) {
        for (int i = 0; i < employees.length; i++) {
            if ((employees[i].getName().equals(name)) && (employees[i].getId() == id)) {
                employees[i] = null;
            }
        }
    }
    public void editEmployee (String nameEmployee, int department, double salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().equals(nameEmployee)){
                if (department > 0 && department < 6){
                    employees[i].setDepartment(department);
                } else {
                    throw new IllegalArgumentException("Такого отдела нет!!!");
                }
                if (salary > 0){
                    employees[i].setSalary(salary);
                } else {
                    throw new IllegalArgumentException("Некорректное значение зарплаты!");
                }
            }
        }
    }
    public void getNameEmployeesForEachDepartment () {
        System.out.println("Отдел №1, имена сотрудников:");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == 1){
                System.out.println(employees[i].getName());
            }
        }
        System.out.println();
        System.out.println("Отдел №2, имена сотрудников:");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == 2){
                System.out.println(employees[i].getName());
            }
        }
        System.out.println();
        System.out.println("Отдел №3, имена сотрудников:");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == 3){
                System.out.println(employees[i].getName());
            }

        }
        System.out.println();
        System.out.println("Отдел №4, имена сотрудников:");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == 4){
                System.out.println(employees[i].getName());
            }

        }
        System.out.println();
        System.out.println("Отдел №5, имена сотрудников:");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == 5){
                System.out.println(employees[i].getName());
            }
        }

    }

}
