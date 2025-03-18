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
        EmployeeBook[] employeeBooks = new EmployeeBook[10];
        for (int i = 0; i < employeeBooks.length; i++) {
            if (employees[i] != null) {
                employeeBooks[i] = new EmployeeBook(employees[i]);
            }
        }

        

        employeeBooks[0].getListPers(employeeBooks);
        System.out.println();


        System.out.println("Сумма затрат на ЗП: " + employeeBooks[0].sumSalary(employees) + " руб");
        System.out.println();
        System.out.println("Минимальная ЗП у сотрудника: " + employeeBooks[employeeBooks[0].minSalary(employees)]);
        System.out.println();
        System.out.println("Максимальная ЗП у сотрудника: " + employeeBooks[employeeBooks[0].maxSalary(employees)]);
        System.out.println();
        System.out.println("Среднее значение ЗП сотрудников: " + employeeBooks[0].averageSalary(employees) + " руб.");
        System.out.println();
        titov.setSurName("Михайлович");
        employeeBooks[0].printName(employees);
        System.out.println();

        // Индексация ЗП
        System.out.println("Индексация ЗП:");
        employeeBooks[0].indexSalary(employees);
        employeeBooks[0].getListPers(employeeBooks);
        System.out.println();

        // По параметру "номер отдела"
        System.out.println("Минимальная ЗП у сотрудника: " + employeeBooks[employeeBooks[0].minSalaryDepartment(employees, 1)]);
        System.out.println("Максимальная ЗП у сотрудника: " + employeeBooks[employeeBooks[0].maxSalaryDepartment(employees, 1)]);
        System.out.println("Сумма затрат на ЗП: " + employeeBooks[0].sumSalaryDepartment(employees, 1) + " руб");
        System.out.println("Среднее значение ЗП сотрудников: " + employeeBooks[0].averageSalaryDepartment(employees, 1) + " руб.");
        System.out.println();

        // Индексация ЗП отдела
        System.out.println("Индексация ЗП отдела");
        employeeBooks[0].indexSalaryDepartment(employees, 1, 7);
        employeeBooks[0].getListPers(employeeBooks);
        System.out.println();

        // Получить число и определить
        employeeBooks[0].findPersonalMinSalary(employees, 180000);
        employeeBooks[0].findPersonalMaxSalary(employees, 180000);

        //Добавляем
        Name sergeev = new Name("Сергеев", "Сергей", "Андреевич");
        Employee newPerson = new Employee(sergeev, 4, 140000, Counter.invokeCounter());

        //удаляем сотрудника
        int dellId = 4;
        if (employeeBooks[0].dellPerson(employeeBooks, dellId)) {
            System.out.println("Cотрудник c id:" + dellId + " успешно удален.");
        } else {
            System.out.println("Сотрудик с id " + dellId + " не найден.");
        }

        // Добавляем сотрудника
        if (employeeBooks[0].addNewPerson(employeeBooks, newPerson)) {
            System.out.println("Новый сотрудник успешно добавлен.");
        } else {
            System.out.println("Свободных мест нет для нового сотрудника.");
        }
        employeeBooks[0].getListPers(employeeBooks);

        System.out.println();

        // Поиск сотрудника по id
        if (!employeeBooks[0].findPerson(employeeBooks, 5)) {
            System.out.println("Сотрудник не найден!");
        }
    }
}