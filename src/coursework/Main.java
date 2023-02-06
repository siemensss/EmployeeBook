package coursework;

public class Main {
    private static Employee[] employees = new Employee[10];


    public static void getListOfAllEmployees() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
    }

    public static int countSumOfSalaries() {
        int sumOfSalaries = 0;
        for (int i = 0; i < employees.length; i++) {
            sumOfSalaries = sumOfSalaries + employees[i].getSalary();
        }
        return sumOfSalaries;
    }

    public static Employee findEmployeeWithMinSalary() {
        int minSalary = employees[0].getSalary();
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
        int maxSalary = employees[0].getSalary();
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

    public static int countAverageSalary() {
        int sumOfSalaries = 0;
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

    }

}
