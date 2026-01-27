class Conversion{
    public static void main(String[] args) {
        //implicite
        int a=5;
        double b=a;
        System.out.println(b);

        //explicite
        long x=3;
        int y=(int) x;
        System.out.println(y);

        int i=5;
        byte j=(byte) i;
        System.out.println(j);
    }
}