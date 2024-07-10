import java.util.ArrayList;
import java.util.LinkedList;

public class JAVA_LINKEDLIST {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(13);
        l2.add(18);
        l2.add(15);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(9);
        //   l1.clear();
        l1.addAll(0, 12);
        System.out.println(l1.contains(27));
        for(int i =0; i<l1.size();i++){
            System.out.println(l1.get(i));
        }
    }
}
