abstract class Employee{
    String name;
    double salary;

    public Employee(String name,double salary) {
        this.name = name;
        this.salary=salary;
    }

    public String getName(){
        return name;
    }
    
    abstract void calculateSalary();
}
class FulltimeEmp extends Employee{

    public FulltimeEmp(String name, double salary) {
        super(name,salary);
    }
    
    void calculateSalary(){
        System.out.println("Salary: "+salary);
    }
    
}
class ParttimeEmp extends Employee{
    
    int hour;
    double rate;
    public ParttimeEmp(String name, int hour,double rate) {
        super(name,0);
        this.hour=hour;
        this.rate=rate;
        
    }
    
    void calculateSalary(){
        salary=hour*rate;
        System.out.println("Salary: "+salary);
    }
    
}
class Emp_abstract{
    public static void main(String[] args) {
        Employee ea1;

        ea1=new FulltimeEmp("Raj",45000);
        System.out.println("Name: "+ea1.getName());
        ea1.calculateSalary();

        ea1=new ParttimeEmp("Sam", 700,15);
        System.out.println("Name: "+ea1.getName());
        ea1.calculateSalary();

    }
}