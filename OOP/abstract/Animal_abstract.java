abstract class Animal{
    String name;
    Animal(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    abstract void sound();
}
class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    public void sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }
    
    public void sound(){
        System.out.println("Cat meows");
    }
}
class Animal_abstract{
    public static void main(String[] args) {
        Animal ani1;
        ani1=new Dog("Bruno");
        System.out.println("Name:"+ani1.getName());
        ani1.sound();

        ani1=new Cat("Mailo");
        System.out.println("Name:"+ani1.getName());
        ani1.sound();
    }
}