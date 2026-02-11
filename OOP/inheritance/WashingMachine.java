class Appliance{
    String brand;
    int powerConsumption;
    void Start(){
        System.out.println("Brand: "+brand);
        System.out.println("Started..");
        System.out.println("Power being consumed: "+powerConsumption);
    }

}
class WashingMachine extends Appliance{
    int drumSize;
    void washCloths(){
        System.out.println("Put cloths accourding to the "+drumSize);
        System.out.println("Cloths are being washed");
    }
    public static void main(String[] args) {
        WashingMachine wm1=new WashingMachine();
        wm1.drumSize=7;
        wm1.brand="LG";
        wm1.powerConsumption=423;

        wm1.Start();
        wm1.washCloths();
    }
}