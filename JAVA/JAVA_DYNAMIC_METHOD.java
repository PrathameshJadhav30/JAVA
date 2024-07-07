class one{
    public void name(){
        System.out.println("My name is Java");
    }
}
class Two extends one{
    @Override
    public void name(){
        System.out.println("My name is java in class Two");
    }
}

public class JAVA_DYNAMIC_METHOD {
    public static void main(String[] args) {
        one obj = new one();
        obj.name();
        Two Obj = new Two();
        obj.name();
    }
}
