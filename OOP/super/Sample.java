class Demo{
    void display(){
        System.out.println("Display demo");
    }
}
class Sample extends Demo{
    void display(){
        super.display();
        System.out.println("Display sample");
    }
    public static void main(String[] args) {
        Sample s1=new Sample();
        s1.display();
    }
}