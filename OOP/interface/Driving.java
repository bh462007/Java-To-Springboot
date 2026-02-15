interface Vehicle{
    void start();
}

class Bike implements Vehicle{
    String brand;
    String model;

    public Bike(String brand, String model) {
        this.brand=brand;
        this.model=model;
    }
    public void start(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
    }   
}
class Car implements Vehicle{
    String brand;
    String model;

    public Car(String brand, String model){
        this.brand=brand;
        this.model=model;
    }
    public void start(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
    }
}
class Driving{
    public static void main(String[] args) {
        Vehicle v;

        v=new Bike("Hatchbacks","Maruti Suzuki Swift");
        v.start();

        v=new Bike("Honda","Unicorn");
        v.start();
    }
}