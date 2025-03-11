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



    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        Name popov = new Name("Попов", "Борис", "Сергеевич");
        employees[0] = new Employee(popov, 1, 205000, Counter.invokeCounter());
        Name ivanov = new Name("Иванов", "Иван", "Иванович");
        employees[1] = new Employee(ivanov, 3, 160000, Counter.invokeCounter());
        Name titov = new Name("Титов", "Сергей", "Сергеевич");
        employees[2] = new Employee(titov, 1, 190000, Counter.invokeCounter());
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


    }
}