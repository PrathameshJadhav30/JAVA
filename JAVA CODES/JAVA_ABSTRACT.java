abstract class parent2{
    public parent2(){
        System.out.println("I am Constructor of Parent2");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}
class child2 extends parent2{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
}
public class JAVA_ABSTRACT {
    public static void main(String[] args) {
       child2 c = new child2();
    }
}
