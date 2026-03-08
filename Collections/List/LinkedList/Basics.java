
import java.util.LinkedList;

class Basics{
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();

        for (int i = 2; i < 10; i+=2) {
            list.add(i);
        }
        System.out.println("List: "+list);

        list.add(1, 20);
        System.out.println("Adding by index: "+list);

        list.addFirst(10);
        System.out.println("Adding first: "+list);

        list.addLast(100);
        System.out.println("Adding last: "+list);

        list.add(2); //adding duplicate
        System.out.println("List: "+list);

        System.out.println("Removing last: "+list.removeLast());
        System.out.println("After removing last: "+list.getLast());

        System.out.println("Removing first: "+list.removeFirst());
        System.out.println("After removing first: "+list.getFirst());

        System.out.println("Element at 3rd index: "+list.get(3));

        
    }
}