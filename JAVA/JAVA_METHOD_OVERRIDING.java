class A{
    public int a;
    public int prathamesh(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am Methos 2 of class A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("I am Method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am Method 3 of Class B");
    }
}
public class JAVA_METHOD_OVERRIDING {
    public static void main(String[] args) {
       A a = new A();
       a.meth2();

       B b = new B();
       b.meth2();
    }
}
