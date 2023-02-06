package coursework;

public class Main {
    private static Employee[] employees = new Employee[10];


    public static void getListOfAllEmployees() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
    }

    public static double countSumOfSalaries() {
        double sumOfSalaries = 0;
        for (int i = 0; i < employees.length; i++) {
            sumOfSalaries = sumOfSalaries + employees[i].getSalary();
        }
        return sumOfSalaries;
    }

    public static Employee findEmployeeWithMinSalary() {
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

    public static Employee findEmployeeWithMaxSalary() {
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

    public static double countAverageSalary() {
        double sumOfSalaries = 0;
        for (int i = 0; i < employees.length; i++) {
            sumOfSalaries = sumOfSalaries + employees[i].getSalary();
        }
        return sumOfSalaries / employees.length;
    }

    public static void getNameOfAllEmployees() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Сотрудник " + (i + 1) + ": " + employees[i].getName());
        }
    }

    public static void printSeparator() {
        System.out.println("=======================");
    }

    public static void increaseSalary(double percent) {
        percent = percent / 100;
        double totalSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            totalSalary = employees[i].getSalary() + (employees[i].getSalary() * percent);
            employees[i].setSalary(totalSalary);
        }
    }

    public static Employee getEmployeeWithMinSalaryInSpecificDepartment(int department) {
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

    public static Employee getEmployeeWithMaxSalaryInSpecificDepartment(int department) {
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

    public static double countSumOfSalariesInSpecificDepartment(int department) {
        double sumOfSalaries = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                sumOfSalaries = sumOfSalaries + employees[i].getSalary();
            }
        }
        return sumOfSalaries;
    }

    public static double countAverageSalaryInSpecificDepartment(int department) {
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

    public static void increaseSalaryInSpecificDepartment(int department, double percent) {
        percent = percent / 100;
        double totalSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                totalSalary = employees[i].getSalary() + (employees[i].getSalary() * percent);
                employees[i].setSalary(totalSalary);
            }
        }
    }

    public static void getInformationAboutAllEmployeesInSpecificDepartment(int department) {
        int j = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                System.out.println("--------------------\n" + (j + 1)+". Сотрудник с id: " +employees[i].getId() + "\nФ.И.О.: " + employees[i].getName() + "\nЗарплата: " + employees[i].getSalary() + "\n--------------------");
                j++;
            }
        }
    }
    public static void getAllEmployeesWithSalaryLessThenLimit (double salaryLimit){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < salaryLimit) {
                System.out.println("--------------------\n" + "Сотрудник с id: " +employees[i].getId() + "\nФ.И.О.: " + employees[i].getName() + "\nЗарплата: " + employees[i].getSalary() + "\n--------------------");
            }
        }
    }
    public static void getAllEmployeesWithSalaryGreaterThenLimit (double salaryLimit){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() >= salaryLimit) {
                System.out.println("--------------------\n" + "Сотрудник с id: " +employees[i].getId() + "\nФ.И.О.: " + employees[i].getName() + "\nЗарплата: " + employees[i].getSalary() + "\n--------------------");
            }
        }
    }

    public static void main(String[] args) {
        employees[0] = new Employee("Филатов Игорь Михайлович", 44200, 2);
        employees[1] = new Employee("Петров Иван Алексеевич", 38500, 4);
        employees[2] = new Employee("Козлов Александр Иванович", 53100, 1);
        employees[3] = new Employee("Левин Алексей Антонович", 55600, 3);
        employees[4] = new Employee("Востриков Илья Владимирович", 60000, 5);
        employees[5] = new Employee("Шубин Бенедикт Валерьевич", 72650, 3);
        employees[6] = new Employee("Фомин Максимилиан Игоревич", 31550, 5);
        employees[7] = new Employee("Шаров Алан Максимович", 47900, 4);
        employees[8] = new Employee("Якушев Ипполит Егорович", 58200, 1);
        employees[9] = new Employee("Марков Юстин Матвеевич", 62150, 2);
        printSeparator();
        System.out.println("Список всех сотрудников:");
        getListOfAllEmployees();
        printSeparator();
        System.out.println("Сумма всех зарплат: " + countSumOfSalaries());
        printSeparator();
        System.out.println("Сотрудник с минимальной зарплатой:\n" + findEmployeeWithMinSalary().toString());
        printSeparator();
        System.out.println("Сотрудник с максимальной зарплатой:\n" + findEmployeeWithMaxSalary().toString());
        printSeparator();
        System.out.println("Средняя зарплата: " + countAverageSalary());
        printSeparator();
        System.out.println("Имена всех сотрудников: ");
        getNameOfAllEmployees();
        printSeparator();
        int department = 2;
        System.out.println("Сотрудник с минимальной зарплатой в отделе № " + department + ":\n" + getEmployeeWithMinSalaryInSpecificDepartment(department).toString());
        printSeparator();
        System.out.println("Сотрудник с максимальной зарплатой в отделе № " + department + ":\n" + getEmployeeWithMaxSalaryInSpecificDepartment(department).toString());
        printSeparator();
        System.out.println("Сумма всех зарплат по отделу № " + department + ": " + countSumOfSalariesInSpecificDepartment(department));
        printSeparator();
        System.out.println("Средняя зарплата по отделу № " + department + ": " + countAverageSalaryInSpecificDepartment(department));
        printSeparator();
        System.out.println("Информация о сотрудниках из отдела № " + department + ":");
        getInformationAboutAllEmployeesInSpecificDepartment(department);
        printSeparator();
        double limit = 50000;
        System.out.println("Список сотрудников с зарплатой меньше заданного числа (" + limit + "):");
        getAllEmployeesWithSalaryLessThenLimit(limit);
        printSeparator();
        System.out.println("Список сотрудников с зарплатой больше (или равно) заданного числа (" + limit + "):");
        getAllEmployeesWithSalaryGreaterThenLimit(limit);
        printSeparator();
    }

}
