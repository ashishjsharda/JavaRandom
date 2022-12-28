/**
 * Employee Record
 * @param name
 * @param age
 */
record Employee(String name, int age) {
    public Employee {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
}

/**
 * Example of Record
 * @author ashis
 * @since 1.0
 */
public class RecordsEx {
    public static void main(String[] args) {
        Employee e1 = new Employee("John", 25);
        Employee e2 = new Employee("John", 25);
        System.out.println(e1.equals(e2));
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        System.out.println(e1);

    }
}
