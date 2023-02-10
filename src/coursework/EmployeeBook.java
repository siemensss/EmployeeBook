package coursework;

public class EmployeeBook {
    private Employee[] employees;

    public EmployeeBook(Employee[] employees) {
        this.employees = employees;
    }

    public EmployeeBook(int size) {
        this.employees = new Employee[size];
    }

    public void getListOfAllEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].toString());
            }
        }
    }

    public double countSumOfSalaries() {
        double sumOfSalaries = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sumOfSalaries = sumOfSalaries + employees[i].getSalary();
            }
        }
        return sumOfSalaries;
    }

    public Employee findEmployeeWithMinSalary() {
        Employee e = null;
        double minSalary = employees[0].getSalary();
        int i = 0;
        for (; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() < minSalary) {
                    minSalary = employees[i].getSalary();
                    e = employees[i];
                }
            }
        }
        return e;
    }

    public Employee findEmployeeWithMaxSalary() {
        Employee e = null;
        double maxSalary = employees[0].getSalary();
        int i = 0;
        for (; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() > maxSalary) {
                    maxSalary = employees[i].getSalary();
                    e = employees[i];
                }
            }
        }
        return e;
    }

    public double countAverageSalary() {
        double sumOfSalaries = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sumOfSalaries = sumOfSalaries + employees[i].getSalary();
            }
        }
        return sumOfSalaries / employees.length;
    }

    public void getNameOfAllEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println("Сотрудник " + (i + 1) + ": " + employees[i].getName());
            }
        }
    }

    public void printSeparator() {
        System.out.println("=======================");
    }

    public void increaseSalary(double percent) {
        percent = percent / 100;
        double totalSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                totalSalary = employees[i].getSalary() + (employees[i].getSalary() * percent);
                employees[i].setSalary(totalSalary);
            }
        }
    }

    public Employee getEmployeeWithMinSalaryInSpecificDepartment(int department) {
        Employee e = null;
        double minSalary = Double.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() < minSalary && employees[i].getDepartment() == department) {
                    minSalary = employees[i].getSalary();
                    e = employees[i];
                }
            }
        }
        if(e == null) {
            throw new RuntimeException("В отделе нет сотрудников!");
        }

        return e;
    }

    public Employee getEmployeeWithMaxSalaryInSpecificDepartment(int department) {
        Employee e = null;
        double maxSalary = Double.MIN_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() > maxSalary && employees[i].getDepartment() == department) {
                    maxSalary = employees[i].getSalary();
                    e = employees[i];
                }
            }
        }
        if(e == null) {
            throw new RuntimeException("В отделе нет сотрудников!");
        }

        return e;
    }


    public double countSumOfSalariesInSpecificDepartment(int department) {
        double sumOfSalaries = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getDepartment() == department) {
                    sumOfSalaries = sumOfSalaries + employees[i].getSalary();
                }
            }
        }
        return sumOfSalaries;
    }

    public double countAverageSalaryInSpecificDepartment(int department) {
        double sumOfSalaries = 0;
        int j = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getDepartment() == department) {
                    sumOfSalaries = sumOfSalaries + employees[i].getSalary();
                    j++;
                }
            }
        }
        return sumOfSalaries / j;
    }

    public void increaseSalaryInSpecificDepartment(int department, double percent) {
        percent = percent / 100;
        double totalSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getDepartment() == department) {
                    totalSalary = employees[i].getSalary() + (employees[i].getSalary() * percent);
                    employees[i].setSalary(totalSalary);
                }
            }
        }
    }

    public void getInformationAboutAllEmployeesInSpecificDepartment(int department) {
        int j = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getDepartment() == department) {
                    System.out.println("--------------------\n" + (j + 1) + ". Сотрудник с id: " + employees[i].getId() + "\nФ.И.О.: " + employees[i].getName() + "\nЗарплата: " + employees[i].getSalary() + "\n--------------------");
                    j++;
                }
            }
        }
    }

    public void getAllEmployeesWithSalaryLessThenLimit(double salaryLimit) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() < salaryLimit) {
                    System.out.println("--------------------\n" + "Сотрудник с id: " + employees[i].getId() + "\nФ.И.О.: " + employees[i].getName() + "\nЗарплата: " + employees[i].getSalary() + "\n--------------------");
                }
            }
        }
    }

    public void getAllEmployeesWithSalaryGreaterThenLimit(double salaryLimit) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() >= salaryLimit) {
                    System.out.println("--------------------\n" + "Сотрудник с id: " + employees[i].getId() + "\nФ.И.О.: " + employees[i].getName() + "\nЗарплата: " + employees[i].getSalary() + "\n--------------------");
                }
            }
        }
    }

    public void addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                break;
            } else if (i == employees.length - 1) {
                throw new ArrayIndexOutOfBoundsException("Места нет!");
            }
        }
    }

    public void deleteEmployeeById(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getId() == id) {
                    employees[i] = null;
                }
            }
        }
    }

    public void deleteEmployeeByName(String name) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getName().equals(name)) {
                    employees[i] = null;
                }
            }
        }
    }

    public void editEmployeeSalary(String nameEmployee, double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Некорректное значение зарплаты!");
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getName().equals(nameEmployee)) {
                    employees[i].setSalary(salary);
                }
            }
        }
    }

    public void editEmployeeDepartment(String nameEmployee, int department) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Такого отдела нет!!!");
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getName().equals(nameEmployee)) {
                    employees[i].setDepartment(department);
                }
            }
        }
    }

    public void getNameEmployeesForEachDepartment() {
        for (int j = 1; j < 6; j++) {
            System.out.println("Отдел № " + j + ", имена сотрудников:");
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null) {
                    if (employees[i].getDepartment() == j) {
                        System.out.println(employees[i].getName());
                    }
                }
            }
        }
    }

}
