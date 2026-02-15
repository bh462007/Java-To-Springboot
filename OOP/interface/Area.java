interface Shape{
    void area();
}
class Circle implements Shape{
    float radius;
    public Circle(float radius) {
        this.radius=radius;
    }
    
    public void area(){
        float f=(float) (Math.PI*radius*radius);
        System.out.println("Area of circle: "+f);
    }
}
class Rectangle implements Shape{
    float length;
    float breadth;

    public Rectangle(float length, float breadth) {
        this.breadth=breadth;
        this.length=length;
    }
    
    public void area(){
        float f=length*breadth;
        System.out.println("Area of rectangle: "+f);
    }
}
class Area{
    public static void main(String[] args) {
        Shape s;
        s=new Circle(8);
        s.area();

        s=new Rectangle(6,3);
        s.area();
    }
}