import java.util.Objects;

class EmployeeBook {
    private Employee book;
    private int id;


    public EmployeeBook(Employee list) {
        this.book = list;
        this.id = list.getId();
    }

    public void getListPers(EmployeeBook[] employeeBook) {
        for (EmployeeBook i : employeeBook) {
            if (i != null) {
                System.out.println(i);
            }
        }
    }

    public int sumSalary(Employee[] list) {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                sum += list[i].getSalary();
            }
        }
        return sum;
    }

    public double averageSalary(Employee[] list) {
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                count++;
            }
        }
        return sumSalary(list) / count;
    }

    public int minSalary(Employee[] list) {
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

    public int maxSalary(Employee[] list) {
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

    public void printName(Employee[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] != null) {
                System.out.println(list[i].getName());
            }
        }
    }

    public void indexSalary(Employee[] list) {
        int index = 10;
        int x;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                x = list[i].getSalary() * index / 100;
                list[i].setSalary(list[i].getSalary() + x);
            }
        }
    }

    public int minSalaryDepartment(Employee[] list, int numDep) {
        int min = list[0].getSalary();
        int idMin = 0;
        for (int i = 1; i < list.length; i++) {
            if (list[i] != null && list[i].getSalary() < min && list[i].getDepartment() == numDep) {
                min = list[i].getSalary();
                idMin = i;
            }
        }
        return idMin;
    }

    public int maxSalaryDepartment(Employee[] list, int numDep) {
        int max = list[0].getSalary();
        int idMax = 0;
        for (int i = 1; i < list.length; i++) {
            if (list[i] != null && list[i].getSalary() > max && list[i].getDepartment() == numDep) {
                max = list[i].getSalary();
                idMax = i;
            }
        }
        return idMax;
    }

    public int sumSalaryDepartment(Employee[] list, int numDep) {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null && list[i].getDepartment() == numDep) {
                sum += list[i].getSalary();
            }
        }
        return sum;
    }

    public double averageSalaryDepartment(Employee[] list, int numDep) {
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null && list[i].getDepartment() == numDep) {
                count++;
            }
        }
        return sumSalaryDepartment(list, numDep) / count;
    }

    public void indexSalaryDepartment(Employee[] list, int numDep, int index) {
        int x;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null && list[i].getDepartment() == numDep) {
                x = list[i].getSalary() * index / 100;
                list[i].setSalary(list[i].getSalary() + x);
            }
        }
    }

    public void getListPersonalDepartment(Employee[] list, int numDep) {
        System.out.println("Индексация ЗП отдела №" + numDep + " : ");
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null && list[i].getDepartment() == numDep) {
                System.out.println(list[i].getName() + "  зарплата: " + list[i].getSalary() + "руб.  id: " + list[i].getId());
            }
        }
    }

    public void findPersonalMinSalary(Employee[] list, int numberCompare) {
        System.out.println("Список сотрудников с ЗП меньше " + numberCompare + " руб. : ");
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null && list[i].getSalary() < numberCompare) {
                System.out.println(list[i]);
            }
        }
        System.out.println();
    }

    public void findPersonalMaxSalary(Employee[] list, int numberCompare) {
        System.out.println("Список сотрудников с ЗП больше " + numberCompare + " руб. : ");
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null && list[i].getSalary() > numberCompare) {
                System.out.println(list[i]);
            }
        }
        System.out.println();
    }

    public boolean addNewPerson(EmployeeBook[] book, Employee newPerson) {
        for (int i = 0; i < book.length; i++) {
            if (book[i] == null) {
                book[i] = new EmployeeBook(newPerson);
                return true;
            }
        }
        return false;
    }

    public boolean dellPerson(EmployeeBook[] book, int id) {
        for (int i = 0; i < book.length; i++) {
            if (book[i] != null && book[i].id == id) {
                book[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "EmployeeBook{" +
                "book=" + book +
                ", id=" + id +
                '}';
    }

    public boolean findPerson(EmployeeBook[] book, int id) {
        for (int i = 0; i < book.length; i++) {
            if (book[i] != null && book[i].id == id) {
                System.out.println("Найден сотрудник: " + book[i]);
                return true;
            }
        }
        return false;


    }
}
