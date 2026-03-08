
import java.util.Vector;

class Basics{
    public static void main(String[] args) {
        Vector<Integer> vec=new Vector<>();
        for (int i = 0; i < 5; i++) {
            vec.add(i);
        }
        System.out.println("Vector elements: "+vec);
    }
}