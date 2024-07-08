
class MyNewThr extends Thread{
    public void run(){
        while(true){
            System.out.println("Thank you ");
        }
    }
}
class MyNewThr1 extends Thread{
    public void run(){
        while(true){
            System.out.println("Thank you ");
        }
    }
}
public class JAVA_THREAD_METHOD {
    public static void main(String[] args) {
        MyNewThr t1 = new MyNewThr();
        MyNewThr1 t2 = new MyNewThr1();
        t1.start();
        try{
            t1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}
