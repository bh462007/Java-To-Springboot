
interface Payment{
    void pay();
}
class UPI implements Payment{

    @Override
    public void pay(){
        System.out.println("Paid using the UPI");
    }
}
class Creditcard implements Payment{
    public void pay(){
        System.out.println("Paid using the Credit card");
    }
}
class Sample{
    public static void main(String[] args) {
        Payment p1;
        p1=new UPI();
        p1.pay();

        p1=new Creditcard();
        p1.pay();
    }
}