public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("Mike Smith", "123 Main St", "555-1234", "john@example.com");
        Student student = new Student("Alice Johnson", "456 Elm St", "555-5678", "alice@example.com", "Sophomore");
        Employee employee = new Employee("Bob Roberts", "789 Oak St", "555-9012", "bob@example.com", "Room 101", 50000, "2023-01-01");
        Faculty faculty = new Faculty("Jane Doe", "321 Pine St", "555-3456", "jane@example.com", "Room 202", 80000, "2022-05-01", "9am - 5pm", "Professor");
        Staff staff = new Staff("Mike Smith", "654 Cedar St", "555-7890", "mike@example.com", "Room 303", 40000, "2023-06-01", "Secretary");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}

