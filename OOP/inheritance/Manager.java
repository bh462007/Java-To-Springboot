class Employee{
    String name;
    double salary;
    void work(){
        if(salary > 50000){
            System.out.println(""+name+"! excellent");
        }
        else if(salary > 45000 && salary < 50000){
            System.out.println(""+name+" you did Good");
        }
        else{
            System.out.println(""+name+" you needs to improve");
        }
    }

}
class Manager extends Employee{
    int teamSize;
    void conductMeeting(){
        System.out.println("Be ready \nMeeting will be held in evening");
        System.out.println("Team size: "+teamSize);
    }

    public static void main(String[] args) {
        Manager manage=new Manager();
        manage.name="Sam";
        manage.salary=47800;
        manage.teamSize=8;
        manage.work();
        manage.conductMeeting();
    }
}