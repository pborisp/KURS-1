import java.util.Objects;

public class Employee {
    private Name name;
    private int department;
    private int salary;
    private int id;

    public Employee(Name name, int department, int salary, int id) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = id;
    }

    public Employee(int department, int salary,int id) {
        this(null, department, salary, id);
    }

    public Name getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return " " +
                name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department);
    }
}
