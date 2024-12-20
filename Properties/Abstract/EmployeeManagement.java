package Properties.Abstract;

public abstract class EmployeeManagement {

    private int id;
    private String name;


    public EmployeeManagement(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getname(){
        return name;
    }

    abstract void CalculateSalary();
    abstract void DisplayDigits();

}

class FullTimeEmployee extends EmployeeManagement{

    private double MonthlySalary;

    FullTimeEmployee(double MonthlySalary, int id, String name){
        super(id, name);
        this.MonthlySalary = MonthlySalary;
    }

    @Override
    void CalculateSalary(){
        System.out.println("Monthly Salary id "+ MonthlySalary);
    }

    @Override
    void DisplayDigits(){
        System.out.println("Employee ID : "+getId());
        System.out.println("Employee Name :"+getname());
    }
}

class PartTimeEmployee extends EmployeeManagement{
    private double hoursWorked;
    private double hourlyPay;

    public PartTimeEmployee(int id, String name,double hoursWorked, double hourlyPay){
        super(id, name);
        this.hoursWorked = hoursWorked;
        this.hourlyPay = hourlyPay;
    }

    @Override
    void CalculateSalary(){
        System.out.println("Your salary is : "+ hoursWorked * hourlyPay);
    }

    @Override
    void DisplayDigits(){
        System.out.println("Part Time Employee id : "+ getId());
        System.out.println("Part Time Employee name : "+ getname());
    }
}

class Emain{
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(50000, 01,"Midhun");
        fullTimeEmployee.CalculateSalary();
        fullTimeEmployee.DisplayDigits();

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(02, "Jeeva", 5, 2000);
        partTimeEmployee.CalculateSalary();
        partTimeEmployee.DisplayDigits();
    }
}
