interface Bicycle{
    int a = 45;
    void applyBreak(int decrement);
    void speedup(int increment);
}
class AvonCycle implements Bicycle{
    void blowHorn(){
        System.out.println("Pee Pee Pee Poo");
    }
    public void applyBreak(int decrement){
        System.out.println("Applying Break");
    }
    public void speedup(int increment){
        System.out.println("Applying SpeedUp");
    }
}
public class JAVA_INTERFACE {
    public static void main(String[] args) {
      AvonCycle cyclePrathamesh = new AvonCycle();
      cyclePrathamesh.applyBreak(2);
      //You can Create the properties in interface
        System.out.println(cyclePrathamesh.a);
    }
}
