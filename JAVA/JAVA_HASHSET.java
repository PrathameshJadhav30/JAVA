import java.util.HashSet;

public class JAVA_HASHSET {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6,0.5f);
        myHashSet.add(6);
        myHashSet.add(7);
        myHashSet.add(9);
        myHashSet.add(13);
        myHashSet.add(23);
        System.out.println(myHashSet);
    }
}
