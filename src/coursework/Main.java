package coursework;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
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
        EmployeeBook book = new EmployeeBook(employees);
        book.printSeparator();
        book.deleteEmployeeById(4);
        System.out.println("Список всех сотрудников:");
        book.getListOfAllEmployees();
        book.printSeparator();
        System.out.println("Сумма всех зарплат: " + book.countSumOfSalaries());
        book.printSeparator();
        System.out.println("Сотрудник с минимальной зарплатой:\n" + book.findEmployeeWithMinSalary().toString());
        book.printSeparator();
        System.out.println("Сотрудник с максимальной зарплатой:\n" + book.findEmployeeWithMaxSalary().toString());
        book.printSeparator();
        System.out.println("Средняя зарплата: " + book.countAverageSalary());
        book.printSeparator();
        System.out.println("Имена всех сотрудников: ");
        book.getNameOfAllEmployees();
        book.printSeparator();
        int department = 2;
        System.out.println("Сотрудник с минимальной зарплатой в отделе № " + department + ":\n" + book.getEmployeeWithMinSalaryInSpecificDepartment(department).toString());
        book.printSeparator();
        System.out.println("Сотрудник с максимальной зарплатой в отделе № " + department + ":\n" + book.getEmployeeWithMaxSalaryInSpecificDepartment(department).toString());
        book.printSeparator();
        System.out.println("Сумма всех зарплат по отделу № " + department + ": " + book.countSumOfSalariesInSpecificDepartment(department));
        book.printSeparator();
        System.out.println("Средняя зарплата по отделу № " + department + ": " + book.countAverageSalaryInSpecificDepartment(department));
        book.printSeparator();
        System.out.println("Информация о сотрудниках из отдела № " + department + ":");
        book.getInformationAboutAllEmployeesInSpecificDepartment(department);
        book.printSeparator();
        double limit = 50000;
        System.out.println("Список сотрудников с зарплатой меньше заданного числа (" + limit + "):");
        book.getAllEmployeesWithSalaryLessThenLimit(limit);
        book.printSeparator();
        System.out.println("Список сотрудников с зарплатой больше (или равно) заданного числа (" + limit + "):");
        book.getAllEmployeesWithSalaryGreaterThenLimit(limit);
        book.printSeparator();
        Employee employee = new Employee("Степанов Оскар Федотович", 40000, 5);
        book.deleteEmployeeById(9);
        book.addEmployee(employee);
        System.out.println("Список всех сотрудников:");
        book.getListOfAllEmployees();
        book.printSeparator();
        book.editEmployeeSalary("Востриков Илья Владимирович", 100000);
        book.editEmployeeDepartment("Востриков Илья Владимирович", 5);
        book.getListOfAllEmployees();
        book.printSeparator();
        book.getNameEmployeesForEachDepartment();

    }

}
