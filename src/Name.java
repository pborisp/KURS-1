import java.util.Objects;

public class Name {
    private String lastName;
    private String firstName;
    private String surName;

    public Name(String lastName, String firstName, String surName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.surName = surName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "Name= " +
                lastName + '\'' +
                firstName + '\'' +
                surName + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Name name = (Name) o;
        return Objects.equals(lastName, name.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(lastName);
    }
}
