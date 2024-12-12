package Properties.Inheritance;

public class Manager extends Employee {
    String department;
    int teamSize;

    Manager(String name, int id, double salary, String department, int teamSize){
        super(name, id, salary);
        this.department=department;
        this.teamSize = teamSize;
    }

    public void conductMeeting(){
        System.out.println("Manager is conducting Meeting.........");
    }

    public void displayManagerDetails(){
        super.displayDetails();
        System.out.println("Department : " + department);
        System.out.println("Team Size : " + teamSize);
    }
}
