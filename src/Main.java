public class Main {

    static Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        employees[0] = new Employee("Сидоров Иван Петрович", 1, 54321);
        employees[1] = new Employee("Колокольцев Юрий Михайлович", 2, 35867);
        employees[2] = new Employee("Петров Иван Сергеевич", 3, 46982);
        employees[3] = new Employee("Москаленко Павел Витальевич", 4, 54654);
        employees[4] = new Employee("Богучарский Роман Евгеньевич", 5, 74562);
        employees[5] = new Employee("Ткачук Петр Семенович", 3, 20586);
        employees[6] = new Employee("Шишкин Андрей Аркадьевич", 4, 15963);
        employees[7] = new Employee("Кожевников Игорь Анатольевич", 2, 84567);

        System.out.println("Список всех сотрудников:");
        printAllEmployee();
        System.out.println();
        System.out.println("Сумма затрат на зарплаты в месяц = " + getAndCalculateSalary() + " руб.");
        System.out.println();
        System.out.println("Сотрудник с минимальной зарплатой:");
        System.out.println(getEmployeeMinSalary());
        System.out.println();
        System.out.println("Сотрудник с максимальной зарплатой:");
        System.out.println(getEmployeeMaxSalary());
        System.out.println();
        System.out.println("Средняя зарплата всех сотрудников составляет = " + getAndCalculateAverageSalary() + " руб.");
        System.out.println();
        System.out.println("Список ФИО всех сотрудников:");
        getAndPrintFullNameAllEmployee();
    }

    public static void printAllEmployee() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static double getAndCalculateSalary() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum = sum + employees[i].getSalary();
            }
        }
        return sum;
    }

    public static Employee getEmployeeMinSalary() {
        double minSalary = -1;
        Employee minSalaryEmployee = null;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                minSalary = employees[i].getSalary();
                minSalaryEmployee = employees[i];
                index = i;
                break;
            }
        }

        for (int i = index; i < employees.length; i++) {
            if (employees[i] != null) {
                if (minSalary > employees[i].getSalary()) {
                    minSalary = employees[i].getSalary();
                    minSalaryEmployee = employees[i];
                }
            }
        }
        return minSalaryEmployee;
    }

    public static Employee getEmployeeMaxSalary() {
        double maxSalary = -1;
        Employee maxSalaryEmployee = null;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                maxSalary = employees[i].getSalary();
                maxSalaryEmployee = employees[i];
                index = i;
                break;
            }
        }

        for (int i = index; i < employees.length; i++) {
            if (employees[i] != null) {
                if (maxSalary < employees[i].getSalary()) {
                    maxSalary = employees[i].getSalary();
                    maxSalaryEmployee = employees[i];
                }
            }
        }
        return maxSalaryEmployee;
    }

    public static double getAndCalculateAverageSalary() {
        double sumSalaryAllEmployee = getAndCalculateSalary();
        if (employees.length != 0) {
            return sumSalaryAllEmployee / getLenghtEmployeeWithoutNull();
        } else {
            return 0;
        }
    }
    public static int getLenghtEmployeeWithoutNull() {
        int lenghtEmployeeWithoutNull = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                lenghtEmployeeWithoutNull = i + 1;
            }
        }
        return lenghtEmployeeWithoutNull;
    }

    public static void getAndPrintFullNameAllEmployee() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getFullName());
            }
        }
    }
}