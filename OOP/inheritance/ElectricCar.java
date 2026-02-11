class Vehicle{
    int speed;
    String fuelType;
    void showVehicle(){
        System.out.println("Speed: "+speed);
        System.out.println("Fuel Type: "+fuelType);
    }

}
class ElectricCar extends Vehicle{
    int batteryCapacity;
    void chargeBattery(){
        if(batteryCapacity < 15){
            System.out.println("Start charging..");
        }
        else{
            System.out.println("Have enough battery");
        }
    }
    public static void main(String[] args) {
        ElectricCar ec1=new ElectricCar();
        ec1.speed=67;
        ec1.fuelType="gas-powered";
        ec1.batteryCapacity=20;

        ec1.showVehicle();
        ec1.chargeBattery();

    }
}