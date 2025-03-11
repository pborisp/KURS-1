public class Main {

    public static void getListPersonal(Employee[] list) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                System.out.println(list[i]);
            }
        }
    }

    public static int sumSalary(Employee[] list) {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                sum += list[i].getSalary();
            }
        }
        return sum;
    }

    public static int minSalary(Employee[] list) {
        int min = list[0].getSalary();
        int idMin = 0;
        for (int i = 1; i < list.length; i++) {
            if (list[i] != null && list[i].getSalary() < min) {
                min = list[i].getSalary();
                idMin = i;
            }
        }
        return idMin;
    }

    public static int maxSalary(Employee[] list) {
        int max = list[0].getSalary();
        int idMax = 0;
        for (int i = 1; i < list.length; i++) {
            if (list[i] != null && list[i].getSalary() > max) {
                max = list[i].getSalary();
                idMax = i;
            }
        }
        return idMax;
    }

    public static double averageSalary(Employee[] list) {
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                count++;
            }
        }
        return sumSalary(list) / count;
    }

    public static void printName(Employee[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] != null) {
                System.out.println(list[i].getName());
            }
        }
    }

    public static void indexSalary(Employee[] list) {
        int index = 10;
        int x;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                x = list[i].getSalary() * index / 100;
                list[i].setSalary(list[i].getSalary() + x);
            }
        }
    }

    public static int minSalaryDepartment(Employee[] list, int numDep) {
        int min = list[0].getSalary();
        int idMin = 0;
        for (int i = 1; i < list.length; i++) {
            if (list[i] != null && list[i].getSalary() < min) {
                if (list[i].getDepartment() == numDep) {
                    min = list[i].getSalary();
                    idMin = i;
                }
            }
        }
        return idMin;
    }

    public static int maxSalaryDepartment(Employee[] list, int numDep) {
        int max = list[0].getSalary();
        int idMax = 0;
        for (int i = 1; i < list.length; i++) {
            if (list[i] != null && list[i].getSalary() > max) {
                if (list[i].getDepartment() == numDep) {
                    max = list[i].getSalary();
                    idMax = i;
                }
            }
        }
        return idMax;
    }

    public static int sumSalaryDepartment(Employee[] list, int numDep) {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                if (list[i].getDepartment() == numDep) {
                    sum += list[i].getSalary();
                }
            }
        }
        return sum;
    }

    public static double averageSalaryDepartment(Employee[] list, int numDep) {
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                if (list[i].getDepartment() == numDep) {
                    count++;
                }
            }
        }
        return sumSalaryDepartment(list, numDep) / count;
    }

    public static void indexSalaryDepartment(Employee[] list, int numDep, int index) {
        int x;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                if (list[i].getDepartment() == numDep) {
                    x = list[i].getSalary() * index / 100;
                    list[i].setSalary(list[i].getSalary() + x);
                }
            }
        }
    }

    public static void getListPersonalDepartment(Employee[] list, int numDep) {
        System.out.println("Индексация ЗП отдела №" + numDep + " : ");
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                if (list[i].getDepartment() == numDep) {
                    System.out.println(list[i].getName() + "  зарплата: " + list[i].getSalary() + "руб.  id: " + list[i].getId());
                }
            }
        }
    }

    public static void findPersonalMinSalary(Employee[] list, int numberCompare) {
        System.out.println("Список сотрудников с ЗП меньше " + numberCompare + " руб. : ");
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                if (list[i].getSalary() < numberCompare) {
                    System.out.println(list[i]);
                }
            }
        }
        System.out.println();
    }

    public static void findPersonalMaxSalary(Employee[] list, int numberCompare) {
        System.out.println("Список сотрудников с ЗП больше " + numberCompare + " руб. : ");
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                if (list[i].getSalary() > numberCompare) {
                    System.out.println(list[i]);
                }
            }
        }
        System.out.println();
    }

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

        getListPersonal(employees);
        System.out.println();
        System.out.println("Сумма затрат на ЗП: " + sumSalary(employees) + " руб");
        System.out.println();
        System.out.println("Минимальная ЗП у сотрудника: " + employees[minSalary(employees)]);
        System.out.println();
        System.out.println("Максимальная ЗП у сотрудника: " + employees[maxSalary(employees)]);
        System.out.println();
        System.out.println("Среднее значение ЗП сотрудников: " + averageSalary(employees) + " руб.");
        System.out.println();
        titov.setSurName("Михайлович");
        printName(employees);
        System.out.println();

        // Индексация ЗП
        System.out.println("Индексация ЗП:");
        indexSalary(employees);
        getListPersonal(employees);
        System.out.println();

        // По параметру "номер отдела"
        System.out.println("Минимальная ЗП у сотрудника: " + employees[minSalaryDepartment(employees, 1)]);
        System.out.println("Максимальная ЗП у сотрудника: " + employees[maxSalaryDepartment(employees, 1)]);
        System.out.println("Сумма затрат на ЗП: " + sumSalaryDepartment(employees, 1) + " руб");
        System.out.println("Среднее значение ЗП сотрудников: " + averageSalaryDepartment(employees, 1) + " руб.");

        // Индексация ЗП отдела
        indexSalaryDepartment(employees, 1, 7);
        getListPersonalDepartment(employees, 1);
        System.out.println();

        // Получить число и определить
        findPersonalMinSalary(employees, 180000);
        findPersonalMaxSalary(employees, 180000);
    }
}