interface Salary{
    void calculateSalary();
}
class FulltimeEmployee implements Salary{
    double salary;

    public FulltimeEmployee(double salary) {
        this.salary = salary;
    }
    public void calculateSalary(){
        System.out.println("Monthly fixed: "+salary);
    }
}
class ParttimeEmployee implements Salary{
    int hours;
    double rate;

    public ParttimeEmployee(int hours, double rate) {
        this.hours = hours;
        this.rate = rate;
    }
    public void calculateSalary(){
        double paym=hours*rate;
        System.out.println("Payment made: "+paym);
    }

}
class Employee{
    public static void main(String[] args) {
        Salary s;

        s=new FulltimeEmployee(67000);
        s.calculateSalary();

        s=new ParttimeEmployee(15,500);
        s.calculateSalary();
    }
}