public class Employee extends Person
{
    private String office;
    private double salary;
    private String dateHired;

    public Employee(String name, String address, String phoneNumber, String email, String office, double salary, String dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String toString() {
        return "Employee: " + super.toString();
    }
}