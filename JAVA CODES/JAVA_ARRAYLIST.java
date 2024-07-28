import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class JAVA_ARRAYLIST {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(13);
        l2.add(18);
        l2.add(15);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(9);
     //   l1.clear();
        l1.addAll(0, Collections.singleton(12));
        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(9));
        l1.set(1,566);
          for(int i =0; i<l1.size();i++){
            System.out.println(l1.get(i));
        }

    }
}
