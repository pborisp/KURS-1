import java.awt.print.Book;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        Name popov = new Name("Попов", "Борис", "Сергеевич");
        employees[0] = new Employee(popov, 1, 205000, Counter.invokeCounter());
        Name ivanov = new Name("Иванов", "Иван", "Иванович");
        employees[1] = new Employee(ivanov, 3, 160000, Counter.invokeCounter());
        Name titov = new Name("Титов", "Сергей", "Сергеевич");
        employees[2] = new Employee(titov, 1, 190000, Counter.invokeCounter());
        Name balashov = new Name("Балашов", "Николай", "Алексеевич");
        employees[3] = new Employee(balashov, 1, 178000, Counter.invokeCounter());
        Name gagarin = new Name("Гагарин", "Юрий", "Юрьевич");
        employees[4] = new Employee(gagarin, 1, 175300, Counter.invokeCounter());
        Name potapov = new Name("Потапов", "Андрей", "Андреевич");
        employees[5] = new Employee(potapov, 2, 110000, Counter.invokeCounter());

        // Новый класс
        EmployeeBook employeeBooks = new EmployeeBook(employees);
        employeeBooks.printBook(employees);

        System.out.println();

        System.out.println("Сумма затрат на ЗП: " + employeeBooks.sumSalary(employees) + " руб");
        System.out.println();
        int idMin = employeeBooks.minSalary(employees);
        System.out.println("Минимальная ЗП у сотрудника: " + idMin);
        System.out.println();
        System.out.println("Максимальная ЗП у сотрудника: " + employeeBooks.maxSalary(employees));
        System.out.println();
        System.out.println("Среднее значение ЗП сотрудников: " + employeeBooks.averageSalary(employees) + " руб.");
        System.out.println();
        titov.setSurName("Михайлович");
        employeeBooks.printName(employees);
        System.out.println();

        // Индексация ЗП
        System.out.println("Индексация ЗП:");
        employeeBooks.indexSalary(employees);
        employeeBooks.getListPers(employees);
        System.out.println();

        // По параметру "номер отдела"
        System.out.println("Минимальная ЗП у сотрудника отдела: " + employeeBooks.minSalaryDepartment(employees, 1));
        System.out.println("Максимальная ЗП у сотрудника отдела: " + employeeBooks.maxSalaryDepartment(employees, 1));
        System.out.println("Сумма затрат на ЗП отдела: " + employeeBooks.sumSalaryDepartment(employees, 1) + " руб");
        System.out.println("Среднее значение ЗП сотрудников отдела: " + employeeBooks.averageSalaryDepartment(employees, 1) + " руб.");
        System.out.println();

        // Индексация ЗП отдела
        System.out.println("Индексация ЗП отдела");
        employeeBooks.indexSalaryDepartment(employees, 1, 7);
        employeeBooks.getListPers(employees);
        System.out.println();

        // Получить число и определить
        employeeBooks.findPersonalMinSalary(employees, 180000);
        employeeBooks.findPersonalMaxSalary(employees, 180000);

        //Добавляем
        Name sergeev = new Name("Сергеев", "Сергей", "Андреевич");
        Employee newPerson = new Employee(sergeev, 4, 140000, Counter.invokeCounter());

        //удаляем сотрудника
        int dellId = 4;
        if (employeeBooks.dellPerson(employees, dellId)) {
            System.out.println("Cотрудник c id:" + dellId + " успешно удален.");
        } else {
            System.out.println("Сотрудик с id " + dellId + " не найден.");
        }
        employeeBooks.printBook(employees);
        System.out.println();


        // Добавляем сотрудника
        if (employeeBooks.addNewPerson(newPerson)) {
            System.out.println("Новый сотрудник успешно добавлен.");
        } else {
            System.out.println("Свободных мест нет для нового сотрудника.");
        }
        employeeBooks.printBook(employees);
        System.out.println();

        // Поиск сотрудника по id
        int findOfId = 5;
        if (!employeeBooks.findPerson(employees, findOfId)) {
            System.out.println("Сотрудник не найден!");
        } else {
            System.out.println(" - результат поиска сотрудника с id=" + findOfId);
        }
    }
}