
class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i = 34;
        System.out.println("Thank you");
    }
}
public class JAVA_THREAD_CONSTRUCTUR {
    public static void main(String[] args) {
        MyThr t = new MyThr("prathamesh");
        t.start();
        System.out.println("The id of the Thread t is " + t.getId());
        System.out.println("The name of the thread t is " + t.getName());

    }
}
