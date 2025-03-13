import java.util.Objects;

class EmployeeBook {
    private Name name;
    private int department;
    private int salary;
    private int id;

    public EmployeeBook(Employee list) {
        this.name = list.getName();
        this.department = list.getDepartment();
        this.salary = list.getSalary();
        this.id = list.getId();
    }

    public EmployeeBook(EmployeeBook list) {
        this.name = list.getName();
        this.department = list.getDepartment();
        this.salary = list.getSalary();
        this.id = list.getId();
    }


    public void getListPers(EmployeeBook[] employeeBook) {
        for (EmployeeBook i : employeeBook) {
            if (i != null) {
                System.out.println(i);
            }
        }
    }

    public int sumSalary(EmployeeBook[] list) {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                sum += list[i].getSalary();
            }
        }
        return sum;
    }

    public double averageSalary(EmployeeBook[] list) {
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                count++;
            }
        }
        return sumSalary(list) / count;
    }

    public int minSalary(EmployeeBook[] list) {
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

    public int maxSalary(EmployeeBook[] list) {
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

    public void printName(EmployeeBook[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] != null) {
                System.out.println(list[i].getName());
            }
        }
    }

    public void indexSalary(EmployeeBook[] list) {
        int index = 10;
        int x;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                x = list[i].getSalary() * index / 100;
                list[i].setSalary(list[i].getSalary() + x);
            }
        }
    }

    public int minSalaryDepartment(EmployeeBook[] list, int numDep) {
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

    public int maxSalaryDepartment(EmployeeBook[] list, int numDep) {
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

    public int sumSalaryDepartment(EmployeeBook[] list, int numDep) {
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

    public double averageSalaryDepartment(EmployeeBook[] list, int numDep) {
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

    public void indexSalaryDepartment(EmployeeBook[] list, int numDep, int index) {
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

    public void getListPersonalDepartment(EmployeeBook[] list, int numDep) {
        System.out.println("Индексация ЗП отдела №" + numDep + " : ");
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                if (list[i].getDepartment() == numDep) {
                    System.out.println(list[i].getName() + "  зарплата: " + list[i].getSalary() + "руб.  id: " + list[i].getId());
                }
            }
        }
    }

    public void findPersonalMinSalary(EmployeeBook[] list, int numberCompare) {
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

    public void findPersonalMaxSalary(EmployeeBook[] list, int numberCompare) {
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
            if (book[i] != null) {
                if (book[i].id == id) {
                    book[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean findPerson(EmployeeBook[] book, int id) {
        for (int i = 0; i < book.length; i++) {
            if (book[i] != null) {
                if (book[i].id == id) {
                    System.out.println("Найден сотрудник: " + book[i]);
                    return true;
                }
            }
        }
        return false;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "EmployeeBook{" +
                "name=" + name +
                ", department=" + department +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeBook that = (EmployeeBook) o;
        return department == that.department && salary == that.salary && id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, salary, id);
    }
}
