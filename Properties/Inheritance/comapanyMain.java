package Properties.Inheritance;

public class comapanyMain {
    public static void main(String[] args) {
        
        Employee employee = new Employee("Midhunkumar N ", 01, 55500);

        System.out.println("Employee Details :");
        System.out.println("\n");

        employee.displayDetails();

        Manager manager  = new Manager("Paveen P", 02, 50500, "Developer", 15);

        System.out.println("Manager and Team Details :");
        System.out.println("\n");

        manager.displayManagerDetails();
    }
}
