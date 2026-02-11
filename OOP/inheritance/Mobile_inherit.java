class Device{
    String brand;
    boolean powerStatus;
    void turnOn(){
        if(powerStatus==true){
            System.out.println("Turned on..");
        }
    }
}
class Mobile_inherit extends Device{
    int batteryLevel;
    void showMobile(){
        System.out.println("Brand: "+brand);
        System.out.println("Battery level: "+batteryLevel);
    }

    public static void main(String[] args) {
        Mobile_inherit mob = new Mobile_inherit();
        mob.brand="android";
        mob.powerStatus=true;
        mob.batteryLevel=85;

        mob.turnOn();
        mob.showMobile();
    }
}